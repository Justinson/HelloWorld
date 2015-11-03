/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.swing.JOptionPane;

/**
 *
 * @author Justinson
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("gg");
//        System.out.println("wp");
//        System.out.println("ez");
        System.out.println("The sum is " + addThreeIntegers(2, 3, 4));
        System.out.println("The sum is " + addTwoDoubles(5, 3));
        System.out.println("The product is " + multiplyTwoIntegers(2, 2));
        System.out.println("The quotient is " + divideTwoIntegers(10, 2));
        System.out.println("The quotient is " + divideTwoDoubles(10.0, 2.0));
//        JOptionPane.showMessageDialog(null,"simon says jump");
//        String showInputDialog = JOptionPane.showInputDialog(null, "Hi?");
//        String gunType = JOptionPane.showInputDialog("What type of gun would you like?");
//        JOptionPane.showMessageDialog(null, gunType);

//        int sum = addTwoNumbers(100, 3041);
//        System.out.println("the real sum is " + sum);
    }

    public static int addTwoNumbers(int number1, int number2) {
        int result = number1 + number2;
//        System.out.println("The result is " + result);
        return result;
    }

    public static int addThreeIntegers(int n1, int n2, int n3) {
        return n1 + n2 + n3;

    }

    public static double addTwoDoubles(double d1, double d2) {
        return d1 + d2;

    }

    public static int multiplyTwoIntegers(int n1, int n2) {
        return n1 * n2;
    }

    public static int divideTwoIntegers(int n1, int n2) {
        return n1 / n2;
    }

    public static double divideTwoDoubles(double d1, double d2) {
        return d1 / d2;
    }

}
