package nyc.c4q.yojana.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

import nyc.c4q.yojana.weather.OtherPojo.Example;
import nyc.c4q.yojana.weather.WeatherService.OneWeatherAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Weather";
    private TextView mTextView;
    RecyclerView mRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weatherviewholder);
        mTextView = (TextView) findViewById(R.id.weather);

        mRecyclerview = (RecyclerView) findViewById(R.id.myweather);





        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Log.d(TAG, "onCreate: hello");

        OneWeatherAPI onewWeatherAPI = retrofit.create(OneWeatherAPI.class);
        Call<nyc.c4q.yojana.weather.OtherPojo.Example> httpRequest = onewWeatherAPI.getWeather("5128638","475566c90b46f36c71ef74179e02467e");
        httpRequest.enqueue(new Callback<nyc.c4q.yojana.weather.OtherPojo.Example>() {
            @Override
            public void onResponse(Call<nyc.c4q.yojana.weather.OtherPojo.Example> call, Response<nyc.c4q.yojana.weather.OtherPojo.Example> response) {
                try {
                    if (response.isSuccessful()) {
                        Example example = response.body();
                        List<nyc.c4q.yojana.weather.OtherPojo.List> something = example.getList();
                        Log.d("onResponse", response.body().toString());
                        mRecyclerview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        WeatherAdapter adapter = new WeatherAdapter(something);
                        mRecyclerview.setAdapter(adapter);


                    } else {
                        Log.d(TAG, "Error" + response.errorBody().string());
                    }
                } catch (IOException e) {
                    Log.e(TAG, e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<nyc.c4q.yojana.weather.OtherPojo.Example> call, Throwable t) {
                Log.d("failure","no connection");

            }
        });
    }
}
