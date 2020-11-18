package datastructurespart1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TTSArrSumProdLargest{

	
	static Scanner mySc = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		ArrayList<Integer> intArrList = new ArrayList<>();
		HashMap<String, String> hashMap = new HashMap<>();
		
//		String make = null;
//		String model = null;
		StringBuffer makeStrBf = new StringBuffer();
		StringBuffer modelStrBf = new StringBuffer();
		
		int sum = 0;
		int myProd = 0;
		int largest = 0;
		int smallest = 0;
		
		userFilledIntListNoReturn(intArrList);
	System.out.println("\t The List: \t" + intArrList);
	
	sum = sumCalculator(intArrList);
	System.out.println("\n\t The Sum: \t" + sum);
	
	myProd = prodCalculator(intArrList);
	System.out.println("\n\t The Prod: \t" + myProd);
	
	largest = largestCalculator(intArrList);
	System.out.println("\n\t The Largest: \t" + largest);
	
	smallest = smallestCalculator(intArrList);
	System.out.println("\n\t The Smallest: \t" + smallest);
	
	
	hashMap.put("Toyota", "Camry");
	hashMap.put("Honda", "Civic");
	hashMap.put("Toyota2", "Corolla");
	hashMap.put("Honda2", "Fit");
	hashMap.put("Chryster", "Cruiser");

	System.out.print("\t\n\n Enter the make you want: \t");
	String userMake = mySc.nextLine();
	makeModelFinder(hashMap, makeStrBf, modelStrBf, userMake);
	System.out.printf("\n\t Oh, you're looking for a    %S  ? Our   %S   selection is right over here.\t", makeStrBf, modelStrBf);
	
	
	
	
	
	
	
		
	}	// end main ----------------------------
private static void makeModelFinder(HashMap<String, String> hashMap, StringBuffer makeStrBf, StringBuffer modelStrBf, String userMake) {

	for (Map.Entry<String, String> makeModel : hashMap.entrySet()) {

		if (userMake.equalsIgnoreCase(makeModel.getKey())) {
			makeStrBf.append(makeModel.getKey());
			modelStrBf.append(makeModel.getValue());
			
			break;
		}
		
	} // for
	
	}
private static int smallestCalculator(ArrayList<Integer> intArrList) {
	int smallest = intArrList.get(0);
	
	for (int i = 1; i < intArrList.size(); i++) {
		if (smallest > intArrList.get(i)) {
			smallest = intArrList.get(i);
		}
		
	}// for
	
	return smallest;
	}
private static int largestCalculator(ArrayList<Integer> intArrList) {
	int largest = intArrList.get(0);
	
	for (int i = 1; i < intArrList.size(); i++) {
		if (largest < intArrList.get(i)) {
			largest = intArrList.get(i);
		}
		
	}// for
	
	return largest;
	}

	
	private static int prodCalculator(ArrayList<Integer> intArrList) {
		int prod = 1;
		for (Integer theInt : intArrList) {
			prod = prod * theInt;
		}

		return prod;
	}


	private static int sumCalculator(ArrayList<Integer> intArrList) {
		int sum = 0;
		for (Integer theInt : intArrList) {
			sum += theInt;
		}
		return sum;
	}


	/**
	 * 
	 * @param intList
	 */
	public static void userFilledIntListNoReturn(ArrayList<Integer> intList) {
		
		int num =0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("\t Enter a number 1-10: \t");
			num = mySc.nextInt();
			intList.add(num);
			mySc.nextLine();
		}
		
	} // end userFilledIntListNoreturn
	
	
	
	
	/**
	 * 
	 * @param intList
	 * @return
	 */
	public static ArrayList<Integer> userFilledIntList(ArrayList<Integer> intList) {
		Scanner mySc = new Scanner(System.in);
		
		int num =0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("\t Enter a number 1-10: \t");
			num = mySc.nextInt();
			intList.add(num);
		}
		
		return intList;
	} // end userFilledIntList
	
}