package bh.example.boothiber.domain.repository;

import bh.example.boothiber.domain.entity.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepository extends JpaRepository<Specialty, Integer> {

}
