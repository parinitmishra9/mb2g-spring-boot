package guru.springframework.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project mb2g-spring-boot
 * Created by @Author Parinit on 4/26/2020
 * at 2:36 PM
 */
@RestController
public class ExampleController {

    @RequestMapping("/")
    public Map<String, Object> getIndex() {
        Map<String, Object> returnVal = new HashMap<>();

        returnVal.put("Hello", "World");

        return returnVal;
    }
}
