package br.ufpb.dcx.farias.pedro.exercicio2;
import java.util.Objects;

public class Filme{

    private String titulo;
    private String diretor;
    private int anoFilme;

    public Filme(String titulo, String diretor, int anoFilme){

        this.titulo = titulo;
        this.diretor = diretor;
        this.anoFilme = anoFilme;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getDiretor(){
        return this.diretor;
    }
    public int getAnoFilme(){
        return this.anoFilme;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", anoFilme=" + anoFilme +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return anoFilme == filme.anoFilme && Objects.equals(titulo, filme.titulo) && Objects.equals(diretor, filme.diretor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, diretor, anoFilme);
    }
}