package hello;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {

	// ArrayList with weather conditions of three cities: Tempe, Vegas, Chicago
	public static ArrayList<String> currentWeather = new ArrayList<String>();

    public static void main(String[] args) {
    	
    // Weather values manually added to the ArrayList		
        currentWeather.add("Tempe");
        currentWeather.add("(Condition : Cloudy) (Temperature :70 deg F)");
        currentWeather.add(" Tomorrow: (Condition : Sunny ) (Temperature :max 90 deg F)");
        currentWeather.add("Vegas");
        currentWeather.add("(Condition :Sunny ) (Temperature :90 deg F) ");
        currentWeather.add(" Tomorrow: (Condition :Cloudy ) (Temperature :max 75 deg F)");
        currentWeather.add("Chicago");
        currentWeather.add("(Condition :Rainy ) (Temperature :65 deg F)");
        currentWeather.add(" Tomorrow: (Condition :Cloudy ) (Temperature :max 80 deg F)");
             
    	SpringApplication.run(Application.class, args);
    }
    
    //Method to get current weather conditions of a city passed as 'location'
    String getWeatherCondition(String location)
    {
    	for(int i=0;i<currentWeather.size();i++)
    	{
    		if(currentWeather.get(i).equals(location))
    			return currentWeather.get(i+1).toString();
 
    	}
		return "Location not found. Check the URI!";
    }
    
  //Method to get weather forecast of a city passed as 'location'
    String getForecast(String location)
    {
    	for(int i=0;i<currentWeather.size();i++)
    	{
    		if(currentWeather.get(i).equals(location))
    			return currentWeather.get(i+2).toString();
 
    	}
		return "Location not found. Check the URI!";
    }
     
}