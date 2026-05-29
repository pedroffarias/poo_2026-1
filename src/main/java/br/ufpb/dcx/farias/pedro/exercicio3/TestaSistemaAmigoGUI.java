package br.ufpb.dcx.farias.pedro.exercicio3;
import javax.swing.JOptionPane;

public class TestaSistemaAmigoGUI {
    public static void main(String []args){
        SistemaAmigo sistema = new SistemaAmigo();

        String qtdString = JOptionPane.showInputDialog("Quantos amigos vão participar?");
        int qtdAmigos = Integer.parseInt(qtdString);

        for (int i = 0; i < qtdAmigos; i++) {
            String nome = JOptionPane.showInputDialog("Digite o NOME do amigo " + (i + 1) + ":");
            String email = JOptionPane.showInputDialog("Digite o E-MAIL do amigo " + (i + 1) + ":");
            sistema.cadastrarAmigo(nome, email);
        }

        for (int i = 0; i < qtdAmigos; i++) {
            String emailPessoa = JOptionPane.showInputDialog("Qual o e-mail da pessoa que tirou o papelzinho?");
            String emailSorteado = JOptionPane.showInputDialog("Quem ela tirou? (Digite o e-mail do sorteado)");

            try {
                sistema.configuraAmigoSecretoDe(emailPessoa, emailSorteado);
                JOptionPane.showMessageDialog(null, "Sorteio configurado com sucesso!");

            } catch (AmigoInexistenteException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }
        }

        String texto = JOptionPane.showInputDialog("Vamos enviar uma mensagem para todos! Digite o texto da mensagem:");
        String emailRemetente = JOptionPane.showInputDialog("Qual o e-mail de quem está enviando?");

        int resposta = JOptionPane.showConfirmDialog(null, "Esta mensagem é anônima?", "Atenção", JOptionPane.YES_NO_OPTION);
        boolean ehAnonima = (resposta == JOptionPane.YES_OPTION); // Se clicou em SIM, vira true

        sistema.enviarMensagemParaTodos(texto, emailRemetente, ehAnonima);

        JOptionPane.showMessageDialog(null, "Mensagem enviada! Brincadeira finalizada.");
    }
}
