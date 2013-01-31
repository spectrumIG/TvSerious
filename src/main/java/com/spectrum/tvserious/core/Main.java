package com.spectrum.tvserious.core;

import java.util.List;

import com.moviejukebox.tvrage.TVRage;
import com.moviejukebox.tvrage.model.ShowInfo;

public class Main {
	private static final String API_KEY = "iPLSpGH7bNC5tYGEbtxV";
	
	public static void main(String[] args) {
		TVRage tvRage = new TVRage(API_KEY);
		List<ShowInfo> shows = tvRage.searchShow("Collar");
		for (ShowInfo show : shows) {
			int id  = show.getShowID();
			String name = show.getShowName();
			String airDay = show.getAirDay();
			String classification = show.getClassification();
			String summary = show.getSummary();
			System.out.println(name + " " + String.valueOf(id).toString() );
		}
	}
}
