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
import java.util.List;
import javax.swing.JOptionPane;
import model.Atleta;
import model.Observador;

/**
 *
 * @author brenn
 */
public class AtletaController {

    DaoAtleta dao;

    public AtletaController() {
        this.dao = (DaoAtleta) new DaoAtletaImp();
    }

    public void inserir(Atleta at) {
        if (at == null && at.getNome().equals("") && at.getCidade().equals("")&& at.getNomeResponsavel().equals("")&& at.getCelular().equals("")&& at.getTelefone().equals("")&& at.getEmail().equals("")&& at.getPosicao().equals("")&& at.getAltura().equals("")&& at.getSexo().equals("")&& at.getLastClube().equals("")&& at.getCelularResponsavel().equals("")&& at.getData().equals("")&& at.getPeso().equals("")&& at.getPeDominante().equals("")&& at.getLink().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar - Todos os campos devem ser preenchidos");
        } else {
            dao.salvar(at);
            JOptionPane.showMessageDialog(null, "Atleta salvo com sucesso");
        }
    }

    public void editar(Atleta at) {
        if (at == null && at.getNome().equals("") && at.getCidade().equals("")&& at.getNomeResponsavel().equals("")&& at.getCelular().equals("")&& at.getTelefone().equals("")&& at.getEmail().equals("")&& at.getPosicao().equals("")&& at.getAltura().equals("")&& at.getSexo().equals("")&& at.getLastClube().equals("")&& at.getCelularResponsavel().equals("")&& at.getData().equals("")&& at.getPeso().equals("")&& at.getPeDominante().equals("")&& at.getLink().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar editar - Todos os campos devem ser preenchidos");
        } else {
            dao.alterar(at);
            JOptionPane.showMessageDialog(null, "Atleta alterado com sucesso");
        }
    }

    public void excluir(Atleta at) {
      int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse registro","Excluir",JOptionPane.YES_NO_OPTION);
      if(op == 0)
      {
          dao.excluir(at);
          JOptionPane.showMessageDialog(null, "Atleta excluído com sucesso");
      }
      else
      {
          JOptionPane.showMessageDialog(null, "Você cancelou a exclusão");
      }
    }

    public List<Atleta> getAtleta() {
        return dao.getAtleta();
    }
}
