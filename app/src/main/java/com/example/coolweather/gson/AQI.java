package com.example.coolweather.gson;

/**
 * Created by yangjie on 2017/8/8.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
     //   @SerializedName("aqi")
        public String aqi;

     //   @SerializedName("pm25")
        public String pm25;
    }

}
