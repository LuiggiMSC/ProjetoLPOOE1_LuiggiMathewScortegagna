package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "tb_cliente")
public class Cliente extends Pessoa {

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "dono", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mascote> mascotes;

    @ManyToMany
    @JoinTable(
            name = "tb_veterinario_cliente",
            joinColumns = @JoinColumn(name="cliente_id"),
            inverseJoinColumns = @JoinColumn(name="veterinario_id")
    ) private List<Veterinario> veterinarios;

    public Cliente(String nome, String telefone, String cpf, String endereco, String email) {
        super(nome, telefone, cpf);
        this.endereco = endereco;
        this.email = email;
    }

    public Cliente() {
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

    public List<Mascote> getMascotes() {
        return mascotes;
    }

    public void setMascotes(List<Mascote> mascotes) {
        this.mascotes = mascotes;
    }
    
    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(List<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }
}
