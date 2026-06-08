package br.ufpb.dcx.farias.pedro.exercicio7.gui;
//import br.ufpb.dcx.farias.pedro.exercicio7.*;
//import br.ufpb.dcx.farias.pedro.exercicio7.controller.SistemaDeTurismoAddController;
//import br.ufpb.dcx.farias.pedro.exercicio7.controller.AgendaRemoveController;
//import br.ufpb.dcx.farias.pedro.exercicio7.controller.AgendaSearchController;

import javax.swing.*;
import java.awt.*;

public class SistemaDeTurismoGUIV3 extends JFrame{
    JLabel linha1, linha2;
    ImageIcon turismoImg = new ImageIcon("./imgs/joaopessoa.png");
    ImageIcon addImg = new ImageIcon("./imgs/icons/add_person.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/icons/search_person.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove_person.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;

    public SistemaDeTurismoGUIV3(){

        setTitle("Agenda de Aniversários");
        setSize(800,600); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);

        getContentPane().setBackground(Color.black);
        linha1 = new JLabel("Meu Sistema de Turismo", JLabel.CENTER);
        linha1.setForeground(Color.yellow);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));

        linha2 = new JLabel(turismoImg, JLabel.CENTER);

        botaoAdicionar = new JButton("Adicionar",addImg);

        botaoPesquisar = new JButton("Pesquisar",pesqImg);

        botaoRemover = new JButton("Remover",removeImg);

        getContentPane().setLayout(new GridLayout(3,2));

        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);

        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);

        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }

    public static void main(String [] args){
        JFrame janela = new SistemaDeTurismoGUIV3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}