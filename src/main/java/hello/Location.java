package hello;

public class Location {

    private final String content;
  
    public Location(String content)
    {
        this.content = content;
    }
    
    Application app= new Application();
    
  //Method to get the weather conditions, by passing the location to the corresponding method in Application class
    public String getCurrent() {
		return app.getWeatherCondition(content);
    }
}