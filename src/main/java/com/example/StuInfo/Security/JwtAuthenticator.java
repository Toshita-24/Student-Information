package com.example.StuInfo.Security;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticator {
 
 @Autowired
 private UserDetailsService userDetailsService;
 
 public String generateToken(User user) {
	 return null;
 }
     // Generate JWT token

public UserDetailsService getUserDetailsService() {
	return userDetailsService;
}

public void setUserDetailsService(UserDetailsService userDetailsService) {
	this.userDetailsService = userDetailsService;
}
 }

