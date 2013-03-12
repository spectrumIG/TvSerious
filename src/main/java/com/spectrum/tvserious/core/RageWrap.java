package com.spectrum.tvserious.core;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.moviejukebox.tvrage.TVRage;
import com.moviejukebox.tvrage.model.ShowInfo;

public class RageWrap {
	private final TVRage tvRage;
	private final String KEY = Values.API_KEY;
	private static RageWrap INSTANCE = new RageWrap();

	private RageWrap() {
		this.tvRage = new TVRage(KEY);
	}

	public static RageWrap getInstance() {
		return INSTANCE;
		
	}

	private List<ShowInfo> getShowInfosFromString(String search) {
		return (List<ShowInfo>) this.tvRage.searchShow(search);
	}

	@SuppressWarnings("null")
	public List<String> getListOfShowAndId(String search) {
		List<ShowInfo> listOfPossibleShows = getShowInfosFromString(search);
		List<String> possibleShow = new ArrayList<String>();

		for (ShowInfo show : listOfPossibleShows) {
			String showFinal = show.getShowID() + " " + show.getShowName();
			possibleShow.add(showFinal);
		}
		return possibleShow;
	}

}
