package model;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "tb_cliente")
public class Cliente extends Pessoa {
    private String endereco;
    private String email;

    @OneToMany(mappedBy = "dono", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mascote> mascotes;

    public Cliente(String nome, String telefone, String cpf, String endereco, String email) {
        super(nome, telefone, cpf);
        this.endereco = endereco;
        this.email = email;
    }

    public Cliente() {}

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

    public List<Mascote> getMascotes() {
        return mascotes;
    }

    public void setMascotes(List<Mascote> mascotes) {
        this.mascotes = mascotes;
    }
}
