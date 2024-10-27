package com.program.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/emp Save")
    public String loadEmpSave() {
        return "emp_save";  // Thymeleaf will automatically look for emp_save.html
    }

    @GetMapping("/empEdit")
    public String loadEmpEdit() {
        return "emp_edit";  // Thymeleaf will automatically look for emp_edit.html
    }

 
}
