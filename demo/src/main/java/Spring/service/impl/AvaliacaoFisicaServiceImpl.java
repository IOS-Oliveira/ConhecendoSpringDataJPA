package Spring.service.impl;

import me.dio.academia.digital.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring.Data.JPA.demo.controller.AvaliacaoFisica;
import Spring.Data.JPA.demo.controller.AvaliacaoFisicaForm;
import Spring.Data.JPA.demo.repository.AlunoRepository;
import Spring.Data.JPA.demo.repository.AvaliacaoFisicaRepository;
import Spring.service.IAvaliacaoFisicaService;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

  @Autowired
  private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

  @Autowired
  private AlunoRepository alunoRepository;

  
  public AvaliacaoFisica create(AvaliacaoFisicaForm ) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setAluno(form.getPeso());
    avaliacaoFisica.setAluno(form.getAltura());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    return null;
  }

  @Override
  public List<AvaliacaoFisica> getAll() {

    return avaliacaoFisicaRepository.findAll();
  }

  
  public AvaliacaoFisica Update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
    // TODO Auto-generated method stub
    return null;
  }

  
  public AvaliacaoFisica Get(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public AvaliacaoFisica update(Long id, AvaliacaoFisica formUpdate) {
    // TODO Auto-generated method stub
    return null;
  }
}