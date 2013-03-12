package com.spectrum.tvserious.core;

import java.util.ArrayList;
import java.util.List;

import com.moviejukebox.tvrage.TVRage;
import com.moviejukebox.tvrage.model.Episode;
import com.moviejukebox.tvrage.model.EpisodeList;
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

	public ShowInfo getShow(int showId) {
		return this.tvRage.getShowInfo(showId);

	}

	@Deprecated
	public ShowInfo getShow(String showIdString) {
		return this.tvRage.getShowInfo(showIdString);
	}
	
	public Episode getEpisode(String showId, String seasonId, String episodeId){
		return this.tvRage.getEpisodeInfo(showId, seasonId, episodeId);
	}
	
	public EpisodeList getEpisodeList(String showId) {
		return this.tvRage.getEpisodeList(showId);
	}
}
