package android.coolweather_test.com.coolweatherdemo.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by shanchunzhang on 08/05/2017.
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
