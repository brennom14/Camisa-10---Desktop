/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.*;
import model.Observador;
import model.Atleta;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author benep
 */
public class DaoObservadorImp implements DaoObservador {

    @Override
    public void salvar(Observador  observador) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.save(observador);
        t.commit();
        session.flush();
        session.close();
    }

    @Override
    public void alterar(Observador observador) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.update(observador);
        t.commit();
        session.flush();
        session.close();
    }

    @Override
    public void excluir(Observador  observador) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.delete(observador);
        t.commit();
        session.flush();
        session.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Observador > getObservador () {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        @SuppressWarnings("rawtypes")
        List lista = session.createQuery("from Observador ").list();
        t.commit();
        session.flush();
        session.close();
        return lista;

    }
}
