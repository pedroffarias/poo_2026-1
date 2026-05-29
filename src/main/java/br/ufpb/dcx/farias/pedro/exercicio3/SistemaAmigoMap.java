package br.ufpb.dcx.farias.pedro.exercicio3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaAmigoMap {
    private Map<String, Amigo> amigos;
    private List<Mensagem> mensagens;

    public SistemaAmigoMap() {
        this.amigos = new HashMap<>();
        this.mensagens = new ArrayList<>();
    }

    public void cadastrarAmigo(String nomeAmigo, String emailAmigo) {
        Amigo novoAmigo = new Amigo(nomeAmigo, emailAmigo);
        this.amigos.put(emailAmigo, novoAmigo);
    }

    public Amigo pesquisaAmigo(String emailAmigo) {
        return this.amigos.get(emailAmigo);
    }
    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima) {
        this.mensagens.add(new MensagemParaTodos(texto, emailRemetente, ehAnonima));
    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
        this.mensagens.add(new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima));
    }

    public List<Mensagem> pesquisaMensagensAnonimas() {
        List<Mensagem> anonimas = new ArrayList<>();
        for (Mensagem m : this.mensagens) {
            if (m.ehAnonima()) {
                anonimas.add(m);
            }
        }
        return anonimas;
    }

    public List<Mensagem> pesquisaTodasAsMensagens() {
        return this.mensagens;
    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException {
        Amigo a = pesquisaAmigo(emailDaPessoa);

        if (a == null) {
            throw new AmigoInexistenteException("Não existe pessoa com o e-mail: " + emailDaPessoa);
        }

        a.setAmigoSorteado(emailAmigoSorteado);
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException {
        Amigo a = pesquisaAmigo(emailDaPessoa);

        if (a == null) {
            throw new AmigoInexistenteException("Não existe pessoa com o e-mail: " + emailDaPessoa);
        }

        String emailSorteado = a.getEmailAmigoSorteado();

        if (emailSorteado == null) {
            throw new AmigoNaoSorteadoException("O amigo secreto desta pessoa ainda não foi configurado.");
        }

        return emailSorteado;
    }
}
