/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("x1,y1 : ");
        double x1 = scanner1.nextDouble();
        double y1 = scanner1.nextDouble();
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("x2,y2 : ");
        double x2 = scanner2.nextDouble();
        double y2 = scanner2.nextDouble();
        
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("x3,y3 : ");
        double x3 = scanner3.nextDouble();
        double y3 = scanner3.nextDouble();
        
      
        double calculate = 0.5 *Math.abs((x1*(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2)));
        System.out.println("The area of the triangle :"+calculate);
        
        
    }
    
}
