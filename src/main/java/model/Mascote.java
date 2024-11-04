package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "tb_mascote")
public class Mascote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int idade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoMascote tipo;

    @ManyToOne
    @JoinColumn(name = "dono_id", nullable = false)
    private Cliente dono;

    public Mascote(int idade, TipoMascote tipo, Cliente dono) {
        this.idade = idade;
        this.tipo = tipo;
        this.dono = dono;
    }

    public Mascote() {
    }

    public Long getId() {
        return id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TipoMascote getTipo() {
        return tipo;
    }

    public void setTipo(TipoMascote tipo) {
        this.tipo = tipo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }
}
