package com.kh.practice6.func;

public class Practice4 {

	public static void main(String[] args) {

		int[][] arr = new int[4][4];

		int totalAll = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i + 1 < arr.length) {
				int total = 0;
				for (int j = 0; j < arr[i].length; j++) {
					if (j + 1 < arr[i].length) {
						arr[i][j] = (int) (Math.random() * 100);
						total += arr[i][j];
					} else if (j + 1 == arr[i].length) {
						arr[i][j] = total;
						totalAll += total;
					}
					System.out.print(" " + arr[i][j] + " ");
				}
			} else if (i + 1 == arr.length) {

				for (int j = 0; j < arr[i].length; j++) {
					if (j + 1 < arr[i].length) {
						int total = 0;
						for (int k = 0; k < arr.length; k++) {
							if (k + 1 < arr.length) {
								total += arr[k][j];
							} else if (k + 1 == arr.length) {
								arr[k][j] = total;
								totalAll += total;
								System.out.print(" " + arr[k][j] + " ");
							}
						}
					}
					if (j + 1 == arr[i].length) {
						arr[i][j] = totalAll;
						System.out.print(" " + arr[i][j] + " ");
					}
				}
			}
			System.out.println();
		}

	}

}
