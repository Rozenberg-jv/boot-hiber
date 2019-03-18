package bh.example.boothiber.services;

import bh.example.boothiber.domain.entity.Employee;
import bh.example.boothiber.domain.entity.Specialty;
import bh.example.boothiber.domain.repository.EmployeeRepository;
import bh.example.boothiber.domain.repository.SpecialtyRepository;
import bh.example.boothiber.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	private final SpecialtyRepository specialtyRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository, SpecialtyRepository specialtyRepository) {

		this.employeeRepository = employeeRepository;
		this.specialtyRepository = specialtyRepository;
	}

	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}

	public void addNewEmployee(EmployeeDto dto) {

		Employee employee = new Employee();

		employee.setName(dto.getName());
		employee.setSalary(dto.getSalary());
		employee.setDateOfEmployment(dto.getDate());

		Specialty specialty = specialtyRepository.getOne(dto.getSpecialtyId());
		employee.setSpecialty(specialty);
		
		employeeRepository.saveAndFlush(employee);
	}
}
