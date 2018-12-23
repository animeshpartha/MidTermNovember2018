package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int n = 5;          //Iteration
        int result = 1;
        for(int i = 1; i <= n; i++){
            result =result*i;
        }
        System.out.println("This Factorial of 5 Iteration method is: " +result);   //Iteration
        System.out.println("This Factorial of 5 Recursion method is: " + facrtoirial(5));   //Recursion
    }
    public static int facrtoirial(int n){

        if (n==0){
            return 1;
        }else{
            return n * facrtoirial(n-1);
        }
    }
}


