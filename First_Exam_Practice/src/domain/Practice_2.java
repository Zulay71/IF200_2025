/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Scanner;

/**
 *
 * @author luzma
 */
public class Practice_2 {

    public void exercise42() {

        System.out.println("Perfect numbers less than 1000:");

        for (int n = 2; n < 1000; n++) {
            int sumDivisors = 0;

            for (int d = 1; d <= n / 2; d++) {
                if (n % d == 0) {
                    sumDivisors += d;
                }
            }

            if (sumDivisors == n) {
                System.out.println(n);
            }
        }
    }

    public void exercise43() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = sc.nextInt();

        number = Math.abs(number);

        if (number <= 9) {
            System.out.println("The number has 1 digit");
        } else if (number <= 99) {
            System.out.println("The number has 2 digits");
        } else if (number <= 999) {
            System.out.println("The number has 3 digits");
        } else {
            System.out.println("The number has more than 3 digits.");
        }
    }

    public void exercise44() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (1-3000): ");
        int n = sc.nextInt();
        String roman = "";

        while (n >= 1000) {
            roman += "M";
            n -= 1000;
        }
        while (n >= 900) {
            roman += "CM";
            n -= 900;
        }
        while (n >= 500) {
            roman += "D";
            n -= 500;
        }
        while (n >= 400) {
            roman += "CD";
            n -= 400;
        }
        while (n >= 100) {
            roman += "C";
            n -= 100;
        }
        while (n >= 90) {
            roman += "XC";
            n -= 90;
        }
        while (n >= 50) {
            roman += "L";
            n -= 50;
        }
        while (n >= 40) {
            roman += "XL";
            n -= 40;
        }
        while (n >= 10) {
            roman += "X";
            n -= 10;
        }
        while (n >= 9) {
            roman += "IX";
            n -= 9;
        }
        while (n >= 5) {
            roman += "V";
            n -= 5;
        }
        while (n >= 4) {
            roman += "IV";
            n -= 4;
        }
        while (n >= 1) {
            roman += "I";
            n -= 1;
        }

        System.out.println("Roman number: " + roman);
    }

    public void exercise45() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the angle in radians: ");
        double x = sc.nextDouble();

        double sine = x;
        double term = x;

        for (int i = 1; i < 17; i++) {
            int n = 2 * i + 1;
            term = -term * x * x / ((n - 1) * n);
            sine += term;
        }

        System.out.println("Approximate sine: " + sine);
    }

    public void exercise46() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int a1 = 1, a2 = 2, an = 0;

        if (n == 1) {
            an = a1;
        } else if (n == 2) {
            an = a2;
        } else {
            for (int i = 3; i <= n; i++) {
                an = a1 + a2;
                a1 = a2;
                a2 = an;
            }
        }

        System.out.println("A" + n + " = " + an);
    }

    public void exercise47() {

        Scanner sc = new Scanner(System.in);
        int floor = 1;
        String option;

        System.out.println("Elevator Simulator (25 floors)");
        System.out.println("The elevator starts on floor 1");

        while (true) {
            System.out.println("\nCurrent floor: " + floor);
            System.out.print("Enter 'U' to go up, 'D' to go down, or 'E' to exit: ");
            option = sc.next();

            if (option.equalsIgnoreCase("E")) {
                break;
            } else if (option.equalsIgnoreCase("U")) {
                if (floor < 25) {
                    floor++;
                } else {
                    System.out.println("Cannot go up, already on the top floor.");
                }
            } else if (option.equalsIgnoreCase("D")) {
                if (floor > 1) {
                    floor--;
                } else {
                    System.out.println("Cannot go down, already on the first floor.");
                }
            } else {
                System.out.println("Invalid option");
            }
        }

        System.out.println("\nSimulation ended. The elevator stopped on floor " + floor);
    }

    public void exercise48() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int daysInMonth;
        if (month == 2) {
            daysInMonth = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
        }

        day++;
        if (day > daysInMonth) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.println("Next date: " + day + "/" + month + "/" + year);
    }

    public void exercise49() {

        Scanner sc = new Scanner(System.in);
        String continueInput = "Y";

        while (continueInput.equalsIgnoreCase("Y")) {

            System.out.print("Employee number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee name: ");
            String name = sc.nextLine();

            System.out.print("Hours worked: ");
            double hours = sc.nextDouble();

            System.out.print("Hourly wage: ");
            double hourlyWage = sc.nextDouble();
            sc.nextLine();

            double grossSalary;
            if (hours <= 40) {
                grossSalary = hours * hourlyWage;
            } else {
                double overtime = hours - 40;
                grossSalary = 40 * hourlyWage + overtime * hourlyWage * 1.5;
            }

            double socialSecurity = grossSalary * 0.09;

            System.out.print("Belongs to the union? (Y/N): ");
            String union = sc.nextLine();
            double unionDeduction = 0;
            if (union.equalsIgnoreCase("Y")) {
                unionDeduction = grossSalary * 0.03;
            }

            double totalDeductions = socialSecurity + unionDeduction;
            double netSalary = grossSalary - totalDeductions;

            System.out.println("\n--- Pay Stub ---");
            System.out.println("Employee number: " + number);
            System.out.println("Name: " + name);
            System.out.println("Gross salary: $" + grossSalary);
            System.out.println("Deductions: $" + totalDeductions);
            System.out.println("Net salary: $" + netSalary);
            System.out.println("------------------------\n");

            System.out.print("Do you want to calculate another employee? (Y/N): ");
            continueInput = sc.nextLine();
            System.out.println();
        }

        System.out.println("Program finished.");
    }

    public void exercise50() {

        Scanner sc = new Scanner(System.in);
        String continueInput = "Y";

        while (continueInput.equalsIgnoreCase("Y")) {

            System.out.print("Employee name: ");
            String name = sc.nextLine();

            System.out.print("Shift (D = Day, N = Night): ");
            String shift = sc.nextLine();

            System.out.print("Hours worked: ");
            double hours = sc.nextDouble();

            System.out.print("Is it Sunday? (Y/N): ");
            String isSunday = sc.next();
            sc.nextLine();

            double rate;

            if (shift.equalsIgnoreCase("D")) {
                rate = 500;
                if (isSunday.equalsIgnoreCase("Y")) {
                    rate += 200;
                }
            } else {
                rate = 800;
                if (isSunday.equalsIgnoreCase("Y")) {
                    rate += 30;
                }
            }

            double dailyWage = hours * rate;

            System.out.println("\n--- Daily Wage Report ---");
            System.out.println("Employee: " + name);
            System.out.println("Shift: " + (shift.equalsIgnoreCase("D") ? "Day" : "Night"));
            System.out.println("Hours worked: " + hours);
            System.out.println("Final rate per hour: " + rate + " colones");
            System.out.println("Daily wage: " + dailyWage + " colones");
            System.out.println("-------------------------\n");

            System.out.print("Do you want to calculate another employee? (Y/N): ");
            continueInput = sc.nextLine();
        }

        System.out.println("Program finished.");
    }

    public void exercise51() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (0-23): ");
        int hours = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = sc.nextInt();

        System.out.print("Enter seconds (0-59): ");
        int seconds = sc.nextInt();

        seconds++;

        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }

        if (minutes == 60) {
            minutes = 0;
            hours++;
        }

        if (hours == 24) {
            hours = 0;
        }

        System.out.printf("Time one second later: %02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public void exercise52() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (upper limit for x): ");
        int n = sc.nextInt();

        System.out.print("Enter M (upper limit for y): ");
        int M = sc.nextInt();

        int totalSum = 0;

        for (int y = 0; y <= M; y++) {
            for (int x = 1; x <= n; x++) {
                totalSum += 2 * x + (y * y);
            }
        }

        System.out.println("Result of the double sum: " + totalSum);
    }

}
