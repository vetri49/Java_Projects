package com.simplilearn.GeoMetrics;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalculatesArea {

    static List<String> Area = new ArrayList<>();

    public static void main(String[] args) {
        CalculatesArea calc = new CalculatesArea();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How many times you want to iterate the loop?");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            try {
            	System.out.println("Available shapes to calculate the area: Circle, Rectangle, Triangle, Sqauare.");
                System.out.println("Enter the shape");
                String shape = sc.nextLine();
                calc.calculateArea(shape, sc);
            } catch (NoSuchElementException e) {
                e.printStackTrace();
            }
        }

        for(String list:Area) {
        	System.out.println(list);
        }
        sc.close(); 
    }

    public void calculateArea(String input, Scanner sc) {
        switch (input.toLowerCase()) {
            case "circle":
                System.out.println("Enter the Circle's radius");
                int rad = sc.nextInt();
                sc.nextLine();
                double areaofCircle = 3.14 * rad * rad;
                Area.add("Area of " + input + " is " + areaofCircle + " Square Meter.");
                break;
            case "square":
                System.out.println("Enter the Square's side");
                int side = sc.nextInt();
                sc.nextLine();
                int areaofSquare = side * side;
                Area.add("Area of " + input + " is " + areaofSquare + " Square Meter.");
                break;
            case "triangle":
                System.out.println("Enter the Triangle's base and height.");
                int base = sc.nextInt();
                sc.nextLine();
                int height = sc.nextInt();
                sc.nextLine();
                double areaofTriangle = 0.5 * base * height;
                Area.add("Area of " + input + " is " + areaofTriangle + " Square Meter.");
                break;
            case "rectangle":
                System.out.println("Enter the Rectangle's length and breadth");
                int length = sc.nextInt();
                sc.nextLine();
                int breadth = sc.nextInt();
                sc.nextLine();
                int areaofRectangle = length * breadth;
                Area.add("Area of " + input + " is " + areaofRectangle + " Square Meter.");
                break;
            default:
                System.out.println("Shape not recognized.Enter a valid Shape");
                break;
        }
    }
}
