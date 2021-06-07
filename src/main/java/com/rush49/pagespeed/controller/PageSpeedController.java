package com.rush49.pagespeed.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagespeed")
public class PageSpeedController {

    @GetMapping
    public String showSignUpForm() {
        return "pagespeed";
    }
}
