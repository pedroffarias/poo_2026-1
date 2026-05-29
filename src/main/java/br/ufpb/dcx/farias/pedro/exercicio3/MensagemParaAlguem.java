package br.ufpb.dcx.farias.pedro.exercicio3;

public class MensagemParaAlguem extends Mensagem{

    private String emailDestinario;

    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinario, boolean anonima){
        super(texto, emailRemetente, anonima);
        this.emailDestinario = emailDestinario;
    }

    public String getEmailDestinario(){
        return this.emailDestinario;
    }

    public void setEmailDestinario(String emailDestinario){
        this.emailDestinario = emailDestinario;
    }

    @Override
    public String getTextoCompletoAExibir(){
        if(super.ehAnonima()){
            return "Mensagem para" + this.emailDestinario + ". Texto" + super.getTexto();
        } else {
            return "Mensagem de: " + super.getEmailRemetente() + " para " + this.emailDestinario + ". Texto: " + super.getTexto();
        }
    }
}
