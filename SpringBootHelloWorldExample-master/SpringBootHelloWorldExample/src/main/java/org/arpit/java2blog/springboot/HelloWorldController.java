
package org.arpit.java2blog.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {
 
	@GetMapping("/")
    public String index()
    {
        return "index";
    }
	
	@GetMapping("/helloworld")
	 public ModelAndView hello() {
	 
	  String helloWorldMessage = "Hello world from java2blog!";
	  return new ModelAndView("hello", "message", helloWorldMessage);
	 }
}
