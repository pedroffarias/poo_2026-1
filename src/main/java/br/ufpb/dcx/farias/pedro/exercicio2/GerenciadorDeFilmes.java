package br.ufpb.dcx.farias.pedro.exercicio2;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeFilmes {

    private List<Filme> listaDeFilmes;

    public GerenciadorDeFilmes(){
        this.listaDeFilmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) throws Exception{
        if (listaDeFilmes.contains(filme)){
            throw new Exception("Erro: O filme " + filme.getTitulo() + "já está cadastrado no sistema.");
        }
        listaDeFilmes.add(filme);
        System.out.println("Filme " + filme.getTitulo() + "adicionado com sucesso!");
    }

    public void exibirTodos(){
        System.out.println("---Catálago de Filmes---");
        if (listaDeFilmes.isEmpty()){
            System.out.println("Nenhum filme cadastrado no sistema.");
        } else {
            for(Filme f : listaDeFilmes){
                System.out.println(f.toString());
            }
        }
        System.out.println("------------------------");
    }
}
