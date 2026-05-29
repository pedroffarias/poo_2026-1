package br.ufpb.dcx.farias.pedro.exercicio5;
import java.util.Objects;

public class Contato {

    private String nome;
    private int diaAniversario;
    private int mesAniversario;

    public Contato(String nome, int diaAniversario, int mesAniversario){

        this.nome = nome;
        this.diaAniversario = diaAniversario;
        this.mesAniversario = mesAniversario;
        }

    public int getDiaAniversario(){
        return this.diaAniversario;
    }
    public void setDiaAniversario(int diaAniversario){
        this.diaAniversario = diaAniversario;
    }
    public int getMesAniversario(){
        return this.mesAniversario;
    }
    public void setMesAniversario(int mesAniversario){
        this.mesAniversario = mesAniversario;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + ", Dia do Aniversário: " + this.getDiaAniversario() + ", Mês de Aniversário: " + this.getMesAniversario();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
