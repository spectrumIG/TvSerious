package com.spectrum.tvserious.model;

import com.moviejukebox.tvrage.model.ShowInfo;
import com.spectrum.tvserious.core.error.SeriousErrorHandler;

public class Show  {
	private int showID;
	private String showName;

	private Show(int showID, String showName) {
		this.showID = showID;
		this.showName = showName;
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

	@Override
	public String toString() {
		return "Show : " + this.showID + " -" + this.showName + ".";
	}

	public Show fromShowInfoObject(ShowInfo showInfo) {
		return new Show(showInfo.getShowID(),showInfo.getShowName());
		
	}
}
