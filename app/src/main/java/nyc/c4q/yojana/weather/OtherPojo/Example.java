package nyc.c4q.yojana.weather.OtherPojo;

import java.util.ArrayList;

/**
 * Created by yojanasharma on 11/10/16.
 */

public class Example {

    private City city;
    private String cod;
    private Float message;
    private Integer cnt;
    private java.util.List<List> list = new ArrayList<List>();

    /**
     * @return The city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * @return The cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod The cod
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @return The message
     */
    public Float getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    public void setMessage(Float message) {
        this.message = message;
    }

    /**
     * @return The cnt
     */
    public Integer getCnt() {
        return cnt;
    }

    /**
     * @param cnt The cnt
     */
    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    /**
     * @return The list
     */
    public java.util.List<List> getList() {
        return list;
    }

    /**
     * @param list The list
     */
    public void setList(java.util.List<List> list) {
        this.list = list;
    }

}