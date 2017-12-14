package com.cip.prog;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class HelloWorld {

	public static double Suma (double Num1, double Num2) {
		
		double Result = Num1+Num2;
		
		return Result;
	}
	
	public static double Resta (double Num1, double Num2) {
		
		double Result = Num1-Num2;
		
		return Result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     // Prints "Hello, World" to the terminal window.
		Scanner keyboard = new Scanner(System.in);
		int Opcion = 0;
		
		double Result = 0,Num1 = 0,Num2 = 0;
		
        System.out.println("Hello, World");
        System.out.println("------MENU-------");
        System.out.println("1.Suma \n"
        				+ "2.Resta \n"
        				+ "3.Multiplicacion \n"
        				+ "4.Division \n");
        System.out.print("Opcion:");
        
        Opcion = keyboard.nextInt();
        
        
        switch (Opcion) {
		case 1:
			System.out.println("------SUMA-------");
			System.out.print("Digito 1: ");
			Num1 = keyboard.nextDouble();
			System.out.print("Digito 2: ");
			Num2 = keyboard.nextDouble();
			Result = Suma(Num1,Num2);
			System.out.println(Num1 + " + " + Num2 + "=" + Result);
			break;
		case 2:
			System.out.println("------RESTA-------");
			System.out.print("Digito 1: ");
			Num1 = keyboard.nextDouble();
			System.out.print("Digito 2: ");
			Num2 = keyboard.nextDouble();
			Result = Resta(Num1,Num2);
			System.out.println(Num1 + " - " + Num2 + "=" + Result);
			break;
		case 3:
			System.out.println(Opcion);
			break;
		case 4:
			System.out.println(Opcion);
			break;
		default:
			System.out.println("Esa opcion es invalida");
			break;
		}
        
	}

}
