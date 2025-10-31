/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2000_quizpersonregistration;

import Registration.QuizPersonRegistration;
import java.util.Scanner;

/**
 *
 * @author luzma
 */
public class IF2000_QuizPersonRegistration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (Scanner sc = new Scanner(System.in)) {
            String name = QuizPersonRegistration.readNonEmpty(sc, "Enter full name: ");
            String id = QuizPersonRegistration.readNonEmpty(sc, "Enter identification (ID number): ");
            int age = QuizPersonRegistration.readPositiveInteger(sc, "Enter age: ");
            String email = QuizPersonRegistration.readValidEmail(sc, "Enter email address (must contain @): ");
            String phone = QuizPersonRegistration.readValidPhone(sc, "Enter phone number (digits only; at least 8 characters): ");

            String line = QuizPersonRegistration.buildLine(name, id, age, email, phone);
            QuizPersonRegistration.saveLine(line);

            System.out.println("Record saved in people.txt");
        }

    }

}
