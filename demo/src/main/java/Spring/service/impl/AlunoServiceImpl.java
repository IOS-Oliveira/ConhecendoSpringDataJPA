package Spring.service.impl;

import me.dio.academia.digital.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring.Data.JPA.demo.controller.AlunoForm;
import Spring.Data.JPA.demo.controller.AvaliacaoFisica;
import Spring.Data.JPA.demo.infra.jackson.utils.JavaTimeUtils;
import Spring.Data.JPA.demo.repository.AlunoRepository;
import Spring.service.IAlunoService;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

  @Autowired
  private AlunoRepository repository;

  
  public Aluno create(AlunoForm) {
    Aluno aluno = new Aluno();
    aluno.setNome(form.getNome());
    aluno.setCpf(form.getCpf());
    aluno.setBairro(form.getBairro());
    aluno.setDataDeNascimento(form.getDataDeNascimento());

    return repository.save(aluno);
  }

  @Override
  public Aluno get(Long id) {
    return null;
  }

  @Override
  public List<Aluno> getAll(String dataDeNascimento) {

    if(dataDeNascimento == null) {
      return repository.findAll();
    } else {
      LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByDataDeNascimento(localDate);
    }

  }

  
  public Aluno update(Long id, AlunoForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {
  }

 
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

    Aluno aluno = repository.findById(id).get();

    return aluno.getAvaliacoes();

  }

  @Override
  public Aluno create(AlunoForm form) {
    // TODO Auto-generated method stub
    return null;
  }

 
  public Aluno Update(Long id, AlunoForm formUpdate) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<AvaliacaoFisica> GetAllAvaliacaoFisicaId(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

}