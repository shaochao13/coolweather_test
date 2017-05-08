package android.coolweather_test.com.coolweatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shanchunzhang on 08/05/2017.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
