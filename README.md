Google Places API java source implemented for query purpose.

Setup
=====

1) You've got to obtain an API key.  Visit the <a href="https://developers.google.com/places/documentation/">developer's guide</a> for more information.

2) Drop the googleplaces.jar in the lib folder of your Android project.

3) In order to mismatch issues, I've moved out the Android Support V4 from libs folder (libs/android-support-v4.jar). As a best practice, you might want to include it on your own project instead of the Google Places Android one.

Usage
=====

Some Examples:

Place Search
------------

Sending a search request

    GooglePlaces googlePlaces = new GooglePlaces("Your API Key");
    
    PlacesResult result = googlePlaces.getPlaces("restaurant", 500, -20.28142, -40.301564);
    
    PlacesResult result = googlePlaces.getPlaces("dinner", "meal", 500, -20.28142, -40.301564);
    
    PlacesResult result = googlePlaces.getPlaces("hamburger", -20.28142, -40.301564);

        
Place Details
-------------

Sending a Place Details request

    Place somePlace = result.getPlaces().get(0);
    
    DetailsResult detailsResult = googlePlaces.getPlaceDetails(somePlace.getReference());
