/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author hasee
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the earlist model year. (Press enter to skip)");
        Scanner s = new Scanner(System.in);
        String num = s.next();           
        System.out.println(num);

        //String num2 = s.next();
        if ((num.nextLine()).isEmpty()){
           System.out.println("no input");
        }
        else 
            System.out.println("has input");
        System.out.println("Please enter the model. (Press enter to skip)");

    }
    
}
