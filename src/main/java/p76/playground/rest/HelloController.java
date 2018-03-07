package p76.playground.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String home(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }


}
