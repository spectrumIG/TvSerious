package com.spectrum.tvserious.core;

import java.util.List;

import com.moviejukebox.tvrage.TVRage;
import com.moviejukebox.tvrage.model.ShowInfo;

public class RageWrap {
	private final TVRage tvRage;
	private final String KEY = Values.API_KEY;
	private String searcheableValue;
	
	public RageWrap() {
		this.tvRage = new TVRage(KEY);
	}

	public TVRage getTvRage() {
		return this.tvRage;
	}

	public String getSearcheableValue() {
		return this.searcheableValue;
	}

	public void setSearcheableValue(String searcheableValue) {
		this.searcheableValue = searcheableValue;
	}

}
