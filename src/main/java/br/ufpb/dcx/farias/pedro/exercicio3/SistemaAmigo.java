package br.ufpb.dcx.farias.pedro.exercicio3;
import java.util.List;
import java.util.ArrayList;

public class SistemaAmigo {

    private List<Mensagem> mensagens;
    private List<Amigo> amigos;

    public SistemaAmigo() {
        this.mensagens = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    public void cadastrarAmigo(String nomeAmigo, String emailAmigo) {
    }

    public Amigo pesquisaAmigo(String emailAmigo) {
        for (Amigo a : amigos) {
            if (a.getEmail().equals(emailAmigo)) {
                return a;
            }
        }
        return null;
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima) {
    }

    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima) {
    }

    public List<Mensagem> pesquisaTodasAsMensagens() {
        return this.mensagens;
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


    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailSorteado) {
    }

    public String pesquisaAmigoSecretoDe(String emailDaPessoa) {
        Amigo a = pesquisaAmigo(emailDaPessoa);
        if (a != null) {
            return a.getEmailAmigoSorteado();
        }
        return "Amigo não encontrado.";
    }
}
