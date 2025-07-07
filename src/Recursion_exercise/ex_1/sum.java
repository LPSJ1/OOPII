package Recursion_exercise.ex_1;

public class sum {
    public static int sumRecursive(int n) {

        if (n==1) {
            return 1;
        } else {
            System.out.println("sum("+ n +" +sum(" + (n - 1) + ")");
            return n + sumRecursive(n-1);
        }
        }
    
    public static void main(String[]args) {
        int result = sumRecursive(5);
        System.out.println("Sum:"+ result);
    }

}