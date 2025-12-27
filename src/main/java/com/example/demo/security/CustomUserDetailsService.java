package com.example.demo.security;

public class CustomUserDetailsService {

    public CustomUserDetailsService() {
        // User details service placeholder
    }

    public String loadUserByUsername(String username) {
        return "User: " + username;
    }
}
