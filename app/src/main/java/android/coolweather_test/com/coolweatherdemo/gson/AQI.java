package android.coolweather_test.com.coolweatherdemo.gson;

/**
 * Created by shanchunzhang on 08/05/2017.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
