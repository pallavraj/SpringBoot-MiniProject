package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fallbackController {

  @GetMapping("/userServiceFallback")
  public String userServiceFallback(){
      return "USER SERVICE IS DOWN AT THIS TIME";
  }

    @GetMapping("/contactServiceFallback")
    public String contactServiceFallback(){
        return "CONTACT SERVICE IS DOWN AT THIS TIME";
    }


}
