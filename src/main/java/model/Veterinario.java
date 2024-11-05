package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "tb_veterinario")
public class Veterinario extends Pessoa {
    @Column(nullable = false)
    private float salario;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Especializacao especializacao;

    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private Veterinario supervisor;

    @OneToMany(mappedBy = "supervisor")
    private List<Veterinario> supervisionados;

    @ManyToMany
    @JoinTable(
        name = "tb_veterinario_cliente",
        joinColumns = @JoinColumn(name = "veterinario_id"),
        inverseJoinColumns = @JoinColumn(name = "cliente_id")
    )
    private Set<Cliente> clientes;

    public Veterinario(String nome, String telefone, String cpf, float salario, Especializacao especializacao) {
        super(nome, telefone, cpf);
        this.salario = salario;
        this.especializacao = especializacao;
    }

    public Veterinario() {}

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Especializacao getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(Especializacao especializacao) {
        this.especializacao = especializacao;
    }

    public Veterinario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Veterinario supervisor) {
        this.supervisor = supervisor;
    }

    public List<Veterinario> getSupervisionados() {
        return supervisionados;
    }

    public void setSupervisionados(List<Veterinario> supervisionados) {
        this.supervisionados = supervisionados;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
}
