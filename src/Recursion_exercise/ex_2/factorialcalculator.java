package Recursion_exercise.ex_2;

public class factorialcalculator {
    public static int factorial(int n){

        if (n==0 || n==1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    
    public static void main(String[] args) {
        int result=factorial(5);
        System.out.println("Factorial of 5 is:"+ result);
    }
}
