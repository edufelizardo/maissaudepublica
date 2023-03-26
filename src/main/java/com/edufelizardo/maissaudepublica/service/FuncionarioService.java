package com.edufelizardo.maissaudepublica.service;

import com.edufelizardo.maissaudepublica.dto.EnderecoDTO;
import com.edufelizardo.maissaudepublica.dto.FuncionarioDTO;
import com.edufelizardo.maissaudepublica.dto.PessoaDTO;
import com.edufelizardo.maissaudepublica.model.Endereco;
import com.edufelizardo.maissaudepublica.model.Funcionario;
import com.edufelizardo.maissaudepublica.model.Pessoa;
import com.edufelizardo.maissaudepublica.model.exception.FuncionarioNaoEncontradoException;
import com.edufelizardo.maissaudepublica.model.exception.FuncionarioNotFoundException;
import com.edufelizardo.maissaudepublica.repositories.EnderecoRepository;
import com.edufelizardo.maissaudepublica.repositories.FuncionarioRepository;
import com.edufelizardo.maissaudepublica.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

//    public List<FuncionarioDTO> buscarTodosFuncionarios() {
//        Iterable<Funcionario> funcionarios = funcionarioRepository.findAll();
//        List<FuncionarioDTO> funcionarioDTOS =new ArrayList<>();
//        for (Funcionario funcionario:funcionarios) {
//            FuncionarioDTO funcionarioDTO = new FuncionarioDTO(funcionario);
//            funcionarioDTOS.add(funcionarioDTO);
//        }
//        return funcionarioDTOS;
//    }

    public FuncionarioDTO buscarPorId(Long id) throws FuncionarioNaoEncontradoException {
        Funcionario funcionario = funcionarioRepository.findById(id)
                .orElseThrow(() -> new FuncionarioNaoEncontradoException(id));

        FuncionarioDTO dto = new FuncionarioDTO();
        dto.setId(funcionario.getId());
        dto.setDataDeAdmissao(funcionario.getDataDeAdmissao());
        dto.setRegistroProfissional(funcionario.getRegistroProfissional());
        dto.setSalario(funcionario.getSalario());

        PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setId(funcionario.getPessoa().getId());
        pessoaDTO.setNomeCompleto(funcionario.getPessoa().getNomeCompleto());
        pessoaDTO.setDataDeNascimento(funcionario.getPessoa().getDataDeNascimento());
        pessoaDTO.setIdade(funcionario.getPessoa().getIdade());
        pessoaDTO.setCpf(funcionario.getPessoa().getCpf());
        pessoaDTO.setEmail(funcionario.getPessoa().getEmail());
        pessoaDTO.setTelefones(funcionario.getPessoa().getTelefones());

        EnderecoDTO enderecoDTO = new EnderecoDTO();
        enderecoDTO.setId(funcionario.getPessoa().getEndereco().getId());
        enderecoDTO.setCep(funcionario.getPessoa().getEndereco().getCep());
        enderecoDTO.setLogradouro(funcionario.getPessoa().getEndereco().getLogradouro());
        enderecoDTO.setNumero(funcionario.getPessoa().getEndereco().getNumero());
        enderecoDTO.setComplemento(funcionario.getPessoa().getEndereco().getComplemento());
        enderecoDTO.setBairro(funcionario.getPessoa().getEndereco().getBairro());
        enderecoDTO.setLocalidade(funcionario.getPessoa().getEndereco().getLocalidade());
        enderecoDTO.setUf(funcionario.getPessoa().getEndereco().getUf());
        enderecoDTO.setIbge(funcionario.getPessoa().getEndereco().getIbge());
        enderecoDTO.setGia(funcionario.getPessoa().getEndereco().getGia());
        enderecoDTO.setDdd(funcionario.getPessoa().getEndereco().getDdd());
        enderecoDTO.setSiafi(funcionario.getPessoa().getEndereco().getSiafi());

        pessoaDTO.setEndereco(enderecoDTO);
        dto.setPessoa(pessoaDTO);

        return dto;
    }
    public List<FuncionarioDTO> buscarTodos() {
        Iterable<Funcionario> funcionarios = funcionarioRepository.findAll();
        List<FuncionarioDTO> funcionariosDTO = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO(funcionario);
            funcionariosDTO.add(funcionarioDTO);
        }
        return funcionariosDTO;
    }

    public Funcionario salvar(FuncionarioDTO funcionarioDTO) {

        // Criar objeto Endereco a partir do DTO e salvar no repository
        Endereco endereco = new Endereco();
        endereco.setCep(funcionarioDTO.getPessoa().getEndereco().getCep());
        endereco.setLogradouro(funcionarioDTO.getPessoa().getEndereco().getLogradouro());
        endereco.setNumero(funcionarioDTO.getPessoa().getEndereco().getNumero());
        endereco.setComplemento(funcionarioDTO.getPessoa().getEndereco().getComplemento());
        endereco.setBairro(funcionarioDTO.getPessoa().getEndereco().getBairro());
        endereco.setLocalidade(funcionarioDTO.getPessoa().getEndereco().getLocalidade());
        endereco.setUf(funcionarioDTO.getPessoa().getEndereco().getUf());
        endereco.setIbge(funcionarioDTO.getPessoa().getEndereco().getIbge());
        endereco.setGia(funcionarioDTO.getPessoa().getEndereco().getGia());
        endereco.setDdd(funcionarioDTO.getPessoa().getEndereco().getDdd());
        endereco.setSiafi(funcionarioDTO.getPessoa().getEndereco().getSiafi());
        endereco = enderecoRepository.save(endereco);

        // Criar objeto Pessoa a partir do DTO e salvar no repository
        Pessoa pessoa = new Pessoa();
        pessoa.setNomeCompleto(funcionarioDTO.getPessoa().getNomeCompleto());
        pessoa.setDataDeNascimento(funcionarioDTO.getPessoa().getDataDeNascimento());
        pessoa.setCpf(funcionarioDTO.getPessoa().getCpf());
        pessoa.setEmail(funcionarioDTO.getPessoa().getEmail());
        pessoa.setTelefones(funcionarioDTO.getPessoa().getTelefones());
        pessoa.setEndereco(endereco);
        pessoa = pessoaRepository.save(pessoa);

        // Criar objeto Funcionario a partir do DTO, associando Pessoa e Endereco, e salvar no repository
        Funcionario funcionario = new Funcionario();
        funcionario.setDataDeAdmissao(funcionarioDTO.getDataDeAdmissao());
        funcionario.setRegistroProfissional(funcionarioDTO.getRegistroProfissional());
        funcionario.setSalario(funcionarioDTO.getSalario());
        funcionario.setPessoa(pessoa);
        funcionario = funcionarioRepository.save(funcionario);

        return funcionario;
    }
    @Transactional
    public Funcionario atualizarFuncionario(FuncionarioDTO funcionarioDTO) throws FuncionarioNotFoundException {
        Optional<Funcionario> optionalFuncionario = funcionarioRepository.findById(funcionarioDTO.getId());

        if (optionalFuncionario.isPresent()) {
            Funcionario funcionario = optionalFuncionario.get();

            // Atualiza as informações do funcionário
            funcionario.setDataDeAdmissao(funcionarioDTO.getDataDeAdmissao());
            funcionario.setRegistroProfissional(funcionarioDTO.getRegistroProfissional());
            funcionario.setSalario(funcionarioDTO.getSalario());

            // Atualiza as informações da pessoa
            Pessoa pessoa = funcionario.getPessoa();
            pessoa.setNomeCompleto(funcionarioDTO.getPessoa().getNomeCompleto());
            pessoa.setDataDeNascimento(funcionarioDTO.getPessoa().getDataDeNascimento());
            pessoa.setIdade(funcionarioDTO.getPessoa().getIdade());
            pessoa.setCpf(funcionarioDTO.getPessoa().getCpf());
            pessoa.setTelefones(funcionarioDTO.getPessoa().getTelefones());
            pessoa.setEmail(funcionarioDTO.getPessoa().getEmail());

            // Atualiza as informações do endereço
            Endereco endereco = pessoa.getEndereco();
            endereco.setCep(funcionarioDTO.getPessoa().getEndereco().getCep());
            endereco.setLogradouro(funcionarioDTO.getPessoa().getEndereco().getLogradouro());
            endereco.setNumero(funcionarioDTO.getPessoa().getEndereco().getNumero());
            endereco.setComplemento(funcionarioDTO.getPessoa().getEndereco().getComplemento());
            endereco.setBairro(funcionarioDTO.getPessoa().getEndereco().getBairro());
            endereco.setLocalidade(funcionarioDTO.getPessoa().getEndereco().getLocalidade());
            endereco.setUf(funcionarioDTO.getPessoa().getEndereco().getUf());
            endereco.setIbge(funcionarioDTO.getPessoa().getEndereco().getIbge());
            endereco.setGia(funcionarioDTO.getPessoa().getEndereco().getGia());
            endereco.setDdd(funcionarioDTO.getPessoa().getEndereco().getDdd());
            endereco.setSiafi(funcionarioDTO.getPessoa().getEndereco().getSiafi());

            // Persiste as alterações no banco de dados
            enderecoRepository.save(endereco);
            pessoaRepository.save(pessoa);
            funcionarioRepository.save(funcionario);

            return funcionario;
        } else {
            throw new FuncionarioNotFoundException();
        }
    }
}
