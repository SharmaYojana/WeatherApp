package nyc.c4q.yojana.weather.Pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yojanasharma on 11/6/16.
 */

public class Item {

    private String title;
    private String lat;
    private String _long;
    private String link;
    private String pubDate;
    private Condition condition;
    private List<Forecast> forecast = new ArrayList<Forecast>();
    private String description;
    private Guid guid;

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param lat The lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * @return The _long
     */
    public String getLong() {
        return _long;
    }

    /**
     * @param _long The long
     */
    public void setLong(String _long) {
        this._long = _long;
    }

    /**
     * @return The link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * @return The pubDate
     */
    public String getPubDate() {
        return pubDate;
    }

    /**
     * @param pubDate The pubDate
     */
    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    /**
     * @return The condition
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * @param condition The condition
     */
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * @return The forecast
     */
    public List<Forecast> getForecast() {
        return forecast;
    }

    /**
     * @param forecast The forecast
     */
    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The guid
     */
    public Guid getGuid() {
        return guid;
    }

    /**
     * @param guid The guid
     */
    public void setGuid(Guid guid) {
        this.guid = guid;
    }

}