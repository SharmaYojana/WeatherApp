package nyc.c4q.yojana.weather.WeatherService;

import nyc.c4q.yojana.weather.Pojo.Example;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yojanasharma on 11/7/16.
 */

public interface WeatherApiService {

    @GET("V1/public/yql")
    Call<Example> getForecast(@Query("q") String q, @Query("format") String format, @Query("env") String env);

}
