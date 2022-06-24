/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author fahim
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        double x, y;
        Calculations c = new Calculations();
        while (true) {
            System.out.println("Operations:");
            System.out.print("\n1.Summation\n2.Subtraction\n3.Multiplication\n4.Division\n5.Root\n6.Modulas");
            System.out.print("\n7.Max value\n8.Min value\n9.Sine OP\n10.Cosine OP\n11.Exit");
            
            System.out.print("\n\nEnter your choice: ");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("\nEnter value of x and y: ");
                    x = s.nextDouble();
                    y = s.nextDouble();
                    c.sum(x, y);
                    break;
                case 2:
                    System.out.print("\nEnter value of x and y: ");
                    x = s.nextDouble();
                    y = s.nextDouble();
                    c.sub(x, y);
                    break;
                case 3:
                    System.out.print("\nEnter value of x and y: ");
                    x = s.nextDouble();
                    y = s.nextDouble();
                    c.mult(x, y);
                    break;
                case 4:
                    System.out.print("\nEnter value of x and y: ");
                    x = s.nextDouble();
                    y = s.nextDouble();
                    c.div(x, y);
                    break;
                case 5:
                    System.out.print("\nEnter value of x: ");
                    x = s.nextDouble();
                    c.root(x);
                    break;
                case 6:
                    System.out.print("\nEnter value of x and y: ");
                    x = s.nextDouble();
                    y = s.nextDouble();
                    c.mod(x, y);
                    break;
                case 7:
                    System.out.print("\nEnter value of x and y: ");
                    x = s.nextDouble();
                    y = s.nextDouble();
                    c.max(x, y);
                    break;
                case 8:
                    System.out.print("\nEnter value of x and y: ");
                    x = s.nextDouble();
                    y = s.nextDouble();
                    c.min(x, y);
                    break;
                case 9:
                    System.out.print("\nEnter value of x: ");
                    x = s.nextDouble();
                    c.sin(x);
                    break;
                case 10:
                    System.out.print("\nEnter value of x: ");
                    x = s.nextDouble();
                    c.cos(x);
                    break;
                case 11:
                    exit(0);
            }

        }
    
    }
    
}
