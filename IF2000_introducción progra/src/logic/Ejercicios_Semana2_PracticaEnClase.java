/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
/**
 *
 * @author luzma
 */
public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }
 
 public void quiz2_B_piramide(int n){
 
for (int i = 1; i <= n ; i++) {
//controla los espaios vacios
 for (int j = 1; j <= (n - i) ; j++){
  System.out.print(" ");
 }//endForInterno_A
 //controla los *s de la piramide
 for (int k = 1; k <= (2 * i - 1); k++){
  System.out.print("*");
 }//endForInterno B
 System.out.println();
 }//endForExterno  
 }//endMetodo
 
 public void ejercicioA(int n){
 for (int i = 1; i <= n; i++) {
 for (int j = 1; j <= n; j++) {
 // Imprimir * en los bordes
 if (i == 1 || i == n || j == 1 || j == n) {
 System.out.print("*");
 } else {
System.out.print(" ");
}
}
System.out.println();     
}     
}
public void ejercicioB(int n){

 for (int i = 12; i >= 1; i--) {
 for (int j = 1; j <= i; j++) {
 System.out.print("*");
 }
System.out.println();
} 
}

public void ejercicioC(){
int n = 10;
    
 for (int i = n; i >= 1; i--) {
 for (int j = 0; j < n - i; j++) {
 System.out.print(" ");
 }
 for (int k = 0; k < i; k++) {
 System.out.print("*");
 }
 System.out.println();
}
}
public void ejercicioD(){
    
Scanner sc = new Scanner(System.in);
int[] numeros = new int[10];

System.out.println("Ingrese 10 numeros enteros:");
for (int i = 0; i < 10; i++) {
System.out.print("Numero " + (i + 1) + ": ");
numeros[i] = sc.nextInt();
}
Arrays.sort(numeros);

System.out.println("\nArreglo ordenado ascendentemente:");
for (int num : numeros) {
System.out.print(num + " ");
}  
}
public void ejercicioE() {
 
Integer[] numeros = new Integer[100];
 Random rand = new Random();

 // Generar 100 números aleatorios  
 for (int i = 0; i < 100; i++) {
 numeros[i] = rand.nextInt(1000) + 1;
 }

// Ordenar descendentemente
Arrays.sort(numeros, Collections.reverseOrder());

// Imprimir el arreglo ordenado
System.out.println("Arreglo ordenado descendentemente:");
for (int i = 0; i < numeros.length; i++) {
System.out.print(numeros[i] + " ");
if ((i + 1) % 10 == 0) {
System.out.println(); 
}
}
}
public void ejercicioF(){
char[][] tablero = new char[8][8];
for (int i = 0; i < 8; i++)
for (int j = 0; j < 8; j++)
tablero[i][j] = ' ';

 for (int i = 0; i < 3; i++)
 for (int j = 0; j < 8; j++)
 if ((i + j) % 2 == 1) tablero[i][j] = 'N';

for (int i = 5; i < 8; i++)
for (int j = 0; j < 8; j++)
if ((i + j) % 2 == 1) tablero[i][j] = 'R';

System.out.println("\nTablero");
System.out.print("  ");
        for (int i = 1; i <= 8; i++) System.out.print(i + " ");
System.out.println();

for (int i = 0; i < 8; i++) {
System.out.print((char)('A'+i) + " ");
for (int j = 0; j < 8; j++) System.out.print(tablero[i][j] + " ");
System.out.println();
}

}

}




