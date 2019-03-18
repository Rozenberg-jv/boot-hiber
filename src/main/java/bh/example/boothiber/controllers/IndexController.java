package bh.example.boothiber.controllers;

import bh.example.boothiber.domain.entity.Employee;
import bh.example.boothiber.dto.EmployeeDto;
import bh.example.boothiber.services.EmployeeService;
import bh.example.boothiber.services.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class IndexController {

	private final EmployeeService employeeService;
	private final SpecialtyService specialtyService;

	@Autowired
	public IndexController(EmployeeService employeeService, SpecialtyService specialtyService) {

		this.employeeService = employeeService;
		this.specialtyService = specialtyService;
	}

	@GetMapping("/")
	public ModelAndView index() {

		List<Employee> list = employeeService.getAllEmployees();

		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		map.put("specialties", specialtyService.getAllSpecialtiesList());
		map.put("employeeDto", new EmployeeDto());

		return new ModelAndView("index", map);
	}

}
