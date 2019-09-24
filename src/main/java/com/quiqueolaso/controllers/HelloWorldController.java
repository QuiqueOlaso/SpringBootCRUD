package com.quiqueolaso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// TODO: Auto-generated Javadoc
/**
 * The Class HelloWorldController.
 */
@Controller
public class HelloWorldController {

	/**
	 * Gets the home page.
	 *
	 * @return the home page
	 */
	 // @GetMapping("/") equivale a @RequestMapping(value = "/", method = RequestMethod.GET)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePage() {
		return "index";
	}

}
