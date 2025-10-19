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
public class PracticalExercises_On_OneDimensional_Arrangements {
  public void exercise1(){
 Scanner sc = new Scanner(System.in);
 
 int [] numbers = new int [5];
 int sum = 0;
 for(int i = 0; i < numbers.length; i++){
  System.out.print("Enter the number " + (i + 1) + ": ");
     numbers[i] = sc.nextInt();
     sum = sum + numbers[i];    
 }
 System.out.println("The total sum is: " + sum);
  
}
  public void exercise2(){
   Scanner sc = new Scanner(System.in);
      int[] numbers = new int[10];
   
   for (int i = 0; i < numbers.length; i++) {
    System.out.print("Enter the number " + (i + 1) + ": ");
      numbers[i] = sc.nextInt();
    }
     int greater = numbers[0];
     int smaller = numbers[0];

     for (int i = 1; i < numbers.length; i++) {
     if (numbers[i] >  greater) {
     greater = numbers[i];
            }
    if (numbers[i] < smaller) {
      smaller = numbers[i];
        }
        }
        System.out.println("The greatest number is: " + greater);
        System.out.println("The smallest number is: " + smaller);    
  }
  public void exercise3(){
   Scanner sc = new Scanner(System.in);
        double[] notes = new double[5];
        double sum = 0;
  for (int i = 0; i < 5; i++) {
  System.out.print("Enter the note " + (i + 1) + ": ");
     notes[i] = sc.nextDouble();
     sum += notes[i];
  }
    double average = sum / 5;
   System.out.println("The average is: " + average); 
   
    if (average >= 70) {  
            System.out.println("The student PASSES");
        } else {
            System.out.println("The student FAILS");
        }
  }
 public void exercise4(){
 Scanner sc = new Scanner(System.in);
   int[] numbers = new int[10];
   int even = 0, odd = 0;

    for (int i = 0; i < 10; i++) {
    System.out.print("Enter number " + (i + 1) + ": ");
    numbers[i] = sc.nextInt();

   if (numbers[i] % 2 == 0) {
       even++;
      } else {
       odd++;
      }
      }

        System.out.println("Total even numbers: " + even);
        System.out.println("Total odd numbers: " + odd);
 }
 public void exercise5(){
  Scanner sc = new Scanner(System.in);
    int[] numbers = new int[5];

 for (int i = 0; i < 5; i++) {
  System.out.print("Enter number " + (i + 1) + ": ");
   numbers[i] = sc.nextInt();
   }

  System.out.print("Original array: ");
   for (int i = 0; i < 5; i++) {
    System.out.print(numbers[i] + " ");
   }

   System.out.println();

   System.out.print("Reversed array: ");
    for (int i = 4; i >= 0; i--) {
    System.out.print(numbers[i] + " ");
 }
 }
 public void exercise6(){
  int[][] matrix = new int[3][3];

  for (int i = 0; i < 3; i++) {
  for (int j = 0; j < 3; j++) {
  if (i == j) {
   matrix[i][j] = 1;
     } else {
  matrix[i][j] = 0;
 }
 }
 }

 System.out.println("Identity Matrix 3x3:");
  for (int i = 0; i < 3; i++) {
  for (int j = 0; j < 3; j++) {
 System.out.print(matrix[i][j] + " ");
 }
 System.out.println();
 }   
 }
 public void exercise7(){
  Scanner sc = new Scanner(System.in);
   int[][] matrix1 = new int[3][3];
   int[][] matrix2 = new int[3][3];
   int[][] result = new int[3][3];

System.out.println("Enter values for Matrix 1:");
 for (int i = 0; i < 3; i++) {
 for (int j = 0; j < 3; j++) {
 System.out.print("matrix1[" + i + "][" + j + "]: ");
  matrix1[i][j] = sc.nextInt();
   }
   }

System.out.println("\nEnter values for Matrix 2:");
  for (int i = 0; i < 3; i++) {
  for (int j = 0; j < 3; j++) {
  System.out.print("matrix2[" + i + "][" + j + "]: ");
  matrix2[i][j] = sc.nextInt();
   }
   }

 for (int i = 0; i < 3; i++) {
 for (int j = 0; j < 3; j++) {
   result[i][j] = matrix1[i][j] + matrix2[i][j];
 }
 }
System.out.println("\nResulting Matrix (Sum):");
for (int i = 0; i < 3; i++) {
 for (int j = 0; j < 3; j++) {
System.out.print(result[i][j] + " ");
 }
 System.out.println();
 }   
 }
 public void exercise8(){
  Scanner sc = new Scanner(System.in);
 int[][] matrix = new int[3][3];
 int[][] transpose = new int[3][3];

System.out.println("Enter values for a 3x3 matrix:");
for (int i = 0; i < 3; i++) {
 for (int j = 0; j < 3; j++) {
 System.out.print("matrix[" + i + "][" + j + "]: ");
  matrix[i][j] = sc.nextInt();
    }
    }

for (int i = 0; i < 3; i++) {
 for (int j = 0; j < 3; j++) {
 transpose[j][i] = matrix[i][j];
  }
  }

  System.out.println("\nOriginal Matrix:");
  for (int i = 0; i < 3; i++) {
  for (int j = 0; j < 3; j++) {
  System.out.print(matrix[i][j] + " ");
  }
  System.out.println();
  }
 System.out.println("\nTransposed Matrix:");
 for (int i = 0; i < 3; i++) {
  for (int j = 0; j < 3; j++) {
   System.out.print(transpose[i][j] + " ");
  }
 System.out.println();
 }   
 }
 public void exercise9(){
   Scanner sc = new Scanner(System.in);
 int[][] matrix = new int[4][4];

 System.out.println("Enter values for a 4x4 matrix:");
   for (int i = 0; i < 4; i++) {
   for (int j = 0; j < 4; j++) {
   System.out.print("matrix[" + i + "][" + j + "]: ");
    matrix[i][j] = sc.nextInt();
  }
  }
 System.out.print("\nMain diagonal: ");
  for (int i = 0; i < 4; i++) {
 System.out.print(matrix[i][i] + " ");
 }
 System.out.print("\nSecondary diagonal: ");
  for (int i = 0; i < 4; i++) {
 System.out.print(matrix[i][3 - i] + " ");
 }   
 }
 
}
