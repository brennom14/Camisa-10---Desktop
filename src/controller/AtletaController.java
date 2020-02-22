/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoAtleta;
import dao.DaoAtletaImp;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import model.Atleta;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author brenn
 */
public class AtletaController {

    DaoAtleta dao = new DaoAtletaImp();
    List<Atleta> lista = null;

    public List<Atleta> getAtletaPorPosicao(String atleta) {
        List<Atleta> atletas = dao.getAtletaPorPosicao(atleta);
        return atletas;
    }
    public List<Atleta> getAtletaPorAltura(String atleta) {
        List<Atleta> atletas = dao.getAtletaPorAltura(atleta);
        return atletas;
    }
    public List<Atleta> getAtletaPorClube(String atleta) {
        List<Atleta> atletas = dao.getAtletaPorClube(atleta);
        return atletas;
    }

    public List<Atleta> getAtleta() {
        List<Atleta> atletas = dao.getAtleta();
        return atletas;
    }

    public void inserir(Atleta at) {
        if (at == null && at.getNome().equals("") && at.getCidade().equals("") && at.getNomeResponsavel().equals("") && at.getCelular().equals("") && at.getTelefone().equals("") && at.getEmail().equals("") && at.getPosicao().equals("") && at.getAltura().equals("") && at.getSexo().equals("") && at.getLastClube().equals("") && at.getCelularResponsavel().equals("") && at.getData().equals("") && at.getPeso().equals("") && at.getPeDominante().equals("") && at.getLink().equals("") && at.getImagem().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar - Todos os campos devem ser preenchidos");
        } else {
            dao.salvar(at);
            JOptionPane.showMessageDialog(null, "Atleta salvo com sucesso");
        }
    }

    public void editar(Atleta at) {
        if (at == null && at.getNome().equals("") && at.getCidade().equals("") && at.getNomeResponsavel().equals("") && at.getCelular().equals("") && at.getTelefone().equals("") && at.getEmail().equals("") && at.getPosicao().equals("") && at.getAltura().equals("") && at.getSexo().equals("") && at.getLastClube().equals("") && at.getCelularResponsavel().equals("") && at.getData().equals("") && at.getPeso().equals("") && at.getPeDominante().equals("") && at.getLink().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar editar - Todos os campos devem ser preenchidos");
        } else {
            dao.alterar(at);
            JOptionPane.showMessageDialog(null, "Atleta alterado com sucesso");
        }
    }

    public void editarImg(String[] img, int id) {
        dao.alterarImagem(img, id);
    }

    public void excluir(Atleta at) {
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse registro", "Excluir", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
            dao.excluir(at);
            JOptionPane.showMessageDialog(null, "Atleta excluído com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Você cancelou a exclusão");
        }
    }

    public void gerarRelatorio() {
        try {
            HashMap filtros = new HashMap();
            String atletaesc = JOptionPane.showInputDialog("Digite o nome do atleta");
            filtros.put("atleta", atletaesc);
            lista = getAtletaPorClube(atletaesc);

            JRBeanCollectionDataSource colecao = new JRBeanCollectionDataSource(getAtletaPorClube(atletaesc), false);

            JasperPrint imprimir = JasperFillManager.fillReport("C:/Users/benep/Documents/TCC/Camisa-10---Desktop//src/relatorios/RelCliente.jasper", filtros, colecao);
            JasperViewer visualizar = new JasperViewer(imprimir, false);
            visualizar.setVisible(true);

        } catch (JRException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório" + erro);
            erro.printStackTrace();
        }
    }

    public void gerarRelatorioAtleta() {
        try {
            lista = getAtleta();
            System.out.println(lista.get(0).getNome());
            HashMap filtro = new HashMap();

            JRBeanCollectionDataSource colecao = new JRBeanCollectionDataSource(getAtleta(), false);
            JasperPrint imprimir = JasperFillManager.fillReport("C:/Users/benep/Documents/TCC/Camisa-10---Desktop/src/relatorios/RelTodosAtletas.jasper", filtro, colecao);
            JasperViewer visualizar = new JasperViewer(imprimir, false);
            visualizar.setVisible(true);

        } catch (JRException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório" + erro);
            erro.printStackTrace();
        }
    }

    public void gerarPosAtleta() {
        try {
            HashMap filtros = new HashMap();
            String posatleta = JOptionPane.showInputDialog("Digite o nome do atleta");
            filtros.put("position", posatleta);
            lista = getAtletaPorPosicao(posatleta);

            JRBeanCollectionDataSource colecao = new JRBeanCollectionDataSource(getAtletaPorPosicao(posatleta), false);

            JasperPrint imprimir = JasperFillManager.fillReport("C:/Users/benep/Documents/TCC/Camisa-10---Desktop//src/relatorios/RelPosicao.jasper", filtros, colecao);
            JasperViewer visualizar = new JasperViewer(imprimir, false);
            visualizar.setVisible(true);

        } catch (JRException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório" + erro);
            erro.printStackTrace();
        }
    }
    public void gerarAlturaAtleta() {
        try {
            HashMap filtros = new HashMap();
            String altatleta = JOptionPane.showInputDialog("Digite a altura desejada");
            filtros.put("alt", altatleta);
            lista = getAtletaPorAltura(altatleta);

            JRBeanCollectionDataSource colecao = new JRBeanCollectionDataSource(getAtletaPorAltura(altatleta), false);

            JasperPrint imprimir = JasperFillManager.fillReport("C:/Users/benep/Documents/TCC/Camisa-10---Desktop//src/relatorios/RelatorioAltura.jasper", filtros, colecao);
            JasperViewer visualizar = new JasperViewer(imprimir, false);
            visualizar.setVisible(true);

        } catch (JRException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório" + erro);
            erro.printStackTrace();
        }
    }
}
