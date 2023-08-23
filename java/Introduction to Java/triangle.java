import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("x1,y1 : ");
        double x1 = inputScanner.nextDouble();
        double y1 = inputScanner.nextDouble();
        
        System.out.print("x2,y2 : ");
        double x2 = inputScanner.nextDouble();
        double y2 = inputScanner.nextDouble();
    
        System.out.print("x3,y3 : ");
        double x3 = inputScanner.nextDouble();
        double y3 = inputScanner.nextDouble();
        
      
        double calculate = 0.5 *Math.abs((x1*(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2)));
        System.out.println("The area of the triangle :"+ calculate);
    }
}
