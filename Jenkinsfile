pipeline {
    agent any

    environment {
        // Set these via Jenkins > Manage Jenkins > Credentials
        DOCKERHUB_CREDENTIALS = credentials('dockerhub_credentials')  // ID from Jenkins credentials
        DOCKER_IMAGE = "pratster20/miniproj_image1"
        DOCKER_TAG = "1.0"
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Prateek-Rath/spe_miniproj_IMT2022017.git'
            }
        }
	stage('Test') {
	    steps {
		sh './gradlew test'
	    }
	}
	
	stage('Build JAR') {
	    steps {
		sh './gradlew clean build'
	    }
	}


        stage('Build Docker Image') {
            steps {
                sh """
                docker build -t $DOCKER_IMAGE:$DOCKER_TAG -f dockerfile1 .
                """
            }
        }

        stage('Push Docker Image') {
            steps {
                sh """
                echo "$DOCKERHUB_CREDENTIALS_PSW" | docker login -u "$DOCKERHUB_CREDENTIALS_USR" --password-stdin
                docker push $DOCKER_IMAGE:$DOCKER_TAG
                docker logout
                """
            }
        }

        stage('Deploy with Ansible') {
            steps {
                sh """
                ansible-playbook -i app/infra/hosts app/infra/deploy.yml
                """
            }
        }
    }

    post {
	always {cleanWs()}
        
	success {
            echo "Build and deployment completed successfully!"
	    emailext(
		to: 'prateekrath2023@gmail.com',
		subject: 'Build Update',
		body: 'Build finished successfully.'
	    )

        }
        failure {
            echo "Build or deployment failed. Check logs above."
	    emailext(
		to: 'prateekrath2023@gmail.com',
		subject: 'Build Update',
		body: 'Build finished, but failed.'
	    )

        }
    }
    //remember to put app pwd in jenkins
}
