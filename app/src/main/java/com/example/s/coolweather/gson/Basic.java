package com.example.s.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by s on 2017/8/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
@SerializedName("id")
public  String weatherId;
public Update update;
public class Update{
@SerializedName("loc")
public String updatetime;}
}