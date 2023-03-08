package studio.thinkground.testproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controller명시
public class HelloController {

    @RequestMapping(value="/hello")
    public String hello(){
        return "Hello world";
    }

}
