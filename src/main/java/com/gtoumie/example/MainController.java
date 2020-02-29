package com.gtoumie.example;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	String hi() {
		return "hello";
	}
}
