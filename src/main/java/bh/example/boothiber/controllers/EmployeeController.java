package bh.example.boothiber.controllers;

import bh.example.boothiber.dto.EmployeeDto;
import bh.example.boothiber.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping
public class EmployeeController {

	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {

		this.employeeService = employeeService;
	}

	@PostMapping("/add")
	public RedirectView addNewEmployee(@ModelAttribute("employeeDto") EmployeeDto dto) {

		employeeService.addNewEmployee(dto);

		return new RedirectView("");
	}

}
