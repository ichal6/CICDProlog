package com.lechowicz.cicdprolog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Test pipeline";
    }
}
