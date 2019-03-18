package bh.example.boothiber.domain.repository;

import bh.example.boothiber.domain.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
