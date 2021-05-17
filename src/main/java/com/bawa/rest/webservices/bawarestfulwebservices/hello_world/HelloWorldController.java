package com.bawa.rest.webservices.bawarestfulwebservices.hello_world;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
public class HelloWorldController {
	
	
	//GET
	// URI - hello-world
	//method - "hello-world"
	//@RequestMapping(method=RequestMethod.GET, path = "/hello-world")
	@GetMapping(path="/hello-world")
	public String helloworld(){
		
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloworldBean(){
		
		return new HelloWorldBean("Hello World");
	}
	
	//hello-world/bawa
	@GetMapping(path="/hello-world/{name}")
	public HelloWorldBean helloworldPathVariable(@PathVariable String name){
		String names[] = name.split(",");
		StringBuffer mess = new StringBuffer(); 
		for (String var : names) {
			mess.append(" -- " + var);
		}
		
		
		return new HelloWorldBean(String.format("Hello World, %s", mess));
	}

}
