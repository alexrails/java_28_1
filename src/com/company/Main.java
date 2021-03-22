package com.company;

public class Main {

    public static void main(String[] args) {
    	//First task
		for (int i = 7; i > 0; i = i - 1) {
			System.out.println(i);
		}
		//Second task
		int[] nums = new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		int k = 0;
		while( k < nums.length) {
			System.out.println(nums[k]);
			k++;
		}
		//Thirth task
		int f1 = 1;
		int f2 = 1;
		int f3;
		System.out.print(f1 + ", " + f2 + ", ");
		for (int n = 3; f1 + f2 < 100; n++) {
			f3 = f1 + f2;
			System.out.print(f3 + ", ");
			f1 = f2;
			f2 = f3;
		}
		System.out.println();
    }
}
