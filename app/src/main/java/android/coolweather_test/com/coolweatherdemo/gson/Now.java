package android.coolweather_test.com.coolweatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shanchunzhang on 08/05/2017.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
