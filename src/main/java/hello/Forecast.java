package hello;

public class Forecast {

    private final String content;
  
    //Constructor
    public Forecast(String content)
    {
        this.content = content;
    }
    
    //Object of Application class
    Application app= new Application();
    
    //Method to get the weather forecast, by passing the location to the corresponding method in Application class
    public String getForecast() {
		return app.getForecast(content);
    }
}