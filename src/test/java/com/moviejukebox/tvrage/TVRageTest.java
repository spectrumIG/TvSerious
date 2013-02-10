package com.moviejukebox.tvrage;

import junit.framework.TestCase;

public class TVRageTest extends TestCase {
	private static final String API_KEY = "iPLSpGH7bNC5tYGEbtxV";
	private TVRage rageTest ;
	private final int showId = 3098; //Should be white collar
	
	public void testTvrage() {
		this.rageTest = new TVRage(API_KEY);
		assertNotNull(this.rageTest);
	}

	public void testGetEpisodeInfo() {
	
		
	}

	public void testGetEpisodeList() {
		fail("Not yet implemented");
	}

	public void testGetShowInfoString() {
		fail("Not yet implemented");
	}

	public void testSearchShow() {
		fail("Not yet implemented");
	}

}
