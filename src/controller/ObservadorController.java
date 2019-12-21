/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoObservador;
import dao.DaoObservadorImp;
import java.util.List;
import javax.swing.JOptionPane;
import model.Observador;
import model.Usuarios;

/**
 *
 * @author brenn
 */
public class ObservadorController {

    DaoObservador dao;

    public ObservadorController() {
        this.dao = new DaoObservadorImp();
    }

    public void inserir(Observador obs) {
        if (obs == null && obs.getNome().equals("") && obs.getNome().equals("")&& obs.getDataNascimento().equals("")&& obs.getCpf().equals("")&& obs.getSexo().equals("")&& obs.getCidade().equals("")&& obs.getObsDesde().equals("")&& obs.getAnexo().equals("")&& obs.getAtletasAssociado().equals("")&& obs.getCelular().equals("")&& obs.getEmail().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar - Todos os campos devem ser preenchidos");
        } else {
            dao.salvar(obs);
            JOptionPane.showMessageDialog(null, "Observador salvo com sucesso");
        }
    }

    public void editar(Observador obs) {
        if (obs == null && obs.getNome().equals("") && obs.getNome().equals("")&& obs.getDataNascimento().equals("")&& obs.getCpf().equals("")&& obs.getSexo().equals("")&& obs.getCidade().equals("")&& obs.getObsDesde().equals("")&& obs.getAnexo().equals("")&& obs.getAtletasAssociado().equals("")&& obs.getCelular().equals("")&& obs.getEmail().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar editar - Todos os campos devem ser preenchidos");
        } else {
            dao.alterar(obs);
            JOptionPane.showMessageDialog(null, "Observador alterado com sucesso");
        }
    }

    public void excluir(Observador obs) {
        if (obs == null && obs.getNome().equals("") && obs.getNome().equals("")&& obs.getDataNascimento().equals("")&& obs.getCpf().equals("")&& obs.getSexo().equals("")&& obs.getCidade().equals("")&& obs.getObsDesde().equals("")&& obs.getAnexo().equals("")&& obs.getAtletasAssociado().equals("")&& obs.getCelular().equals("")&& obs.getEmail().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir - Todos os campos devem ser preenchidos");
        } else {
            dao.excluir(obs);
            JOptionPane.showMessageDialog(null, "Observador excuído com sucesso");
        }
    }

    public List<Observador> getObservador() {
        return dao.getObservador();
    }
}
