package com.aawprojetos.AV1.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.aawprojetos.AV1.model.Aluno;
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
