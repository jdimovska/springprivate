package com.example.terraformprivateapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class Controller {

  @GetMapping()
  public String findByBlogId() {
    return "TEST OK";
  }
}
