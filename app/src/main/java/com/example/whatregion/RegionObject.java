package com.example.whatregion;


public class RegionObject {

    private String regionNumber;
    private String regionName;
    private double lat;
    private double lon;

    public RegionObject(String regionNumber,String regionName,double lat,double lon){
        this.regionNumber = regionNumber;
        this.regionName = regionName;
        this.lat = lat;
        this.lon = lon;
    }

    public String getRegionNumber(){
        return regionNumber;
    }
    public String getRegionName(){
        return regionName;
    }
    public double getLat(){
        return lat;
    }
    public double getLon(){
        return lon;
    }

    public void setRegionNumber(String regionNumber) {
        this.regionNumber = regionNumber;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
