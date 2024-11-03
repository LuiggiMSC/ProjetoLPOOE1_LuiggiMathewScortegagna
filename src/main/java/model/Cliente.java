package model;

public class Cliente extends Pessoa {
    private String endereco;
    private String email;

    public Cliente(String nome, String telefone, String cpf, String endereco, String email) {
        super(nome, telefone, cpf);
        this.endereco = endereco;
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
