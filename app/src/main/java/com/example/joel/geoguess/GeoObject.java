package com.example.joel.geoguess;

public class GeoObject {

    private int placeName;
    private boolean inEurope;

    public GeoObject(int placeName, boolean inEurope) {
        this.placeName = placeName;
        this.inEurope = inEurope;
    }

    public static final int[] locations = {

            R.drawable.img1_yes_denmark,
            R.drawable.img2_no_canada,
            R.drawable.img3_no_bangladesh,
            R.drawable.img4_yes_kazachstan,
            R.drawable.img5_no_colombia,
            R.drawable.img6_yes_poland,
            R.drawable.img7_yes_malta,
            R.drawable.img8_no_thailand
    };

    public static final boolean[] booleanLocations = {
            true,
            false,
            false,
            true,
            false,
            true,
            true,
            false
    };

    public void setPlaceName(int placeName) {
        this.placeName = placeName;
    }

    public int getPlaceName() {
        return placeName;
    }

    public boolean isInEurope() {
        return inEurope;
    }
}

