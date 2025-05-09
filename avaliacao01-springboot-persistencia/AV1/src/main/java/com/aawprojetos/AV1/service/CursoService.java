package com.aawprojetos.AV1.service;
import com.aawprojetos.AV1.model.Curso;
import com.aawprojetos.AV1.repository.CursoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }
    public Optional<Curso> findById(Long id) {
        return cursoRepository.findById(id);
    }
    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }
    public void deleteById(Long id) {
        cursoRepository.deleteById(id);
    }
}
