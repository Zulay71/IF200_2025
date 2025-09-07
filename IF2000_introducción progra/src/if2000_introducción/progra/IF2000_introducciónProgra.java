/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2000_introducción.progra;
import domain.Person;
import domain.SavingAccount;
import logic.Ejercicios_Semana2_PracticaEnClase;
import logic.Lab1_ejercicios;
import logic.Lab2_Ejercicios;

/**
 *
 * @author luzma
 */
public class IF2000_introducciónProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
    
    System.out.println("----------Eejercicio A-----------------");
    Ejercicios_Semana2_PracticaEnClase eje = new Ejercicios_Semana2_PracticaEnClase();
    eje.ejercicioA(5);
        
   System.out.println("----------Ejercicio B------------------");
   eje.ejercicioB(12);
   
   System.out.println("----------Ejercicio C------------------");
   eje.ejercicioC();
   
   System.out.println("----------Ejercicio D------------------");
   eje.ejercicioD();
   
   System.out.println(" ");
   
   System.out.println("----------Ejercicio E------------------");
   eje.ejercicioE();
    
   System.out.println("----------Ejercicio F------------------");
   eje.ejercicioF();
    
   System.out.println(" ");
   System.out.println("-----------Lab1_Ejercicios-------------");
   System.out.println(" ");
   System.out.println("----------- Ejercicio 1 ---------------- ");
   Lab1_ejercicios lab = new Lab1_ejercicios();
    lab.ejercicio1();
    
    System.out.println("----------- Ejercicio 2 ---------------- ");
    lab.ejercicio2 ();
   
   System.out.println("----------- Ejercicio 3 ---------------- ");
    lab.ejercicio3 ();
    
    System.out.println("----------- Ejercicio4  ---------------- ");
    lab.ejercicio4 ();
     
    System.out.println(" ");
    System.out.println("----------- Ejercicio 5  ---------------- ");
    lab.ejercicio5 ();
    
    System.out.println("----------- Ejercicio 6  ---------------- ");
    lab.ejercicio6 ();
    
    System.out.println("----------- Ejercicio 7  ---------------- ");
    lab.ejercicio7 ();
    
    System.out.println("----------- Ejercicio 8  ---------------- ");
    lab.ejercicio8 ();
    
    System.out.println("----------- Ejercicio 9  ---------------- ");
    lab.ejercicio9 ();
    
    System.out.println("----------- Ejercicio 10  ---------------- ");
    lab.ejercicio10 ();
    
    System.out.println("----------- Ejercicio 11  ---------------- ");
    lab.ejercicio11 ();
    
    System.out.println(" ");
    System.out.println("----------- Ejercicio 12  ---------------- ");
    lab.ejercicio12 ();
    
   System.out.println(" ");
   System.out.println("-----------Lab2_Ejercicios----------------");
   
   System.out.println("----------- Ejercicio 13  ---------------- ");
   Lab2_Ejercicios lab2 = new Lab2_Ejercicios();
   lab2.ejercicio13();
   
   System.out.println("----------- Ejercicio 14  ---------------- ");
   lab2.ejercicio14();
   
    System.out.println("----------- Ejercicio 15  ---------------- ");
    lab2.ejercicio15();
    
    System.out.println("----------- Ejercicio 16  ---------------- ");
    lab2.ejercicio16();
    
    System.out.println("----------- Ejercicio 17  ---------------- ");
    lab2.ejercicio17();
    
    System.out.println("----------- Ejercicio 18  ---------------- ");
    lab2.ejercicio18();
    
    System.out.println(" ");
    System.out.println("----------- Ejercicio 19  ---------------- ");
    lab2.ejercicio19();
    
    System.out.println("----------- Ejercicio 20  ---------------- ");
    lab2.ejercicio20();
    
    System.out.println("----------- Ejercicio 21  ---------------- ");
    lab2.ejercicio21();
    
    System.out.println("----------- Ejercicio 22  ---------------- ");
    lab2.ejercicio22();
    
    System.out.println("----------- Ejercicio 23  ---------------- ");
    lab2.ejercicio23();
    
    System.out.println("----------- Ejercicio 24  ---------------- ");
    lab2.ejercicio24();
    
    System.out.println("----------- Ejercicio 25  ---------------- ");
    lab2.ejercicio25();
    
    System.out.println("----------- Ejercicio 26  ---------------- ");
    lab2.ejercicio26();
    
     System.out.println("----------- Ejercicio 27 ---------------- ");
    lab2.ejercicio27();
    
    
   System.out.println(" ");
   System.out.println("----------Piramide quiz 2--------------");
   // Crear instancia de la clase y llamar al método de pirámide  
    Ejercicios_Semana2_PracticaEnClase ej;
    ej = new Ejercicios_Semana2_PracticaEnClase();
    ej.quiz2_B_piramide (5);   
   

// TODO code application logic here
 
    Person client1 = 
    new Person("Edgardo", "Corrales", "1-2323-4545", "45456789" , 18);
    
    SavingAccount account1 =
    new SavingAccount("2025-09-04", 12, 5, "1000567801", 25000, client1);
    
    //Simulation of deposit of 3000colones in the account
    account1.deposit(3000);
    
    System.out.println(account1.toString());
    
    System.out.println("\n\n\n-------------------------------------------------");
    System.out.println("Withdraw of money");
    System.out.println("-------------------------------------------------\n\n");
    
    account1.withdraw(16000);
    
    System.out.println(account1.toString());
    
        //Data types
        String name = "Lionel";
        int age = 40;
        System.out.println("-----------Ejemplo-------------");
        System.out.println ("Hello World");
        System.out.println ("Name:"+ name);
        System.out.println ("Age:"+ age);
        
        //Python:
        //print('Hola Mundo')
        
        /*Tipos de datos numéricos
        int, long, short, float, double, numeric, money, decimal
        
        Manejo de flechas:
        Date
        
        Cadenass de caracteres:
        String, char
        
        Obejectos:
        Object
        
        Data Structures:
        Arrays or Vectors: int[] x;
                           int[][] y;
        
        
        True/False:
        boolean
        
        */
     
        
    }
    
}
