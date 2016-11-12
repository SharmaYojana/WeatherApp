package nyc.c4q.yojana.weather;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by yojanasharma on 11/10/16.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherViewHolder> {

    List<nyc.c4q.yojana.weather.OtherPojo.List> weatherList;
     WeatherAdapter (List <nyc.c4q.yojana.weather.OtherPojo.List> myList){
         this.weatherList = myList;

     }
    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent, false);
        return new WeatherViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {
//        WeatherViewHolder vh = (WeatherViewHolder) holder;
        Float something = weatherList.get(position).getMain().getTemp();
        String tempString = Float.toString(something);
//        Log.d("Tag",tempString);
//        Log.d("size", Integer.toString(getItemCount()));
        holder.mtextView.setText(tempString);

        String description = weatherList.get(position).getWeather().get(0).getDescription();
        holder.cloudytextView.setText((description));

        String DateAndTime = weatherList.get(position).getDtTxt();
        holder.datetimeView.setText((DateAndTime));



    }

    @Override
    public int getItemCount() {
        return weatherList.size();
    }
}
