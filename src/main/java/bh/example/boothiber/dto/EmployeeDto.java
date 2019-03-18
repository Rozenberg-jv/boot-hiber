package bh.example.boothiber.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Getter
@Setter
public class EmployeeDto {

	private String name;

	private int specialtyId;

	private int salary;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;

	public EmployeeDto() {

	}

	public EmployeeDto(String name, int specialtyId, int salary, Date date) {

		this.name = name;
		this.specialtyId = specialtyId;
		this.salary = salary;
		this.date = date;
	}
}
