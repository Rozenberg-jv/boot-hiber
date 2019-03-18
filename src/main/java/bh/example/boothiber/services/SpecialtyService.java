package bh.example.boothiber.services;

import bh.example.boothiber.domain.entity.Specialty;
import bh.example.boothiber.domain.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyService {

	private final SpecialtyRepository specialtyRepository;

	@Autowired
	public SpecialtyService(SpecialtyRepository specialtyRepository) {

		this.specialtyRepository = specialtyRepository;
	}

	public List<Specialty> getAllSpecialtiesList() {

		return specialtyRepository.findAll();
	}
}
