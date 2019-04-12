package com.cerner.cts.oss.theapp.greetingscontroller;

import com.cerner.cts.oss.theapp.greeting.service.layer.GreetingService;
import com.cerner.cts.oss.theapp.greeting.service.layer.MapGreetingService;
import com.cerner.cts.oss.theapp.hello.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
public class GreetingController {

    //private static final String template = "Hello, %s!";
    private final GreetingService service;

    @Autowired
    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @RequestMapping(method=POST, value="/greeting")
    public Greeting save(@RequestBody Greeting greeting){

        return service.save(greeting);

    }

    @RequestMapping(method=GET, value="/greeting")
    public Collection<Greeting> display(){

        return service.getGreetings();

    }


    /*
    @RequestMapping(method=GET, value="/greeting")
    public List<Greeting> getGreeting(){
        return myGreetings;

    }
    */



/*



    //*****training - Spring Boot Web Service Part I *****
    //Returns Hello World when /greeting is entered into browser
    @RequestMapping("/greeting")
    public Greeting displayGreeting(){
        Greeting newGreeting = new Greeting("Hello World");
        return newGreeting;
    }

    //return Hello, World! as default
    //return Hello, <value>! if user enters /greetings?name=<value> in browser
    @RequestMapping(method=GET, value = "/greetings")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(String.format(template, name));
    }

    //*****training - Spring Boot Web Service Part II *****
    //Takes value from URL and stores in aName ex /greetings/Brad
    //returns Hello, Brad!
    @RequestMapping(method=GET, value = "/greetings/{aName}")
    public Greeting nameGreeting(@PathVariable String aName){
        return new Greeting(String.format(template, aName));
    }
*/

}
