package com.escolar.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escolar.sistema.entities.Student;
import com.escolar.sistema.save.StudentGetDatas;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	void save(StudentGetDatas a);

}
