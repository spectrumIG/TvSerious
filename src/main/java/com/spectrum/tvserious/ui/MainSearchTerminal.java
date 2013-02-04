package com.spectrum.tvserious.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.spectrum.tvserious.core.RageWrap;

/**
 * Testing class for core and basic db functionality To be removed after the
 * implementation of UI
 * 
 */
public class MainSearchTerminal {
	private static RageWrap rageWrap = new RageWrap();

	public static void main(String[] args) throws IOException {

		generatePrompt();

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int choice = Integer.parseInt(reader.readLine());

		processChoice(choice);
	}

	private static void processChoice(int choice) throws IOException {

		switch (choice) {
		case 1:
			try {
				searchPrompt();
			} catch (IOException e) {
				throw e;

			}
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

	private static void searchPrompt() throws IOException {
		System.out.println("Insert name for series to be searched: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String search = reader.readLine();
		System.out.println("Searching....");
		List<String> show = new ArrayList<String>();
		try {
			show = rageWrap.getListOfShowAndId(search);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		printRetrievedShowList(show);
	}

	private static void printRetrievedShowList(List<String> shows) {
		for(String show : shows){
			System.out.println(show);
		}
		
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
