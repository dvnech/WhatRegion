package com.example.whatregion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etRegionNum;
    TextView tvShowRegion;
    TextView tvFirstLaunch;
    ArrayList<RegionObject> listOfData;
    RegionObject homeRegion;

    Button btnOne;
    Button btnTwo;
    Button btnFour;
    Button btnFive;
    Button btnThree;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    Button btnClear;
    Button btnSet;

    SharedPreferences sharedPreferences;
    private final String SHARED_PREF = "SHARED_PREF";
    private final String HOME_REG_VALUE = "HOME_REG_VALUE";
    private final String IS_FIRST_TIME_LAUNCH = "IS_FIRST_TIME_LAUNCH";
    private boolean isFirstLaunch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etRegionNum = findViewById(R.id.etRegionNum);
        tvShowRegion = findViewById(R.id.textView);
        tvFirstLaunch = findViewById(R.id.tv_first_launch);

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnThree = findViewById(R.id.btnThree);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
        btnClear = findViewById(R.id.btnClear);
        btnSet = findViewById(R.id.btnSet);


        sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);

        listOfData = AppData.getArrayOfData();
        homeRegion = loadHomeRegion();
        isFirstLaunch = checkIfFirstLauch();

        if(!isFirstLaunch){
            btnSet.setVisibility(View.INVISIBLE);
        }else{
            tvFirstLaunch.setText(getString(R.string.first_launch));
        }


    }

    private boolean checkIfFirstLauch(){
        boolean b = sharedPreferences.getBoolean(IS_FIRST_TIME_LAUNCH,true);
        return b;
    }

    public void onButtonPressed(View v){

        String s = etRegionNum.getText().toString();
        switch(v.getId()){
            case R.id.btnOne:{
                etRegionNum.setText(s + "1");
                break;
            }case R.id.btnTwo:{
                etRegionNum.setText(s + "2");
                break;
            }case R.id.btnThree:{
                etRegionNum.setText(s + "3");
                break;
            }case R.id.btnFour:{
                etRegionNum.setText(s + "4");
                break;
            }case R.id.btnFive:{
                etRegionNum.setText(s + "5");
                break;
            }case R.id.btnSix:{
                etRegionNum.setText(s + "6");
                break;
            }case R.id.btnSeven:{
                etRegionNum.setText(s + "7");
                break;
            }case R.id.btnEight:{
                etRegionNum.setText(s + "8");
                break;
            }case R.id.btnNine:{
                etRegionNum.setText(s + "9");
                break;
            }case R.id.btnClear:{
                if(s.length() > 0) {
                    etRegionNum.setText(s.substring(0,s.length()-1));
                    tvFirstLaunch.setText("");
                    tvShowRegion.setText("Введите регион");
                }
                break;
            }case R.id.btnZero:{
                etRegionNum.setText(s + "0");
                break;
            }case R.id.btnSet:{
                //PerformAction
                homeRegion = findRegion(etRegionNum.getText().toString(),listOfData);
                if(homeRegion != null){
                    saveRegion(homeRegion);
                    btnSet.setVisibility(View.INVISIBLE);
                    Toast.makeText(this,"Домашний регион сохранен",Toast.LENGTH_SHORT).show();
                    isFirstLaunch = false;
                    saveIsFirstLaunch(isFirstLaunch);
                }
                break;
            }
        }

        checkRegion(etRegionNum.getText().toString(),listOfData);
    }

    private void checkRegion(String regNumber,ArrayList<RegionObject> arr){
        RegionObject object = findRegion(regNumber,arr);
        if(object != null){
            tvShowRegion.setText(object.getRegionName());
            String distanceFromHomeRegion = calculateDistance(object.getLat(), object.getLon());
            if (!distanceFromHomeRegion.equals("")) {
                if(!distanceFromHomeRegion.equals("0")) {
                    tvFirstLaunch.setText("Примерно " + distanceFromHomeRegion + " км от Вашего региона");
                }else{
                    tvFirstLaunch.setText("Домашний регион");
                }
            }
        }if(object == null && regNumber.length()>1){
            tvShowRegion.setText("Регион не найден");
        }

    }
    private RegionObject findRegion(String regNumber,ArrayList<RegionObject> arr){
        RegionObject object;
        for(int i = 0;i<arr.size();i++){
            object = arr.get(i);
            if(object.getRegionNumber().equals(regNumber)){
                return object;
            }
        }
        return null;
    }
    private void saveRegion(RegionObject obj){

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put(AppData.REGION_NAME,obj.getRegionName());
            jsonObject.put(AppData.REGION_NUMBER,obj.getRegionNumber());
            jsonObject.put(AppData.REGION_LAT,obj.getLat());
            jsonObject.put(AppData.REGION_LON,obj.getLon());

            String s = jsonObject.toString();
            sharedPreferences.edit().putString(HOME_REG_VALUE,s).apply();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void saveIsFirstLaunch(boolean b){
        sharedPreferences.edit().putBoolean(IS_FIRST_TIME_LAUNCH,b).apply();
    }

    private String calculateDistance(Double lat,Double lon){
        if(homeRegion != null){
            double latHome = homeRegion.getLat();
            double lonHome = homeRegion.getLon();

            Location locationHome = new Location("home");
            locationHome.setLatitude(latHome);
            locationHome.setLongitude(lonHome);

            Location locationDest = new Location("destination");
            locationDest.setLatitude(lat);
            locationDest.setLongitude(lon);

            //converts to km by dividing by 1000
            double distance = locationHome.distanceTo(locationDest)/1000;
            String dist =  new DecimalFormat("#####").format(distance);

            return dist;
        }
        return "";
    }

    private RegionObject loadHomeRegion(){
        RegionObject regObj;
        String jsonString = sharedPreferences.getString(HOME_REG_VALUE,"");
        if(jsonString != null){
            try {
                JSONObject obj= new JSONObject(jsonString);
                String name = obj.getString(AppData.REGION_NAME);
                String num = obj.getString(AppData.REGION_NUMBER);
                double lat = obj.getDouble(AppData.REGION_LAT);
                double lon = obj.getDouble(AppData.REGION_LON);
                regObj = new RegionObject(num,name,lat,lon);
                Toast.makeText(this,regObj.getRegionName(),Toast.LENGTH_SHORT).show();
            } catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(this,"null",Toast.LENGTH_SHORT).show();
                regObj = null;
            }
            return regObj;
        }else{return null;}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.menu_reset_region:{
                isFirstLaunch = true;
                btnSet.setVisibility(View.VISIBLE);
                homeRegion = null;
                tvFirstLaunch.setText(getString(R.string.first_launch));
            }
        }
        return super.onOptionsItemSelected(item);
    }
}























