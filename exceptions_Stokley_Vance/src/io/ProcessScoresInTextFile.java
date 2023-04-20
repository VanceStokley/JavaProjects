/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author roust
 */
public class ProcessScoresInTextFile {
 public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file of scores: ");
		File file = new File(input.nextLine());

		if (!file.exists()) {
			System.out.println("File " + file + " does not exist");
			System.exit(1);
		}

		int count = 0; 		
		double total = 0;	

		try (
			Scanner inputFile = new Scanner(file);
		) {
			while (inputFile.hasNext()) {
				total += inputFile.nextInt();
				count++;
			}
		}
		System.out.println("File " + file.getName());
		System.out.println("Total scores: " + total);
		System.out.println("Average scores: " + (total / count));
	}   
}
