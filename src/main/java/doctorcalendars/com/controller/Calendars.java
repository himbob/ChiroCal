package doctorcalendars.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calendars {

    @RequestMapping("/") public Calendar show(){
        return new Calendar("deborah");
    }


}
