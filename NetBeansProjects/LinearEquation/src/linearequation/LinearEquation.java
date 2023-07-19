/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearequation;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class LinearEquation {
    private double a,b,c,d,e,f;
    public LinearEquation(double a,double b,double c,double d,double e,double f){
    /**
     * @param args the command line arguments
     */
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getD(){
        return d;
    }
    public double getE(){
        return d;
    }
    public double getF(){
        return d;
    }
    public boolean isSolvable(){
        return (a*d-b*c)!=0;
    }
    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY(){
        return (a*f-e*c)/(a*d-b*c); 
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a b c d e f : ");
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        
        LinearEquation equation = new LinearEquation(a,b,c,d,e,f);
        if(equation.isSolvable()){
            double x = equation.getX();
            double y = equation.getY();
            System.out.println("x is "+ x +",y is "+y);     
        }
        else{
            System.out.println("The equation has no solution");
        }
    }
    
}
