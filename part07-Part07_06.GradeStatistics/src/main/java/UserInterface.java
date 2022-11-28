/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reed
 */

import java.util.Scanner;

public class UserInterface {
    
    // Instance and Class variables
    private Scanner scanner;
    private GradesContainer container;

    public UserInterface(Scanner scanner, GradesContainer container) {
        this.scanner = scanner;
        this.container = container;
    }

    // Method to start the program
    public void start() {
        readPoints();
        System.out.println("");
        printAverageAll();
        printAveragePassing();
        printPassingPercentage();
        printGradeDistribution();

    }

    // Method to read and store the points input
    public void readPoints() {

        System.out.println("Enter points totals, -1 stops:");

        while (true) {

            String input = scanner.nextLine();

            int points = Integer.valueOf(input);

            // Stop input if the value of the input points is -1
            if (points == -1) {
                break;
            }

            // Exclude points less than zero or greater than 100
            if (points < 0 || points > 100) {
                continue;
            }

            this.container.addPoints(points);

        }
    }

    // Print the average of all points
    public void printAverageAll() {
        System.out.println("Point average (all): " + container.averageOfPointsAll());
    }

    // Print the average of passing points
    public void printAveragePassing() {

        String nonePassing = "-";

        if (container.averageOfPassingPoints() == 0.00) {
            System.out.println("Point average (passing): " + nonePassing);
        } else {
            System.out.println("Point average (passing): " + container.averageOfPassingPoints());
        }
    }

    // Print the percentage of points that are passing out of the total
    public void printPassingPercentage() {
        System.out.println("Pass percentage: " + container.passPercentage());
    }

    // Print the grade distribution using stars to represent numbers of grades
    public void printGradeDistribution() {

        System.out.println("Grade distribution:");

        int grade = 5;

        while (grade >= 0) {
            int stars = container.totalGradesFromPoints(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade--;
        }

    }

    // Print the number of stars for total number of grades horizontally
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
}
