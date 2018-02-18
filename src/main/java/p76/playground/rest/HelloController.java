package p76.playground.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import p76.playground.db.School;
import p76.playground.rest.SchoolRepository;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String home(String name) {
        return "Hello World! " + name;
    }


}
