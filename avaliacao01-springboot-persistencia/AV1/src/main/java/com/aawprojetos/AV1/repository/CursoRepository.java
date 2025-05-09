package com.aawprojetos.AV1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aawprojetos.AV1.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
