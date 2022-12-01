package testingCode;

import java.util.Scanner;

public class Fibonacci {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println("fibonacci(" + input + ") is " + fibonacci(input));
    }

    public static int fibonacci(int a){

        if (a <= -1){
            return -1;
        }
        else if(a == 0 || a == 1) {
            return a;
        }
        else {
            return fibonacci(a- 1) + fibonacci(a - 2);
        }

    }
}
