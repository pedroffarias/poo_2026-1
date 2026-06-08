package br.ufpb.dcx.farias.pedro.exercicio7.gui;

import javax.swing.*;
import java.awt.*;

public class SistemaDeTurismoGUIV2 extends JFrame{

    JLabel linha1, linha2;
    ImageIcon turismoImg = new ImageIcon("./imgs/joaopessoa.png");
    public SistemaDeTurismoGUIV2(){
        setTitle("Sistema de Turismo");
        setSize(500,500);
        setLocation(0,0);
        setResizable(true);
        getContentPane().setBackground(Color.black);
        linha1 = new JLabel("Meu Sistema de Turismo", JLabel.CENTER);
        linha1.setForeground(Color.yellow);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(turismoImg, JLabel.CENTER);
        getContentPane().setLayout(new GridLayout(3,1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
    }
    public static void main(String [] args){
        JFrame janela = new SistemaDeTurismoGUIV2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
