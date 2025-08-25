/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author luzma
 */
public class Lab1_ejercicios {

public void ejercicio1(){
 
Scanner sc = new Scanner(System.in);
        
System.out.print("Ingrese un numero entero: ");
int numero = sc.nextInt();

if (numero % 2 == 0) {
System.out.println("El numero " + numero + " es par.");
} else {
System.out.println("El numero " + numero + " es impar.");
}
}
public void ejercicio2(){
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Ingrese un numero: ");
 int numero = sc.nextInt(); 
        
int valorAbsoluto = Math.abs(numero); 

System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);

}
public void ejercicio3(){
int suma = 0;

 System.out.println("Serie: ");
 for (int i = 3; i <= 99; i += 3) {
 System.out.print(i);

 if (i < 99) {
 System.out.print(", ");
 }
 suma += i;
 }
 System.out.println("\n\nLa suma de la serie es: " + suma);
 }
 public void ejercicio4(){
 
 Scanner sc = new Scanner(System.in);
        
  int[] numeros = new int[3];

 System.out.print("Ingrese el primer numero: ");
 numeros[0] = sc.nextInt();

System.out.print("Ingrese el segundo numero: ");
numeros[1] = sc.nextInt();

System.out.print("Ingrese el tercer numero: ");
numeros[2] = sc.nextInt();

Arrays.sort(numeros);

System.out.println("Numeros en orden ascendente:");
for (int num : numeros) {
 System.out.print(num + " ");
 }    
 } 
 public void ejercicio5(){
 
 Scanner sc = new Scanner(System.in);

 System.out.print("Ingrese el primer numero: ");
 int num1 = sc.nextInt();

System.out.print("Ingrese el segundo numero: ");
int num2 = sc.nextInt();

int resultado;

if (num1 == num2) {
resultado = num1 * num2;
} else if (num1 > num2) {
resultado = num1 - num2;
} else {
resultado = num1 + num2;
}
  System.out.println("Resultado: " + resultado);
}
 public void ejercicio6(){
 
 Scanner sc = new Scanner(System.in);
 
 boolean huboDiez = false;
  int nota;

 System.out.println("Ingrese notas del 0 al 10 (escriba -1 para terminar):");

 do {
 nota = sc.nextInt();

 if (nota == 10) {
 huboDiez = true;
 }

 } while (nota != -1);

  if (huboDiez) {
 System.out.println("Si hubo una nota de 10.");
 } else {
 System.out.println("No hubo ninguna nota de 10.");
} 
}
 public void ejercicio7(){
 Scanner sc = new Scanner(System.in);

System.out.print("Ingrese su edad: ");
int edad = sc.nextInt();

System.out.print("Ingrese su sexo (M para masculino, F para femenino): ");
char sexo = sc.next().toUpperCase().charAt(0);

double pulsaciones;

 if (sexo == 'F') {
 pulsaciones = (220 - edad) / 10.0;
 } else if (sexo == 'M') {
  pulsaciones = (210 - edad) / 10.0;
 } else {
 System.out.println("Sexo invalido. Por favor ingrese 'M' o 'F'.");
  return; 
 }

 System.out.println("Numero de pulsaciones por cada 10 segundos: " + pulsaciones);    
 }
 public void ejercicio8 (){
 Scanner sc = new Scanner(System.in);

 System.out.print("Ingrese el salario mensual del trabajador: ");
double salario = sc.nextDouble();

 System.out.print("Ingrese la antiguedad en anios del trabajador: ");
 double antiguedad = sc.nextDouble();

 double porcentaje = 0;

if (antiguedad < 1) {
porcentaje = 0.05;
} else if (antiguedad < 2) {
 porcentaje = 0.07;
} else if (antiguedad < 5) {
 porcentaje = 0.10;
} else if (antiguedad < 10) {
porcentaje = 0.15;
} else {
porcentaje = 0.20;
}

double utilidad = salario * porcentaje;

System.out.println("La utilidad anual que recibe el trabajador es: " + utilidad);   
}
 
 public void ejercicio9(){
 Scanner sc = new Scanner(System.in);

 System.out.print("Ingrese un numero entero: ");
 int N = sc.nextInt();

  boolean esPrimo = true;

  if (N <= 1) {
 esPrimo = false; 
 } else {
 for (int i = 2; i < N; i++) {
 if (N % i == 0) {
 esPrimo = false;
 break;
 }
 }
 }

 if (esPrimo) {
 System.out.println(N + " es un numero primo.");
 } else {
 System.out.println(N + " no es un numero primo.");
 }
 }
 public void ejercicio10(){
 Scanner sc = new Scanner(System.in);

 final double PRECIO_UNITARIO = 11000;

 System.out.print("Ingrese la cantidad de computadoras a comprar: ");
 int cantidad = sc.nextInt();

 double totalSinDescuento = cantidad * PRECIO_UNITARIO;
 double descuento;

 if (cantidad < 5) {
 descuento = 0.10;
 } else if (cantidad < 10) {
 descuento = 0.20;
 } else {
 descuento = 0.40;
 }

 double montoDescuento = totalSinDescuento * descuento;
 double totalPagar = totalSinDescuento - montoDescuento;

 System.out.println("Total sin descuento: $" + totalSinDescuento);
 System.out.println("Monto del descuento: $" + montoDescuento);
 System.out.println("Total a pagar: $" + totalPagar);    
}
 public void ejercicio11(){
Scanner sc = new Scanner(System.in);

 System.out.print("Ingrese un numero natural N (mayor o igual a 2): ");
 int N = sc.nextInt();

 if (N < 2) {
 System.out.println("No hay numeros primos menores que 2.");
 return;
  }

 System.out.println("Numeros primos entre 2 y " + N + ":");


 for (int num = 2; num <= N; num++) {
 if (esPrimo(num)) {
  System.out.print(num + " ");
   }
   }
   }

 public static boolean esPrimo(int numero) {
 if (numero <= 1) return false;

 for (int i = 2; i <= Math.sqrt(numero); i++) {
  if (numero % i == 0) {
  return false;
  }
  }
 return true;
 }
 public void ejercicio12(){
 Scanner sc = new Scanner(System.in);

 System.out.print("Ingrese la base del triangulo: ");
 double base = sc.nextDouble();

 System.out.print("Ingrese la altura del triangulo: ");
  double altura = sc.nextDouble();

 double area = (base * altura) / 2;

 System.out.println("El area del triangulo es: " + area);   
 }
         
}    




