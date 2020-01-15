/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoAtleta;
import dao.DaoAtletaImp;
import dao.DaoObservador;
import dao.DaoObservadorImp;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import model.Atleta;
import model.Observador;
import model.Usuarios;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author brenn
 */
public class ObservadorController {

    DaoObservador dao = new DaoObservadorImp();
    List<Observador> lista1 = null;

    public List<Observador> getObservador() {
        List<Observador> observadores = dao.getObservador();
        return observadores;
    }

    public void inserir(Observador obs) {
        if (obs == null && obs.getNome().equals("") && obs.getNome().equals("")&& obs.getDataNascimento().equals("")&& obs.getCpf().equals("")&& obs.getSexo().equals("")&& obs.getCidade().equals("")&& obs.getObsDesde().equals("")&& obs.getAnexo().equals("")&& obs.getClubeAssociado().equals("")&& obs.getCelular().equals("")&& obs.getEmail().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar - Todos os campos devem ser preenchidos");
        } else {
            dao.salvar(obs);
            JOptionPane.showMessageDialog(null, "Observador salvo com sucesso");
        }
    }

    public void editar(Observador obs) {
        if (obs == null && obs.getNome().equals("") && obs.getNome().equals("")&& obs.getDataNascimento().equals("")&& obs.getCpf().equals("")&& obs.getSexo().equals("")&& obs.getCidade().equals("")&& obs.getObsDesde().equals("")&& obs.getAnexo().equals("")&& obs.getClubeAssociado().equals("")&& obs.getCelular().equals("")&& obs.getEmail().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar editar - Todos os campos devem ser preenchidos");
        } else {
            dao.alterar(obs);
            JOptionPane.showMessageDialog(null, "Observador alterado com sucesso");
        }
    }

    public void excluir(Observador obs) {
        if (obs == null && obs.getNome().equals("") && obs.getNome().equals("")&& obs.getDataNascimento().equals("")&& obs.getCpf().equals("")&& obs.getSexo().equals("")&& obs.getCidade().equals("")&& obs.getObsDesde().equals("")&& obs.getAnexo().equals("")&& obs.getClubeAssociado().equals("")&& obs.getCelular().equals("")&& obs.getEmail().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir - Todos os campos devem ser preenchidos");
        } else {
            dao.excluir(obs);
            JOptionPane.showMessageDialog(null, "Observador excuído com sucesso");
        }
    }
    public void gerarRelatorioObservador()
    {
        try{
            lista1 = getObservador();
            System.out.println(lista1.get(0).getNome());
            HashMap filtros1 = new HashMap();
            
            JRBeanCollectionDataSource colecao1 = new JRBeanCollectionDataSource(getObservador(),false);
            JasperPrint imprimir1 = JasperFillManager.fillReport("C:/Users/benep/Documents/Camisa-10---Desktop/src/relatorios/RelatorioObservador.jasper",filtros1,colecao1);
            JasperViewer visualizar1 = new JasperViewer(imprimir1, false);
            visualizar1.setVisible(true);
            
            
            
        }catch(JRException erro){
            JOptionPane.showMessageDialog(null,"Erro ao gerar relatório"+ erro);
            erro.printStackTrace();
        }
    }

   
}
