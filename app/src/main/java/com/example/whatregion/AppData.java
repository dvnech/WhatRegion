package com.example.whatregion;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class AppData {
    private static final String JSON_NAME = "JSON_NAME";
    private static final String SHARED_PREF = "SHARED_PREF";

    private static final String REGION_NUMBER = "REGION_NUMBER";
    private static final String REGION_NAME = "REGION_NAME";
    private static final String REGION_LAT = "REGION_LAT";
    private static final String REGION_LON = "REGION_LON";

    private static final String JsonData = "";

    public static ArrayList<RegionObject> getArrayOfData(){
        JSONArray arrayOfRegions;
        ArrayList<RegionObject> arrayList = new ArrayList<>();
        String jsonString = JsonData;
        try{

            if(jsonString != "") {
                arrayOfRegions = new JSONArray(jsonString);
                for (int i = 0; i < arrayOfRegions.length(); i++) {
                    JSONObject obj = arrayOfRegions.getJSONObject(i);
                    String regNum = obj.getString(REGION_NUMBER);
                    String regName = obj.getString(REGION_NAME);
                    double regLat = obj.getDouble(REGION_LAT);
                    double regLon = obj.getDouble(REGION_LON);
                    arrayList.add(new RegionObject(regNum, regName, regLat, regLon));
                }
            }else{
                arrayOfRegions = new JSONArray();
            }
        }catch (JSONException exc){

        }
        return arrayList;
    }


}
