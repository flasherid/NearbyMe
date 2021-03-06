package com.mohamedibrahim.nearbyme.models.places;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("venue")
    @Expose
    private Venue venue;

    /**
     * @return The venue
     */
    public Venue getVenue() {
        return venue;
    }


    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}