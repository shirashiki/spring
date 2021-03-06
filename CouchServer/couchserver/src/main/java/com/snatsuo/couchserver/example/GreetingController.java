package com.snatsuo.couchserver.example;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
/**
 * A simple controller based on Spring docs, which listens at localhost:8080/greeting.
 * Note that the code automatically returns the content in JSON format
 * @author silvio hirashiki
 *
 */
public class GreetingController {

	  	private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/greeting")
	    public @ResponseBody Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
	        return new Greeting(counter.incrementAndGet(),
	                            String.format(template, name));
	    }
}
