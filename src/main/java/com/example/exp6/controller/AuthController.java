package com.example.exp6.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class AuthController {

 @PostMapping("/login")
 public Map<String,String> login(@RequestBody Map<String,String> user){

  String username=user.get("username");
  String password=user.get("password");

  if(username.equals("user123") && password.equals("password123")){

   Map<String,String> response=new HashMap<>();
   response.put("token","sample-jwt-token");

   return response;
  }

  throw new RuntimeException("Invalid Login");
 }

 @GetMapping("/protected")
 public String protectedRoute(){
  return "Access granted to protected route";
 }

}