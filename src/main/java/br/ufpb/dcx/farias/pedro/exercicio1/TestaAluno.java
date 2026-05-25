package br.ufpb.dcx.farias.pedro.exercicio1;
import java.util.Scanner;
import java.util.ArrayList;

public class TestaAluno {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Dados do " + i + "º aluno:");
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Matrícula: ");
            String matricula = sc.nextLine();

            Aluno aluno = new Aluno(nome, matricula);

            for (int j = 1; j <= 3; j++) {
                System.out.println("Digite a nota" + j + ": ");
                double nota = Double.parseDouble(sc.nextLine());
                aluno.adicionarNota(j, nota);
            }
            listaDeAlunos.add(aluno);
        }

            System.out.println("\n---Médias Finais---");
            for(Aluno a : listaDeAlunos){
                try {
                    System.out.println("Aluno: " + a.getNome() + " | Média: " + a.getMedia());
                } catch (NotasInexistentesException e){
                    System.out.println("Aluno: "+ a.getNome() + " | " +  e.getMessage());
                }
            }


    }

}
