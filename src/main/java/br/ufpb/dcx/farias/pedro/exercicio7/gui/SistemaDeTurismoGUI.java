package br.ufpb.dcx.farias.pedro.exercicio7.gui;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SistemaDeTurismoGUI extends JFrame{
    public SistemaDeTurismoGUI(){
        setTitle("Sistema de Turismo");
        setSize(500,500);
        setLocation(0,0);
        setResizable(false);
        getContentPane().setBackground(Color.black);
    }
    public static void main(String []args){
        SistemaDeTurismoGUI janela = new SistemaDeTurismoGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.out.println("Saindo");
                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }
}
