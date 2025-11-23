/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author luzma
 */
public class Practice_1 {

    public void exercise28() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the date (day/month/year): ");
        String[] parts = sc.nextLine().split("/");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        LocalDate date = LocalDate.of(year, month, day);

        String monthName = date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        int daysInMonth = date.lengthOfMonth();

        System.out.println(day + " of " + monthName + " of " + year);
        System.out.println("Number of days in the month: " + daysInMonth);
    }

    public void exercise29() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number (positive): ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number (positive): ");
        int num2 = sc.nextInt();

        int product = 0;

        for (int i = 1; i <= num2; i++) {
            product += num1;
        }

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }

    public void exercise30() {

        for (int i = 1; i <= 12; i++) {
            System.out.println("Table of " + i + ":");

            for (int j = 1; j <= 12; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }

            System.out.println();
        }
    }

    public void exercise31() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend (positive): ");
        int dividend = sc.nextInt();

        System.out.print("Enter the divisor (positive, not 0): ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Error: division by 0 is not defined.");
        } else {
            int quotient = 0;
            int remainder = dividend;

            while (remainder >= divisor) {
                remainder -= divisor;
                quotient++;
            }

            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
    }

    public void exercise32() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numStudents; i++) {
            System.out.println("\nStudent #" + i);

            System.out.print("Student name: ");
            String name = sc.nextLine();

            System.out.print("Exam grade (0-100): ");
            double exam = sc.nextDouble();

            System.out.print("Project grade (0-100): ");
            double project = sc.nextDouble();

            System.out.print("Practice/participation grade (0-100): ");
            double practice = sc.nextDouble();
            sc.nextLine();

            double finalGrade = exam * 0.5 + project * 0.3 + practice * 0.2;

            System.out.println("Name: " + name);
            System.out.println("Final grade: " + finalGrade);
        }

        System.out.println("\nFinal grade calculation completed.");
    }

    public void exercise33() {

        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        double grade;

        System.out.println("Enter the students' grades (enter -99 to finish):");

        while (true) {
            System.out.print("Grade: ");
            grade = sc.nextDouble();

            if (grade == -99) {
                break;
            }

            sum += grade;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("The average grade is: " + average);
        } else {
            System.out.println("No grades were entered.");
        }
    }

    public void exercise34() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of numbers to sum: ");
        int amount = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= amount; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }

        System.out.println("The sum of the " + amount + " numbers is: " + sum);
    }

    public void exercise35() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int central = a + b + c - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));

        System.out.println("The middle number is: " + central);
    }

    public void exercise36() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();

        boolean found = false;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("The first vowel is: " + letter);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No vowel was found in the word.");
        }
    }

    public void exercise37() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (letter >= 'a' && letter <= 'z' && "aeiou".indexOf(letter) == -1) {
                count++;
            }
        }

        System.out.println("The number of consonants is: " + count);
    }

    public void exercise38() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = sc.nextInt();

        if (denominator == 0) {
            System.out.println("Error: division by zero is not defined.");
        } else {
            int a = numerator;
            int b = denominator;

            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }

            int simplifiedNumerator = numerator / a;
            int simplifiedDenominator = denominator / a;

            System.out.println("The simplified fraction is: " + simplifiedNumerator + "/" + simplifiedDenominator);
        }
    }

    public void exercise39() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public void exercise40() {

        Scanner sc = new Scanner(System.in);

        int days = 0, errors = 0;
        int globalMax, globalMin;

        System.out.print("Enter maximum temperature (or -100 to exit): ");
        int tMax = sc.nextInt();
        System.out.print("Enter minimum temperature (or -100 to exit): ");
        int tMin = sc.nextInt();

        if (tMax == -100 && tMin == -100) {
            System.out.println("No data entered.");
            return;
        }

        globalMax = tMax;
        globalMin = tMin;

        while (!(tMax == -100 && tMin == -100)) {
            if (tMax == 9 || tMin == 9 || tMin > tMax) {
                System.out.println("Error in data for this day.");
                errors++;
            } else {
                days++;
                if (tMax > globalMax) {
                    globalMax = tMax;
                }
                if (tMin < globalMin) {
                    globalMin = tMin;
                }
            }

            System.out.print("Enter maximum temperature (or -100 to exit): ");
            tMax = sc.nextInt();
            System.out.print("Enter minimum temperature (or -100 to exit): ");
            tMin = sc.nextInt();
        }

        System.out.println("\n--- Results ---");
        System.out.println("Valid days: " + days);
        System.out.println("Global maximum temperature: " + globalMax);
        System.out.println("Global minimum temperature: " + globalMin);
        System.out.println("Errors: " + errors);

        int total = days + errors;
        if (total > 0) {
            double errorPercentage = (errors * 100.0) / total;
            System.out.println("Error percentage: " + errorPercentage + "%");
        } else {
            System.out.println("No valid temperatures entered.");
        }
    }

    public void exercise41() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number must be positive.");
            return;
        }

        System.out.println("The divisors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
