package com.example.testdynamicreloadconfig.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.code2life.config.DynamicConfig;

@RestController
@Getter
@Setter
@DynamicConfig
public class StudentController {

    @Value("${student.name}")
    private String name;

    @GetMapping("/names")
    public String getNames(){
      return name;
    }

}
