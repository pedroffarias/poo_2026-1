package br.ufpb.dcx.farias.pedro.exercicio2;
import java.util.Scanner;

public class Main {

    public static void main(String []args){

        GerenciadorDeFilmes gerenciador = new GerenciadorDeFilmes();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Filmes!");

        try {
            Filme f1 = new Filme("O Senhor dos Anéis", "Peter Jackson", 2001);
            Filme f2 = new Filme("Clube da Luta", "David Fincher", 1999);

            gerenciador.adicionarFilme(f1);
            gerenciador.adicionarFilme(f2);

            System.out.println("\n--- Adicionar Novo Filme ---");
            System.out.println("Digite o título do filme: ");
            String titulo = sc.nextLine();

            System.out.println("Digite o diretor  do filme: ");
            String diretor = sc.nextLine();

            System.out.println("Digite o ano de lançamento do filme: ");
            int anoFilme = Integer.parseInt(sc.nextLine());

            Filme f3 = new Filme(titulo, diretor, anoFilme);
            gerenciador.adicionarFilme(f3);

        } catch (NumberFormatException e) {
            System.out.println("Erro de Entrada: Você deve digitar um número inteiro válido para o ano de lançamento.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nFinalizando operações...");
            gerenciador.exibirTodos();

            sc.close();
        }
    }
}