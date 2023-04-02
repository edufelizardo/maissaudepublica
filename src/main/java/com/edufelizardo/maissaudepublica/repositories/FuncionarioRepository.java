package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.Funcionario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
    List<Funcionario> findByPessoaNomeCompleto(String nomeCompleto);

    List<Funcionario> findByPessoaNomeCompletoContainingIgnoreCase(String parteDoNome);

    List<Funcionario> findByPessoaCpf(String cpf);

    List<Funcionario> findByPessoaCpfContaining(String cpf);

    List<Funcionario> findByFuncaoNomeFuncao(String nomeFuncao);

    List<Funcionario> findByDepartamentoNomeDoDepartamento(String nomeDoDepartamento);

//    @Query("SELECT f FROM Funcionario f JOIN f.programaDeSaudes p WHERE p.nome = :nomePrograma")
//    List<Funcionario> findByProgramaDeSaudeNomeProgramaDesaude(@Param("nomeProgramaDesaude") String nomeProgramaDesaude);

    List<Funcionario> findByEscalaTrabalhoNomeDoExpediente(String nomeDoExpediente);
}
