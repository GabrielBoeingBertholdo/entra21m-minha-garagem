/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import model.Carro;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author (name=Gabriel Boeing, date=08-07-2017)
 */
public class CarroDAOJUnitTest {
    
   @Test
   public void inserir(){
       Carro gol = new Carro();
       gol.setDataCompra(new Date(2017,8,14));
       gol.setAnoFabricacao((short) 2017);
       gol.setAnoLancamento((short) 2017);
       gol.setChassi("5151874");
       gol.setDescricao("the king in the north");
       gol.setEstaFuncional(false);
       gol.setFabricante("VW");
       gol.setNome("gol");
       gol.setPlaca("FLA-2017");
       gol.setPotencia(100f);
       gol.setQuantidadeBatidas((byte) 0);
       gol.setQuantidadePorta((byte) 4);
       gol.setCor("Vermelho");
       gol.setPermitidaCirculacao(true);
       gol.setQuilometragem(15745f);
       gol.setTipoPneus((short) 17);
       gol.setRenavam(198745);
       
       CarroDAO dao = new CarroDAO();
       dao.truncate();
       int codigo = dao.inserir(gol);
       assertEquals(codigo,1);
       gol.setId(codigo);
       
       Carro carroBuscado = dao.buscarPorld(codigo);
       validarIgauldadeCarro(gol, carroBuscado);
       
       
   }
   
   @Test
   public void excluir(){
       Carro gol = new Carro();
       gol.setDataCompra(new Date(2017,8,14));
       gol.setAnoFabricacao((short) 2017);
       gol.setAnoLancamento((short) 2017);
       gol.setChassi("5151874");
       gol.setDescricao("the king in the north");
       gol.setEstaFuncional(false);
       gol.setFabricante("VW");
       gol.setNome("gol");
       gol.setPlaca("FLA-2017");
       gol.setPotencia(100f);
       gol.setQuantidadeBatidas((byte) 0);
       gol.setQuantidadePorta((byte) 4);
       gol.setCor("Vermelho");
       gol.setPermitidaCirculacao(true);
       gol.setQuilometragem(15745f);
       gol.setTipoPneus((short) 17);
       gol.setRenavam(198745);
       
       CarroDAO dao = new CarroDAO();
       dao.truncate();
       int codigo = dao.inserir(gol);
       dao.excluir(codigo);
       
       Carro carroBuscado = dao.buscarPorld(codigo);
       assertNull(carroBuscado);
   }
   
   @Test
   public void alterar(){
       Carro gol = new Carro();
       gol.setDataCompra(new Date(2017,8,14));
       gol.setAnoFabricacao((short) 2017);
       gol.setAnoLancamento((short) 2017);
       gol.setChassi("5151874");
       gol.setDescricao("the king in the north");
       gol.setEstaFuncional(false);
       gol.setFabricante("VW");
       gol.setNome("gol");
       gol.setPlaca("FLA-2017");
       gol.setPotencia(100f);
       gol.setQuantidadeBatidas((byte) 0);
       gol.setQuantidadePorta((byte) 4);
       gol.setCor("Vermelho");
       gol.setPermitidaCirculacao(true);
       gol.setQuilometragem(15745f);
       gol.setTipoPneus((short) 17);
       gol.setRenavam(198745);
       
       CarroDAO dao = new CarroDAO();
       dao.truncate();
       int codigo = dao.inserir(gol);
       gol.setId(codigo);
       //alterar
       gol.setDataCompra(new Date(2016,8,14));
       gol.setAnoFabricacao((short) 2002);
       gol.setAnoLancamento((short) 2002);
       gol.setChassi("7845");
       gol.setDescricao("the king in the north");
       gol.setEstaFuncional(false);
       gol.setFabricante("Fiat");
       gol.setNome("palio");
       gol.setPlaca("FLA-2017");
       gol.setPotencia(100f);
       gol.setQuantidadeBatidas((byte) 0);
       gol.setQuantidadePorta((byte) 4);
       gol.setCor("Vermelho");
       gol.setPermitidaCirculacao(true);
       gol.setQuilometragem(1957);
       gol.setTipoPneus((short) 17);
       gol.setRenavam(198745);
       dao.alterar(gol);
       
       Carro carroModificado = dao.buscarPorld(gol.getId());
       validarIgauldadeCarro(gol, carroModificado);
       
       
       
   }
   
   public void validarIgauldadeCarro (Carro carro,Carro outroCarro){
       assertEquals(carro.getId(), outroCarro.getId());
       assertEquals(carro.getAnoFabricacao(), outroCarro.getAnoFabricacao());
       assertEquals(carro.getAnoLancamento(), outroCarro.getAnoLancamento());
       assertEquals(carro.getChassi(), outroCarro.getChassi());
       assertEquals(carro.getCor(), outroCarro.getCor());
       assertEquals(carro.getDataCompra(), outroCarro.getDataCompra());
       assertEquals(carro.getDescricao(), outroCarro.getDescricao());
       assertEquals(carro.getFabricante(), outroCarro.getFabricante());
       assertEquals(carro.getNome(), outroCarro.getNome());
       assertEquals(carro.getPlaca(), outroCarro.getPlaca());
       assertEquals(carro.getPotencia(), outroCarro.getPotencia(), 0);
       assertEquals(carro.getQuantidadeBatidas(), outroCarro.getQuantidadeBatidas());
       assertEquals(carro.getQuantidadePorta(), outroCarro.getQuantidadePorta());
       assertEquals(carro.getQuilometragem(), outroCarro.getQuilometragem(), 0);
       assertEquals(carro.getRenavam(), outroCarro.getRenavam());
       assertEquals(carro.getTipoPneus(), outroCarro.getTipoPneus());
       assertEquals(carro.isEstaFuncional(), outroCarro.isEstaFuncional());
       assertEquals(carro.isPermitidaCirculacao(), outroCarro.isPermitidaCirculacao());
   }
    
}
