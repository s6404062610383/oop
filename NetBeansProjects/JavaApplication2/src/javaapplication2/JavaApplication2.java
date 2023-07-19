/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("rows : ");
        int rows = scanner1.nextInt();
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("colums : ");
        int colums = scanner2.nextInt();
        
       for(int i=1; i<=rows; i++){
            for(int j = 1; j<= colums; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
    
}
