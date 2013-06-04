package com.urieljuliatti.googleplaces.query;

import com.urieljuliatti.googleplaces.query.Query;


public class DetailsQuery extends Query {

	public DetailsQuery(String reference) {
		setReference(reference);
	}
	
	public void setReference(String reference) {
		mQueryBuilder.addParameter("reference", reference);
	}
	
	@Override
	public String getUrl() {
		return "https://maps.googleapis.com/maps/api/place/details/json";
	}

}