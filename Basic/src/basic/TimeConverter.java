/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Bayu
 */

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		
		//your code goes here
		int b = 24;
  		int c = 60;
  		int d = 60;  
  		//int sum1 = a*b; 
		int sum1 = days * b;               
  		int sum2 = sum1*c;
  		int sum3 = sum2*d;

 
		System.out.println(sum3);  
		
	}
}
