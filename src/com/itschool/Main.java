package com.itschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
//	a = in.nextInt();
//	b = in.nextInt();

//	for (int i = 1; i <= 12; i++){
//		if (i > 3 && i < 7) {
//			System.out.println("Оценка = 3 " + i);
//		} else if (i >= 7 && i <= 9){
//			System.out.println("Оценка = 4 " + i);
//		} else if (i > 9) {
//			System.out.println("Оценка = 5 " + i);
//		}
		System.out.print("Вывести таблицу умножения для числа :");
		int table = in.nextInt();
		for (int i = 1; i <= 10; i++){
			System.out.println("[" + i + "] " + i*table);
		}
    }

//    public static int factorial (int a){
//    	for (int i = a; i > 0; i--) {
//
//		}
//	}
}
