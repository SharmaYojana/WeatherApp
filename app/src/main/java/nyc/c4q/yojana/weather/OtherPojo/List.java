package nyc.c4q.yojana.weather.OtherPojo;

import java.util.ArrayList;

import nyc.c4q.yojana.weather.Pojo.Wind;

/**
 * Created by yojanasharma on 11/10/16.
 */

public class List {

    private Integer dt;
    private Main main;
    private java.util.List<Weather> weather = new ArrayList<Weather>();
    private Clouds clouds;
    private Wind wind;
    private Sys_ sys;
    private String dt_txt;

    /**
     * @return The dt
     */
    public Integer getDt() {
        return dt;
    }

    /**
     * @param dt The dt
     */
    public void setDt(Integer dt) {
        this.dt = dt;
    }

    /**
     * @return The main
     */
    public Main getMain() {
        return main;
    }

    /**
     * @param main The main
     */
    public void setMain(Main main) {
        this.main = main;
    }

    /**
     * @return The weather
     */
    public java.util.List<Weather> getWeather() {
        return weather;
    }

    /**
     * @param weather The weather
     */
    public void setWeather(java.util.List<Weather> weather) {
        this.weather = weather;
    }

    /**
     * @return The clouds
     */
    public Clouds getClouds() {
        return clouds;
    }

    /**
     * @param clouds The clouds
     */
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    /**
     * @return The wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * @param wind The wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * @return The sys
     */
    public Sys_ getSys() {
        return sys;
    }

    /**
     * @param sys The sys
     */
    public void setSys(Sys_ sys) {
        this.sys = sys;
    }

    /**
     * @return The dtTxt
     */
    public String getDtTxt() {
        return dt_txt;
    }

    /**
     * @param dt_txt The dt_txt
     */
    public void setDtTxt(String dt_txt) {
        this.dt_txt = dt_txt;
    }

}
