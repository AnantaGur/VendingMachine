package com.techelevator;


import com.techelevator.application.VendingMachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendingMachineCLI {

	public static void main(String[] args) {

		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.run();

	}

/*	private static void displayItems() {
		int items = 16;
		File vendingItems = new File("catering.csv");
		String line;

		try (Scanner fileInput = new Scanner(vendingItems)){
			while(fileInput.hasNextLine()){
				line = fileInput.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}

		switch(items){
			case 1:

		}
	}*/
}
