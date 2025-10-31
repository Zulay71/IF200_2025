/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author luzma
 */
public class QuizPersonRegistration {

    private static final String FILE_NAME = "people.txt";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static String readNonEmpty(Scanner sc, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Error: cannot be empty. Try again.");
            }
        } while (input.isEmpty());
        return input;
    }

    public static int readPositiveInteger(Scanner sc, String prompt) {
        int value = -1;
        do {
            System.out.print(prompt);
            String line = sc.nextLine().trim();
            try {
                value = Integer.parseInt(line);
                if (value <= 0) {
                    System.out.println("Error: must be a positive integer. Try again.");
                    value = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: input is not a valid integer. Try again.");
            }
        } while (value <= 0);
        return value;
    }

    public static String readValidEmail(Scanner sc, String prompt) {
        String email;
        do {
            System.out.print(prompt);
            email = sc.nextLine().trim();
            if (email.isEmpty() || !email.contains("@")) {
                System.out.println("Error: invalid email (must contain '@'). Try again.");
                email = "";
            }
        } while (email.isEmpty());
        return email;
    }

    public static String readValidPhone(Scanner sc, String prompt) {
        String phone;
        do {
            System.out.print(prompt);
            phone = sc.nextLine().trim();
            if (phone.length() < 8 || !phone.matches("\\d+")) {
                System.out.println("Error: phone must contain only digits and at least 8 characters. Try again.");
                phone = "";
            }
        } while (phone.isEmpty());
        return phone;
    }

    public static void saveLine(String line) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
            out.println(line);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static String buildLine(String name, String id, int age, String email, String phone) {
        String dateTime = LocalDateTime.now().format(DATE_FORMAT);
        return String.format("%s|%s|%d|%s|%s|%s", name, id, age, email, phone, dateTime);
    }
}
