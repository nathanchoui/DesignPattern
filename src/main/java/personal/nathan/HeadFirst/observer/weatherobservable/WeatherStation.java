package personal.nathan.HeadFirst.observer.weatherobservable;

import personal.nathan.HeadFirst.observer.weatherobservable.display.CurrentConditionsDisplay;
import personal.nathan.HeadFirst.observer.weatherobservable.display.ForecastDisplay;
import personal.nathan.HeadFirst.observer.weatherobservable.display.StatisticsDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
