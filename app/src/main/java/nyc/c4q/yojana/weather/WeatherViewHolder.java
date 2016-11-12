package nyc.c4q.yojana.weather;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yojanasharma on 11/10/16.
 */

public class WeatherViewHolder extends RecyclerView.ViewHolder {
    TextView mtextView;
    TextView cloudytextView;
    TextView datetimeView;

    public WeatherViewHolder(View itemView) {
        super(itemView);
        mtextView = (TextView) itemView.findViewById(R.id.item_text_view);
        cloudytextView = (TextView) itemView.findViewById(R.id.item_text_cloudy);
        datetimeView = (TextView) itemView.findViewById(R.id.item_text_time);


    }
}
