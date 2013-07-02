package com.urieljuliatti.googleplaces.query;

import com.urieljuliatti.googleplaces.query.SearchQuery;

import android.location.Location;

public class NearbySearchQuery extends SearchQuery {

	public enum Ranking { Prominence, Distance };
	private int radius;
	public NearbySearchQuery(int radius, Location location) {
		this(radius, location.getLatitude(), location.getLongitude());
	}

	public NearbySearchQuery(int radius, double lat, double lon) {
		setLocation(lat, lon);
		setRadius(radius); // Default radius option
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
		return "https://maps.googleapis.com/maps/api/place/nearbysearch/json";
	}
}
