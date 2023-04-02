package com.edufelizardo.maissaudepublica.dto;

import com.edufelizardo.maissaudepublica.model.*;
import jakarta.validation.constraints.DecimalMax;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;


public class FuncionarioDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = -4736104246988594075L;
    private Long id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeAdmissao;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeDemissao;
    private String registroProfissional;
    @DecimalMax(value = "1000000.00",
                message = "O salário não pode ser maior do que 1.000.000,00")
    private BigDecimal salario;
    private PessoaDTO pessoa;
    private EscalaDeTrabalhoDTO escalaDeTrabalhoDTO;
    private FormacaoDTO formacao;
    private DepartamentoDTO departamento;
    private FuncaoDTO funcao;
    private List<ProgramaDeSaudeDTO> programaDeSaudes = new ArrayList<>();

    public FuncionarioDTO() {
    }

    public FuncionarioDTO(Funcionario funcionario) {
        this.id = id;
        this.dataDeAdmissao = funcionario.getDataDeAdmissao();
        this.dataDeDemissao = funcionario.getDataDeDemissao();
        this.registroProfissional = funcionario.getRegistroProfissional();
        this.salario = funcionario.getSalario();
        this.pessoa = new PessoaDTO(funcionario.getPessoa());
        this.escalaDeTrabalhoDTO = new EscalaDeTrabalhoDTO(funcionario.getEscalaTrabalho());
        this.formacao = new FormacaoDTO(funcionario.getFormacao());
        this.departamento = new DepartamentoDTO(funcionario.getDepartamento());
        this.funcao = new FuncaoDTO(funcionario.getFuncao());
        this.programaDeSaudes = new List<ProgramaDeSaudeDTO>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<ProgramaDeSaudeDTO> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(ProgramaDeSaudeDTO programaDeSaudeDTO) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends ProgramaDeSaudeDTO> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends ProgramaDeSaudeDTO> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public ProgramaDeSaudeDTO get(int index) {
                return null;
            }

            @Override
            public ProgramaDeSaudeDTO set(int index, ProgramaDeSaudeDTO element) {
                return null;
            }

            @Override
            public void add(int index, ProgramaDeSaudeDTO element) {

            }

            @Override
            public ProgramaDeSaudeDTO remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<ProgramaDeSaudeDTO> listIterator() {
                return null;
            }

            @Override
            public ListIterator<ProgramaDeSaudeDTO> listIterator(int index) {
                return null;
            }

            @Override
            public List<ProgramaDeSaudeDTO> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public LocalDate getDataDeDemissao() {
        return dataDeDemissao;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public EscalaDeTrabalhoDTO getEscalaDeTrabalhoDTO() {
        return escalaDeTrabalhoDTO;
    }

    public FormacaoDTO getFormacao() {
        return formacao;
    }

    public DepartamentoDTO getDepartamento() {
        return departamento;
    }

    public FuncaoDTO getFuncao() {
        return funcao;
    }

    public List<ProgramaDeSaudeDTO> getProgramaDeSaudes() {
        return programaDeSaudes;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public void setDataDeDemissao(LocalDate dataDeDemissao) {
        this.dataDeDemissao = dataDeDemissao;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    public void setEscalaDeTrabalhoDTO(EscalaDeTrabalhoDTO escalaDeTrabalhoDTO) {
        this.escalaDeTrabalhoDTO = escalaDeTrabalhoDTO;
    }

    public void setFormacao(FormacaoDTO formacao) {
        this.formacao = formacao;
    }

    public void setDepartamento(DepartamentoDTO departamento) {
        this.departamento = departamento;
    }

    public void setFuncao(FuncaoDTO funcao) {
        this.funcao = funcao;
    }

    public void setProgramaDeSaudes(List<ProgramaDeSaudeDTO> programaDeSaudes) {
        this.programaDeSaudes = programaDeSaudes;
    }
}
