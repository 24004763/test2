/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dyondzekan.test2;
import java.util.Scanner;
/**
 *
 * @author Dyondzekan
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner tale = new Scanner(System.in);
        /* write a program that will add two binary numbers
        this program must take input from the user and print result on the screen
        */
        System.out.println("Enter the first number: ");
        double f1 = tale.nextDouble();
        System.out.println("Enter the second number: ");
        double f2 = tale.nextDouble();
        double sum = f1 + f2;
        System.out.println("The answer is " + sum);
        System.out.println("Have a good day.Goodbye!");
    }
}
