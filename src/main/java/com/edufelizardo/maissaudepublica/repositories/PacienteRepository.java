package com.edufelizardo.maissaudepublica.repositories;

import com.edufelizardo.maissaudepublica.model.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends CrudRepository<Paciente, Long> {
    List<Paciente> findByPessoaNomeCompleto(String nomeCompleto);

    List<Paciente> findByPessoaNomeCompletoContainingIgnoreCase(String nomeCompleto);

    List<Paciente> findByCartaoDoSUS(String cartaoDoSUS);

    List<Paciente> findByProntuarioNumeroProntuario(String numeroProntuario);

    List<Paciente> findByPessoaEnderecoLogradouroAndPessoaEnderecoNumero(String logradouro, int numero);

}
