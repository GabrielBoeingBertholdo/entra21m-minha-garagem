/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author (name=Gabriel Boeing, date=08-014-2017)
 */
public class JFrameInicial extends JFrame implements JFrameComportamentoInterface{
    
    private JButton jButtonListaCarro;
    private JButton jButtonCadastroCarro;
    
    public JFrameInicial(){
       criarTela();
       criarComponentes();
       definirLocalizacao();
       adicionarComponetes();
       adicionarOnClick();
                       
    } 
            

    @Override
    public void criarTela() {
        setSize(600,600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void criarComponentes() {
        jButtonListaCarro = new JButton ("Lista de Carros");
        jButtonCadastroCarro = new JButton ("Cadastro de Carros");
    }

    @Override
    public void definirLocalizacao() {
        jButtonListaCarro.setBounds(10,10,200,35);
        jButtonCadastroCarro.setBounds(10,55,200,35);
    }

    @Override
    public void adicionarComponetes() {
        add(jButtonCadastroCarro);
        add(jButtonListaCarro);
    }

    @Override
    public void adicionarOnClick() {
        jButtonListaCarro.addActionListener((ActionEvent e)-> {
            JFrameListaCarros lista = new JFrameListaCarros();
            
        });
        jButtonCadastroCarro.addActionListener((ActionEvent e)-> {
            new JFrameCadastroCarro().setVisible(true);
        });
        
}
   
   
    
    
    
    
    
    
    
}
