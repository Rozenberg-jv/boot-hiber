package bh.example.boothiber.domain.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private int salary;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dateOfEmployment;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Specialty specialty;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "employees_to_projects", joinColumns = @JoinColumn(name = "empl_id"), inverseJoinColumns = @JoinColumn(name = "proj_id"))
	private List<Project> projects;

}
