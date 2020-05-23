package com.gabriel.learning.controller;

import java.text.ParseException;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
	//Go check the title of the table! It's binded!
	@GetMapping("/dashboard")
	public String main(Model model) throws ParseException{
		
		HashMap<String, Object> columns = new HashMap<String, Object>();
		
		columns.put("column1", "Id");
		columns.put("column2", "Name");
		columns.put("column3", "Value");
		columns.put("column4", "Section");
		columns.put("column5", "Description");
		
		model.addAttribute("columns", columns);
		
		model.addAttribute("sectionTitle", "Main table"); //<h2 th:text=${sectionTitle}></h2>
	    return "index";
	}
	
	//You should call a service and add the attributes you want to the Model!
	//This is just an example of how you could pass attributes to the model.

}
