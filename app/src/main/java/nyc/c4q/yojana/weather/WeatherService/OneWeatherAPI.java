package nyc.c4q.yojana.weather.WeatherService;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yojanasharma on 11/10/16.
 */

public interface OneWeatherAPI {

    @GET("/data/2.5/forecast")
    Call<nyc.c4q.yojana.weather.OtherPojo.Example> getWeather(@Query("id") String id, @Query("appid") String appid);
}
