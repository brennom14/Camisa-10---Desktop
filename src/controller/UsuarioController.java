/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoUsuarioImp;
import java.util.List;
import javax.swing.JOptionPane;
import model.Observador;
import org.hibernate.Session;
import util.HibernateUtil;
import model.Usuarios;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author benep
 */
public class UsuarioController {

    List<Usuarios> lista = null;
    DaoUsuarioImp dao = new DaoUsuarioImp();

    public void inserir(Usuarios usu) {
        if (usu == null && usu.getEmail().equals("") && usu.getSenha().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar - Todos os campos devem ser preenchidos");
        } else {
            dao.salvar(usu);
            JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso");
        }
    }

    public void editar(Usuarios usu) {
        if (usu == null && usu.getEmail().equals("") && usu.getSenha().equals("")) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar editar - Todos os campos devem ser preenchidos");
        } else {
            dao.alterar(usu);
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
        }
    }

    public void excluir(Usuarios usu) {
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse registro", "Excluir", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
            dao.excluir(usu);
            JOptionPane.showMessageDialog(null, "Atleta excluído com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Você cancelou a exclusão");
        }
    }
    public List<Usuarios> getUsuarios()
    {
        return dao.getUsuarios();
    }

    public int login(String email, String senha) {
        int pos = -1;
        lista = getUsuarios();
        if (email.trim().isEmpty() || senha.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i = 0; i < lista.size(); i++) {
                if (email.equals(lista.get(i).getEmail()) && senha.equals(lista.get(i).getSenha())) {
                    pos = i;
                }
            }
        }
        return pos;
    }

}
