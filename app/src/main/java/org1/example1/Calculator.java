package org1.example1;

import java.util.HashMap;


//added a comment simply
//one more try
//check this out

class Calculator{
    public HashMap<Integer, String> options;
    public int SQRT = 1;
    public int FACTORIAL = 2;
    public int NATURAL_LOG = 3;
    public int POWER = 4;
    public Calculator(){
        options = new HashMap<>();
        this.options.put(SQRT, "sqrt");
        this.options.put(FACTORIAL, "factorial");
        this.options.put(NATURAL_LOG, "natural_log");
        this.options.put(POWER, "power");
    }
    public double sqrt(double x){
        return Math.sqrt(x);
    }

    public int factorial(int x){
        int ans = 1;
        for(int i=1; i<=x; i++){
            ans *= i;
        }
        return ans;
    }

    public double natural_log(double a){
        return Math.log(a);
    }

    public double power(double a, double b){
        return Math.pow(a, b);
    }
    public void printMenuOptions() {
        System.out.println("Enter one of the numbers below to continue.\nPress any other number to exit");
        for (Integer key : this.options.keySet()) {
            String value = this.options.get(key);
            System.out.printf("%d %s\n", key, value);
        }
        System.out.print("\n");
    }
}
