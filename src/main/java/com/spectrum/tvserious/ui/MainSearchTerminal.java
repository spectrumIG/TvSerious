package com.spectrum.tvserious.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainSearchTerminal {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		generatePrompt();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int choice = Integer.parseInt(reader.readLine());
		
		delegateChoice(choice);
	}

	private static void delegateChoice(int choice) {

		switch (choice) {
		case 1:
			searchPrompt();
			break;
			
		case 2:
			infoPrompt();
			break;
			
		default:
		 generateErrorPrompt();
			break;
		}

	}

	private static void generateErrorPrompt() {
		// TODO Auto-generated method stub
		
	}

	private static void infoPrompt() {
		// TODO Auto-generated method stub

	}

	private static void searchPrompt() {

	}

	private static void generatePrompt() {
		System.out.println("=========================");
		System.out.println("Welcome to TvSerious!");
		System.out.println("");
		System.out.println("To start with some elementar function");
		System.out.println("choose one of next choices:");
		System.out.println("");
		System.out.println("1) Search for a Tv Series");
		System.out.println("2) Get Info on a TvSeries");
		System.out.println("");
	}
}
