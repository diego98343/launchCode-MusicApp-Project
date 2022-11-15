package launchcodeproject.launchcodeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/homePage")
public class HomePage {

    @RequestMapping("/main")
    public String getHomePage(){

        return "homePage";
    }
}
