
import dao.CarroDAO;
import database.Utilitarios;
import java.awt.EventQueue;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Carro;
import view.JFrameInicial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Principal {
    public static void main (String [] args){
        //CarroDAO dao = new CarroDAO();
        /*
        Carro peugeot308 = new Carro();
        peugeot308.setNome("308");
        peugeot308.setFabricante("Peugeot");
        peugeot308.setCor("Rose");
        peugeot308.setAnoFabricacao(((short) 2013));
        peugeot308.setAnoLancamento((short) 2014);
        peugeot308.setEstaFuncional(true);
        peugeot308.setPermitidaCirculacao(false);
        peugeot308.setQuantidadeBatidas((byte) 13);
        peugeot308.setPlaca("NIN-3");
        peugeot308.setPotencia(220);
        peugeot308.setDataCompra(new Date(2013,8,31));
        peugeot308.setTipoPneus((byte)17);
        peugeot308.setRenavam(897642);
        peugeot308.setQuilometragem(18654.15f);
        peugeot308.setQuantidadePorta((byte) 4);
        peugeot308.setChassi("1824-5455-6524-2546-5216");
        peugeot308.setDescricao("The King in The North");
        int codigoInseir = dao.inserir(peugeot308);
        if(codigoInseir != Utilitarios.NAO_FOI_POSSIVEL_INSERIR){
            peugeot308.setId(codigoInseir);
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel inseir");
        }
        
        
        peugeot308.setNome("Gol");
        int codigoAlterar = dao.alterar(peugeot308);
       // System.out.println (peugeot308.getId());
       // System.out.println (codigoAlterar);
        if(codigoAlterar != Utilitarios.NAO_FOI_POSSIVEL_ALTERAR){
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
        }else {
            JOptionPane.showConfirmDialog(null, "Deu ruim mano");
        }
        
        
        CarroDAO dao = new CarroDAO();
        
        //apagar tudo:
        for(int i = 1;i < 20;i++){
            dao.excluir(i);
        }
        //apagar somente um:
        dao.excluir(1);
        
        
        
        
        ArrayList<Carro> carros = dao.retornarListagem();
        for(Carro carro: carros){
            System.out.println (carro.getId() + " - " + carro.getNome());
        }
    }
    */
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameInicial inicial = new JFrameInicial();
            }
        });
    }
        
}
