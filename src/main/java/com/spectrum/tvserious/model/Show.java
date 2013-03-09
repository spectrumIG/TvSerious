package com.spectrum.tvserious.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import com.moviejukebox.tvrage.model.CountryDetail;
import com.moviejukebox.tvrage.model.ShowInfo;
import com.spectrum.tvserious.core.error.SeriousErrorHandler;

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
		this.summary  = showInfo.getSummary();
		this.totalSeason = showInfo.getTotalSeasons();
	}

	public int getShowID() {
		return this.showID;
	}

	public String getShowName() {
		return this.showName;
	}

	public String getMinimalShowInfo(ShowInfo showInfo) {
		if (this.showID != 0) {
			return this.toString();
		} else {
			return SeriousErrorHandler.generateTvSeriousCliError("IncorrectID");
		}

	}
	
	public String getAirDay() {
		return airDay;
	}

	public String getAirTime() {
		return airTime;
	}

	public String getEnded() {
		return ended;
	}

	public List<String> getGenres() {
		return genres;
	}

	public List<CountryDetail> getNetwork() {
		return network;
	}

	public int getRuntime() {
		return runtime;
	}

	public String getShowLink() {
		return showLink;
	}

	public Date getStartDate() {
		return startDate;
	}

	public int getStarted() {
		return started;
	}

	public String getStatus() {
		return status;
	}

	public String getSummary() {
		return summary;
	}

	public int getTotalSeason() {
		return totalSeason;
	}

	public Show fromShowInfoObject(ShowInfo showInfo) {
		return new Show(showInfo);	
	}

	@Override
	public String toString() {
		return "Show : " + getShowID()+ " -" + getShowName() + ".";
	}
}
