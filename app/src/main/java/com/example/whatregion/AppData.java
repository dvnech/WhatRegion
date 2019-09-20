package com.example.whatregion;

import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class AppData {
    private static final String JSON_NAME = "JSON_NAME";
    private static final String SHARED_PREF = "SHARED_PREF";

    public static final String REGION_NUMBER = "REGION_NUMBER";
    public static final String REGION_NAME = "REGION_NAME";
    public static final String REGION_LAT = "REGION_LAT";
    public static final String REGION_LON = "REGION_LON";

    private static final String JsonData = "[{\n" +
            "  \"REGION_NUMBER\": \"51\",\n" +
            "  \"REGION_NAME\": \"ноорг\",\n" +
            "  \"REGION_LAT\": 345,\n" +
            "  \"REGION_LON\": 321\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"23\",\n" +
            "  \"REGION_NAME\": \"тест111\",\n" +
            "  \"REGION_LAT\": 345,\n" +
            "  \"REGION_LON\": 432\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"44\",\n" +
            "  \"REGION_NAME\": \"кенглонерн\",\n" +
            "  \"REGION_LAT\": 345,\n" +
            "  \"REGION_LON\": 432\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"01\",\n" +
            "  \"REGION_NAME\": \"Республика Адыгея\",\n" +
            "  \"REGION_LAT\": 44.7692,\n" +
            "  \"REGION_LON\": 40.1765\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"02\",\n" +
            "  \"REGION_NAME\": \"Республика Башкортостан\",\n" +
            "  \"REGION_LAT\": 52.3735,\n" +
            "  \"REGION_LON\": 56.3431\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"102\",\n" +
            "  \"REGION_NAME\": \"Республика Башкортостан\",\n" +
            "  \"REGION_LAT\": 52.3735,\n" +
            "  \"REGION_LON\": 56.3431\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"03\",\n" +
            "  \"REGION_NAME\": \"Республика Бурятия\",\n" +
            "  \"REGION_LAT\": 51.819,\n" +
            "  \"REGION_LON\": 106.784\n" +
            "},\n" +
            "{\n" +
            "  \"REGION_NUMBER\": \"04\",\n" +
            "  \"REGION_NAME\": \"Республика Алтай\",\n" +
            "  \"REGION_LAT\": 50.648,\n" +
            "  \"REGION_LON\": 86.887\n" +
            "}]";

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
            exc.printStackTrace();
        }
        return arrayList;
    }


}
