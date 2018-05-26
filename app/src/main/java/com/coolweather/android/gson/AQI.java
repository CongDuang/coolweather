package com.coolweather.android.gson;

/**
 * Created by Ma on 2018/5/24.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
