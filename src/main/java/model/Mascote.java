package model;

public class Mascote {
    private int idade;
    private TipoMascote tipo;
    private Cliente dono;

    public Mascote(int idade, TipoMascote tipo, Cliente dono) {
        this.idade = idade;
        this.tipo = tipo;
        this.dono = dono;
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
