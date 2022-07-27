package Spring.service.impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring.Data.JPA.demo.repository.AlunoRepository;
import Spring.Data.JPA.demo.repository.MatriculaRepository;
import Spring.service.IMatriculaService;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

  @Autowired
  private MatriculaRepository matriculaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  
  public Matricula MatriculaServiceImpl(Long getAlunoI) {
    Matricula matricula = new Matricula();
    Object form;
    Aluno aluno = alunoRepository.findById(getAlunoI).get();

    matricula.setAluno(aluno);

    return matriculaRepository.save(matricula);
  }

  @Override
  public Matricula get(Long id) {
    return matriculaRepository.findById(id).get();
  }

  @Override
  public List<Matricula> getAll(String bairro) {

    if(bairro == null){
      return matriculaRepository.findAll();
    }else{
      return matriculaRepository.findAlunosMatriculadosBairro(bairro);
    }

  }

  @Override
  public void delete(Long id) {}

  @Override
  public Matricula create(Matricula form) {
    // TODO Auto-generated method stub
    return null;
  }



}