package datastructurespart1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a public static method called "toPower" that takes in as parameters two integers called size and power. 
 * The method should return an array of size "size" with each array index raised to the value of "power." 
 * So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," 
 * the method should return the following result: [0,1,4,9].
	Submit to your GitHub and provide a link to you repository
 * @author Esther2
 *
 */
public class ToPowerAndSum {
	public static void main(String[] args) {
		
		int size = 0;
		int power = 2;
		
		Scanner mySc = new Scanner(System.in);
		System.out.print("\t\n\n Enter the size of the array: \t");
		size = mySc.nextInt();
		
		int[] arr = toPower(size, power);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

	private static int[] toPower(int size, int power) {

		int[] myArr = new int[size];
		
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = (int) Math.pow(i, power);
		}
		
		return myArr;
	}
	
}

