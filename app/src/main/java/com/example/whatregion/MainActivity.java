package com.example.whatregion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etRegionNum;
    TextView tvShowRegion;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etRegionNum = findViewById(R.id.etRegionNum);
        tvShowRegion = findViewById(R.id.textView);

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

        listOfData = AppData.getArrayOfData();
        homeRegion = loadHomeRegion();


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
                }
                break;
            }case R.id.btnZero:{
                etRegionNum.setText(s + "0");
                break;
            }case R.id.btnSet:{
                //PerformAction
                break;
            }
        }

        checkRegion(s,listOfData);
    }

    private void checkRegion(String regNumber,ArrayList<RegionObject> arr){
        RegionObject region;

        for(RegionObject object:arr){
            if(object.getRegionNumber().equals(regNumber)){
                tvShowRegion.setText(object.getRegionName());
                String distanceFromHomeRegion = calculateDistance(object.getLat(),object.getLon());
                if(!distanceFromHomeRegion.equals("")){
                    //Show distance
                }
                break;
            }
        }


    }

    private String calculateDistance(Double lat,Double lon){
        if(homeRegion != null){
            String dist = "1";
            //Method Realization

            return dist;
        }
        return "";
    }

    private RegionObject loadHomeRegion(){
        sharedPreferences = getSharedPreferences(SHARED_PREF,MODE_PRIVATE);
        String jsonString = sharedPreferences.getString(HOME_REG_VALUE,"");
        if(jsonString != null){
            try {
                JSONObject obj= new JSONObject(jsonString);
                homeRegion.setRegionNumber(obj.getString(AppData.));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}























