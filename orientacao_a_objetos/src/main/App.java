package main;
import java.util.Locale;
import java.util.Scanner;

import triangle.Triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Enter the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX, areaY;
        areaX = x.calcArea();
        areaY = y.calcArea();

        if(areaX > areaY) {
            System.out.println("*Triangle X has a larger area*");
            System.out.printf("Area triangle X > %.4f", areaX);
            System.out.printf("\nArea triangle Y > %.4f", areaY);
        } 
        else {
            System.out.println("*Triangle Y has a larger area*");
            System.out.printf("Area triangle Y > %.4f", areaY);
            System.out.printf("\nArea triangle X > %.4f", areaX);
        }

        sc.close();
    }
}
