package launchcodeproject.launchcodeproject.controllers.userControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserHomePage {

    @GetMapping("/a")
    public String getExplorePage (){

        return "user/userLogInp";
    }
    @GetMapping("/userHome")
    public String getUserHome (){

        return "user/userHomePage";
    }

}
