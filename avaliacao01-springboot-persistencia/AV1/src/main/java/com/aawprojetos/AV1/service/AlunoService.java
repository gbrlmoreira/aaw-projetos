package com.aawprojetos.AV1.service;

import com.aawprojetos.AV1.model.Aluno;
import com.aawprojetos.AV1.repository.AlunoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> findAll() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> findById(Long id) {
        return alunoRepository.findById(id);
    }

    public Aluno save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
    public void deleteById(Long id) {
        alunoRepository.deleteById(id);
    }
}
