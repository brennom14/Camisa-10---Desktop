/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoUsuarioImp;
import java.util.List;
import javax.swing.JOptionPane;
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

    public void UsuPadrao() {
        lista = dao.getUsuarios();
        if (lista.isEmpty()) {
            Usuarios usu = new Usuarios(0, "admin", "admin");
            dao.salvar(usu);
       }

    }

    public List<Usuarios> getUsuarios() {
        return dao.getUsuarios();
    }
}
