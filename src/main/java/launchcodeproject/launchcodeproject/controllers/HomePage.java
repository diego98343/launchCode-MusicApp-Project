package launchcodeproject.launchcodeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class HomePage {

    @RequestMapping("/")
    public String getHomePage(){

        return "homePage";
    }
}
