package com.atr.springsecurity.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", "/"})
    public String home(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String firstName = authentication.getName();
            model.addAttribute("firstName", firstName);
        }
        return "index";
    }


    @GetMapping({"/contact"})
    public String contact() {
        return "contact";
    }

    @GetMapping({"/profile"})
    public String profile(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            String firstName = authentication.getName();
            model.addAttribute("firstName", firstName);
        }
        return "profile";
    }
}