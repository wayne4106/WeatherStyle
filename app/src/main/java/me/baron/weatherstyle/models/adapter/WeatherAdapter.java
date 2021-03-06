package me.baron.weatherstyle.models.adapter;

import me.baron.weatherstyle.models.style.AQI;
import me.baron.weatherstyle.models.style.Forecast;
import me.baron.weatherstyle.models.style.LifeIndex;
import me.baron.weatherstyle.models.style.RealTime;
import me.baron.weatherstyle.models.style.Weather;

import java.util.List;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         16/2/25
 */
public abstract class WeatherAdapter {

    public abstract int getCityId();

    public abstract String getCityName();

    public abstract String getCityNameEn();

    public abstract RealTime getRealTime();

    public abstract List<Forecast> getForecasts();

    public abstract List<LifeIndex> getLifeIndexes();

    public abstract AQI getAQI();

    public abstract Weather getWeather();
}
