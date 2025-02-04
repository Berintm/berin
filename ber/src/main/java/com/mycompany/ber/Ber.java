/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ber;

import java.util.Scanner;
public class Ber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); 
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); 
        int sum = num1 + num2; 
        System.out.println("The sum is: " + sum); 
    }
}
