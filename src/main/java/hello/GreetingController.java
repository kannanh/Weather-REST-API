package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String display= "%s";

	// Maps requests for current weather conditions 
    @RequestMapping("/weather") 
    public Location location(@RequestParam(value="location", required=false, defaultValue="xyz") String location) 
    {
        return new Location(String.format(display, location));
    }
    
    // Maps requests for forecast of weather for tomorrow
    @RequestMapping("/forecast") 
    public Forecast forecast(@RequestParam(value="location", required=false, defaultValue="xyz") String location) 
    {
        return new Forecast(String.format(display, location));
    }
          
   }