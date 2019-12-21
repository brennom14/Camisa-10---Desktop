/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.*;
import model.Usuarios;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author benep
 */
public class DaoUsuarioImp implements DaoUsuario {

    @Override
    public void salvar(Usuarios usuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.save(usuario);
        t.commit();
        session.flush();
        session.close();
    }

    @Override
    public void alterar(Usuarios usuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.update(usuario);
        t.commit();
        session.flush();
        session.close();
    }

    @Override
    public void excluir(Usuarios usuario) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.delete(usuario);
        t.commit();
        session.flush();
        session.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Usuarios> getUsuarios() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        @SuppressWarnings("rawtypes")
        List lista = session.createQuery("from Usuarios").list();
        t.commit();
        session.flush();
        session.close();
        return lista;

    }
}
