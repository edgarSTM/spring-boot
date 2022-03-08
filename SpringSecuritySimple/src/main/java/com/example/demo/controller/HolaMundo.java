package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundo {

	    @GetMapping("/hola")
	    public String saludar() {
	        return "Hola!! Accedio con las claves correctas! 🚀";
	    }
}
