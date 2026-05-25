package br.ufpb.dcx.farias.pedro.exercicio1;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;
    private double media;

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public Aluno(String nome, String matricula){

        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[3];
    }

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public double[] getNotas(){

        return this.notas;
    }

    public void adicionarNota(int indice, double nota){
        if(indice >= 1 && indice <= 3){
            this.notas[indice - 1] = nota;
        }
    }

    public double getMedia() throws NotasInexistentesException{
        if(notas == null || this.notas.length == 0){
            throw new NotasInexistentesException("O aluno não possui nenhuma nota cadastrada no sistema.");
        }

        double soma = 0;
        for(double nota : this.notas){
            soma += nota;
        }

        return soma / this.notas.length;
    }

    @Override
    public String toString(){
        String valorMedia;

        try {
            valorMedia = String.valueOf(getMedia());
        } catch (NotasInexistentesException e) {
            valorMedia = "Indisponível";
        }
        return "O aluno de nome: "+ this.nome +", de matrícula: "+ this.matricula +" obteve " + valorMedia + " de média final.";
    }
}
