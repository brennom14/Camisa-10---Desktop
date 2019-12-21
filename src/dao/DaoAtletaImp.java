/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.*;
import model.Atleta;
import model.Observador;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author benep
 */
public class DaoAtletaImp implements DaoAtleta {

    @Override
    public void salvar(Atleta atleta) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.save(atleta);
        t.commit();
        session.flush();
        session.close();
    }

    @Override
    public void alterar(Atleta atleta) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.update(atleta);
        t.commit();
        session.flush();
        session.close();
    }

    @Override
    public void excluir(Atleta atleta) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        session.delete(atleta);
        t.commit();
        session.flush();
        session.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Atleta> getAtleta() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        @SuppressWarnings("rawtypes")
        List lista = session.createQuery("from Atleta").list();
        t.commit();
        session.flush();
        session.close();
        return lista;

    }
}
