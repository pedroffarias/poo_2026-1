package br.ufpb.dcx.farias.pedro.exercicio3;
import java.util.List;

public class SistemaAmigoMapTest {
    public static void main(String[] args) {

        SistemaAmigoMap sistema = new SistemaAmigoMap();

        sistema.cadastrarAmigo("José", "jose@gmail.com");
        sistema.cadastrarAmigo("Maria", "maria@gmail.com");

        try {
            sistema.configuraAmigoSecretoDe("jose@gmail.com", "maria@gmail.com");
            sistema.configuraAmigoSecretoDe("maria@gmail.com", "jose@gmail.com");
        } catch (AmigoInexistenteException e) {
            System.out.println("Erro ao configurar: " + e.getMessage());
        }

        sistema.enviarMensagemParaAlguem("Oi José! Já comprei seu presente.", "maria@gmail.com", "jose@gmail.com", true);
        sistema.enviarMensagemParaTodos("Oi pessoal, que comece a brincadeira!", "maria@gmail.com", true);

        List<Mensagem> mensagensAnonimas = sistema.pesquisaMensagensAnonimas();
        System.out.println("--- MENSAGENS ANÔNIMAS ---");
        for (Mensagem m : mensagensAnonimas) {
            System.out.println(m.getTextoCompletoAExibir());
        }

        try {
            String amigoSorteadoJose = sistema.pesquisaAmigoSecretoDe("jose@gmail.com");

            if (amigoSorteadoJose.equals("maria@gmail.com")) {
                System.out.println("Ok");
            }

        } catch (AmigoInexistenteException | AmigoNaoSorteadoException e) {
            System.out.println("Erro na pesquisa: " + e.getMessage());
        }
    }
}
