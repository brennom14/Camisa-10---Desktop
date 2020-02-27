/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import dao.DaoObservadorImp;
import dao.DaoUsuarioImp;
import java.util.ArrayList;
import java.util.List;
import model.Observador;
import model.Usuarios;

/**
 *
 * @author benep
 */
public class Obs {
   public List<Observador> obsValidos(){
        List<Observador> o = new DaoObservadorImp().getObservador();
        List<Usuarios> u = new DaoUsuarioImp().getUsuarios();
        List<Usuarios> users =  new ArrayList<Usuarios>();
        List<Observador> obs = new ArrayList<Observador>();
        for (Usuarios use : u) {
            if(use.isValido()){
               users.add(use);
            }
        }
        for (Usuarios use : users) {
           for (Observador ob : o) {
                if(ob.getEmail().equals(use.getEmail())){
                   obs.add(ob);
                }
            }
        }
        return obs;
}

    
    
}
