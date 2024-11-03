package model;

public class Veterinario extends Pessoa {
    private float salario;
    private Especializacao especializacao;

    public Veterinario(String nome, String telefone, String cpf, float salario, Especializacao especializacao) {
        super(nome, telefone, cpf);
        this.salario = salario;
        this.especializacao = especializacao;
    }

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
}
