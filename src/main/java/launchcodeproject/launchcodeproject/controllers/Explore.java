package launchcodeproject.launchcodeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/explore")
public class Explore {

    @GetMapping("/main")
    public String getExplorePage (){

        return "explorePage";
    }
}
