package com.program.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.program.entity.Employee;
import com.program.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private EmpService empService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/empSave")
    public String loadEmpSave() {
        return "emp_save";  // Thymeleaf will automatically look for emp_save.html
    }

    @GetMapping("/empEdit")
    public String loadEmpEdit() {
        return "emp_edit";  // Thymeleaf will automatically look for emp_edit.html
    }

    
    

	@PostMapping("/saveEmp")
	public String saveEmp(@ModelAttribute Employee emp, HttpSession session) {
		// System.out.println(emp);

		Employee newEmp = empService.saveEmp(emp);

		if (newEmp != null) {
			// System.out.println("save success");
			session.setAttribute("msg", "Register sucessfully");
		} else {
			// System.out.println("something wrong on server");
			session.setAttribute("msg", "something wrong on server");
		}

		return "redirect:/emp_save";
	}
}
