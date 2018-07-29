package com.oauth.security;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController("/")
public class HelloWorldController {

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/hi")
    public String hi() {

        return "hi";

    }

    @GetMapping("/current")
    public Principal getUser(Principal principal) {
        return principal;
    }



}
