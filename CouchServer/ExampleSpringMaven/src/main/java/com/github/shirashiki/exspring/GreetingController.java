package com.github.shirashiki.exspring;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

	  	private static final String template = "Hello, %s!";

	    @RequestMapping("/greeting")
	    public @ResponseBody Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
	        return new Greeting(1, String.format(template, name));
	    }
}

