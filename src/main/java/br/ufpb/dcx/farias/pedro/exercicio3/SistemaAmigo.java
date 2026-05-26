package br.ufpb.dcx.farias.pedro.exercicio3;
import java.util.List;
import java.util.ArrayList;

public class SistemaAmigo {

    private List<Mensagem> mensagens;
    private List<Amigo> amigos;


    public void cadastrarAmigo(String nomeAmigo, String emailAmigo){
    }

    public Amigo pesquisaAmigo(String emailAmigo){
        for(Amigo a : amigos){
            if(a.getEmail().equals(emailAmigo)){
                return a;
            }
        }
    return null;
}

public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima){
}

public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima){
}

public List<Mensagem> pesquisaTodasAsMensagens(){
    return this.mensagens;
}

public List<Mensagem> pesquisaMensagensAnonimas(){
    List<Mensagem> anonimas = new ArrayList<>();

    for(Mensagem mensagens : anonimas){

    }
}

public void configuraAmigoSecretoDe(String emailDaPessoa, String emailSorteado){
}

public String pesquisaAmigoSecretoDe(String emailDaPessoa){
    return
}
