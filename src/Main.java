/*Your 6 year old client needs an application that will receive an integer from the user banging on the keyboard,
add 5 to it, double it, subtract 7 from it, and display the result to the screen.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int finalResult;
        System.out.println("please eneter a number: ");
        Scanner keyboard = new Scanner(System.in);
        int myAnswer = keyboard.nextInt();

        finalResult = ((myAnswer + 5)*2)-7;
        System.out.println("the final result is: " + finalResult);


    }
}
