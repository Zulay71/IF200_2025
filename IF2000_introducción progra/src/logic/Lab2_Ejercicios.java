/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Scanner;

/**
 *
 * @author luzma
 */
public class Lab2_Ejercicios {

public void ejercicio13 (){
int suma = 0;

for (int i = 2; i <= 1000; i +=2){
 suma += i;
}
System.out.println("La suma de todos los numeros pares entre 2 y 1000 es: " + suma);
}
public void ejercicio14(){
    
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Ingrese la temperatura en grados Celsius: ");
 double celsius = sc.nextDouble();
 
 double fahrenheit = (9.0 / 5.0)* celsius + 32;
 
 System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
 
}
public void ejercicio15(){
Scanner scanner = new Scanner(System.in);

System.out.print("Ingrese el numero base (X): ");
 int base = scanner.nextInt();

System.out.print("Ingrese el exponente (N): ");
int exponente = scanner.nextInt();

 long resultado = 1;

 if (exponente == 0) {
 resultado = 1; 
 } else {
 
 for (int i = 1; i <= Math.abs(exponente); i++) {
    resultado *= base;
  }

  if (exponente < 0) {
System.out.println("Resultado: 1 / " + resultado + " = " + (1.0 / resultado));
return;
}
}

System.out.println("Resultado de " + base + " elevado a " + exponente + " es: " + resultado);
    
}

public void ejercicio16(){
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Ingrese un numero del 1 al 12: ");
 int mes = sc.nextInt();

 switch (mes) {
 case 1 -> System.out.println("Enero");
 case 2 -> System.out.println("Febrero");
 case 3 -> System.out.println("Marzo");
 case 4 -> System.out.println("Abril");
 case 5 -> System.out.println("Mayo");
 case 6 -> System.out.println("Junio");
 case 7 -> System.out.println("Julio");
 case 8 -> System.out.println("Agosto");
 case 9 -> System.out.println("Septiembre");
 case 10 ->System.out.println("Octubre");
 case 11 ->System.out.println("Noviembre");
 case 12 ->System.out.println("Diciembre");
default -> System.out.println("Numero invalido. Debe estar entre 1 y 12.");
}
}
public void ejercicio17(){
 Scanner sc = new Scanner(System.in);

System.out.print("Ingrese el valor de x: ");
int x = sc.nextInt();

 int resultado;

 if (x > 0) {
  resultado = x + 5;
 } else if (x < 0) {
 resultado = x * x;
  } else {
 resultado = 1;
 }

System.out.println("El resultado de F(" + x + ") es: " + resultado);

}
public void ejercicio18(){
 Scanner sc = new Scanner(System.in);

 System.out.print("Ingrese el lado a: ");
 double a = sc.nextDouble();

 System.out.print("Ingrese el lado b: ");
 double b = sc.nextDouble();

 System.out.print("Ingrese el lado c: ");
 double c = sc.nextDouble();

 double p = (a + b + c) / 2;
 
 double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

System.out.printf("El area del triangulo es: " + area);
      
}
public void ejercicio19(){
 Scanner sc = new Scanner(System.in);

 System.out.print("Ingrese el valor de A: ");
 int A = sc.nextInt();

 System.out.print("Ingrese el valor de B: ");
 int B = sc.nextInt();

 System.out.println("Antes del intercambio: A = " + A + ", B = " + B);

 int TEMP = A;
 A = B;
 B = TEMP;

 System.out.println("Despues del intercambio: A = " + A + ", B = " + B);
}
public void ejercicio20(){
Scanner sc = new Scanner(System.in);

System.out.print("Ingrese X0: ");
double x0 = sc.nextDouble();

System.out.print("Ingrese Y0: ");
double y0 = sc.nextDouble();

System.out.print("Ingrese X1: ");
double x1 = sc.nextDouble();

System.out.print("Ingrese Y1: ");
double y1 = sc.nextDouble();


if (x0 == x1) {
System.out.println("La pendiente es indefinida (division por cero). La recta es vertical.");
} else {
    
double m = (y0 - y1) / (x0 - x1);

double b = y0 - m * x0;

 System.out.println("La ecuacion de la recta es: y = " + m + "x + " + b);
}
}
public void ejercicio21(){
Scanner sc = new Scanner(System.in);

 System.out.print("Ingrese un numero natural K: ");
 int K = sc.nextInt();

  if (K <= 0) {
 System.out.println("Por favor, ingrese un numero natural mayor que 0.");
  } else {
   int suma = 0;
 for (int i = 1; i < K; i++) {
    suma += i;
  }
System.out.println("La suma de todos los numeros naturales menores que " + K + " es: " + suma);
} 
}
public void ejercicio22(){
Scanner sc = new Scanner(System.in);

System.out.print("¿Cuantos numeros positivos desea ingresar? ");
 int cantidad = sc.nextInt();

  if (cantidad <= 0) {
 System.out.println("La cantidad debe ser un numero positivo mayor que cero.");
   } else {
    double suma = 0;
    int contador = 0;

   while (contador < cantidad) {
 System.out.print("Ingrese un numero positivo: ");
   double numero = sc.nextDouble();

    if (numero > 0) {
    suma += numero;
    contador++;
   } else {
System.out.println("Numero invalido. Debe ser positivo.");
  }
  }

double promedio = suma / cantidad;
System.out.println("El promedio es: " + promedio);
}   
}
public void ejercicio23(){
Scanner scanner = new Scanner(System.in);

 int[] numeros = new int[10];
 int sumaTotal = 0;
 int sumaPares = 0;
 int sumaImpares = 0;
 int cantidadPares = 0;
 int cantidadImpares = 0;

System.out.println("Ingrese 10 numeros enteros:");
for (int i = 0; i < 10; i++) {
System.out.print("Numero " + (i + 1) + ": ");
numeros[i] = scanner.nextInt();
            
sumaTotal += numeros[i];

 if (numeros[i] % 2 == 0) {
 sumaPares += numeros[i];
 cantidadPares++;
 } else {
 sumaImpares += numeros[i];
 cantidadImpares++;
  }
  }

System.out.println("\n=== Resultados ===");
System.out.println("Suma total de los numeros: " + sumaTotal);
System.out.println("Cantidad de nmeros pares: " + cantidadPares);
System.out.println("Cantidad de numeros impares: " + cantidadImpares);
System.out.println("Suma de numeros pares: " + sumaPares);
System.out.println("Suma de numeros impares: " + sumaImpares);
}
public void ejercicio24(){
    
int sumaPares = 0;
int sumaImpares = 0;

for (int i = 1; i <= 200; i++) {
   if (i % 2 == 0) {
   sumaPares += i; 
      } else {
   sumaImpares += i; 
      }
      }

 System.out.println("Suma de los numeros pares entre 1 y 200: " + sumaPares);
 System.out.println("Suma de los numeros impares entre 1 y 200: " + sumaImpares);
}
public void ejercicio25(){

int sumaCuadrados = 0;

  for (int i = 1; i <= 100; i++) {
  sumaCuadrados += i * i; 
  
  }
  
System.out.println("La suma de los cuadrados de los 100 primeros numeros naturales es: " + sumaCuadrados);   
}
public void ejercicio26(){
Scanner scanner = new Scanner(System.in);

System.out.print("Ingrese un numero entero positivo: ");
 int n = scanner.nextInt();

  if (n < 0) {
 System.out.println("El numero debe ser entero positivo.");
 } else {
  
 long factorial = 1; 

 for (int i = 1; i <= n; i++) {
  factorial *= i;
 }

System.out.println("El factorial de " + n + " es: " + factorial);
}    
}
public void ejercicio27(){
 Scanner scanner = new Scanner(System.in);

 int numero;
 int maximo;

System.out.println("Ingrese 10 numeros:");

 System.out.print("Numero 1: ");
 maximo = scanner.nextInt();

  for (int i = 2; i <= 10; i++) {
  
  System.out.print("Numero " + i + ": ");
  numero = scanner.nextInt();

  if (numero > maximo) {
      maximo = numero;
    }
    }
 System.out.println("\nEl valor maximo de los 10 numeros ingresados es: " + maximo);   
}
}
