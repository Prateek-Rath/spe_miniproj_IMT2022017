package org1.example1;

import java.util.Scanner;

public class App {
    //sqrt, factorial, natural log and power

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        while(true){
            calc.printMenuOptions(); // Create a Scanner object
            System.out.print("Enter option: ");
            int option =  sc.nextInt();
            if(option == calc.SQRT){
                System.out.println("Enter the number: ");
                double val = sc.nextDouble();
                double result = calc.sqrt(val);
                System.out.printf("Your result is %f\n", result);
            }
            else if(option == calc.FACTORIAL){
                System.out.println("Enter a non negative integer: ");
                int val = sc.nextInt();
                int result = calc.factorial(val);
                System.out.printf("Your result is %d\n", result);
            }
            else if(option == calc.NATURAL_LOG){
                System.out.println("Enter the number: ");
                double val = sc.nextDouble();
                double result = calc.natural_log(val);
                System.out.printf("Your result is %f\n", result);
            }
            else if(option == calc.POWER){
                System.out.println("Enter the base: ");
                double base = sc.nextDouble();
                System.out.println("Enter the exponent: ");
                double exponent = sc.nextDouble();
                double result = calc.power(base ,exponent);
                System.out.printf("Your result is %f\n", result);
            }
            else{
                break;
            }
            System.out.println("------------------------------\n");

        }
        sc.close();

    }
}
