package com.spectrum.tvserious.model;

import java.util.Date;
import java.util.List;

import com.moviejukebox.tvrage.model.CountryDetail;
import com.moviejukebox.tvrage.model.ShowInfo;

public class Show {
	private int showID;
	private String showName;
	private String airDay;
	private String airTime;
	private String ended;
	private List<String> genres;
	private List<CountryDetail> network;
	private int runtime;
	private String showLink;
	private Date startDate;
	private int started;
	private String status;
	private String summary;
	private int totalSeason;

	private Show(ShowInfo showInfo) {
		this.showID = showInfo.getShowID();
		this.showName = showInfo.getShowName();
		this.airDay = showInfo.getAirDay();
		this.airTime = showInfo.getAirTime();
		this.ended = showInfo.getEnded();
		this.genres = showInfo.getGenres();
		this.network = showInfo.getNetwork();
		this.runtime = showInfo.getRuntime();
		this.showLink = showInfo.getShowLink();
		this.startDate = showInfo.getStartDate();
		this.started = showInfo.getStarted();
		this.status = showInfo.getStatus();
		this.summary = showInfo.getSummary();
		this.totalSeason = showInfo.getTotalSeasons();
	}

	public int getShowID() {
		return this.showID;
	}

	public String getShowName() {
		return this.showName;
	}

	public String getAirDay() {
		return this.airDay;
	}

	public String getAirTime() {
		return this.airTime;
	}

	public String getEnded() {
		return this.ended;
	}

	public List<String> getGenres() {
		return this.genres;
	}

	public List<CountryDetail> getNetwork() {
		return this.network;
	}

	public int getRuntime() {
		return this.runtime;
	}

	public String getShowLink() {
		return this.showLink;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public int getStarted() {
		return this.started;
	}

	public String getStatus() {
		return this.status;
	}

	public String getSummary() {
		return this.summary;
	}

	public int getTotalSeason() {
		return this.totalSeason;
	}

	public Show fromShowInfoObject(ShowInfo showInfo) {
		return new Show(showInfo);
	}

	@Override
	public String toString() {
		return "Show : " + getShowID() + " -" + getShowName() + ".";
	}
}
