package com.urieljuliatti.googleplaces.query;

import com.urieljuliatti.googleplaces.query.SearchQuery;

import android.location.Location;

public class AutoCompleteSearch extends SearchQuery {

	public enum Ranking { Prominence, Distance };
	
	public AutoCompleteSearch(Location location) {
		this(location.getLatitude(), location.getLongitude());
	}

	public AutoCompleteSearch(double lat, double lon) {
		setLocation(lat, lon);
		setRadius(2500); // Default
	}
	
	public void setRanking(Ranking ranking)	{
		mQueryBuilder.addParameter("rankby", ranking.toString());
	}
	
	public void setKeyword(String keyword) {
		mQueryBuilder.addParameter("keyword", keyword);
	}
	
	public void setName(String name) {
		mQueryBuilder.addParameter("name", name);	
	}
	
	public void setPageToken(String pageToken) {
		mQueryBuilder.addParameter("pagetoken", pageToken);
	}

	@Override
	public String getUrl() {
		return "https://maps.googleapis.com/maps/api/place/autocomplete/json";
	}
}
