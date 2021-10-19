package project_lesson7;

public class Weather {
    //cityName, weatherText, degrees
    private String cityName;
    private String weatherText;
    Integer temp;

    public Weather(String cityName, String weatherText, Integer temp) {
        this.cityName = cityName;
        this.weatherText = weatherText;
        this.temp = temp;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "cityName='" + cityName + '\'' +
                ", weatherText='" + weatherText + '\'' +
                ", degrees=" + temp +
                '}';
    }
}
