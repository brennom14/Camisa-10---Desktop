/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camisa10;

import controller.UsuarioController;
import model.Atleta;
import model.Observador;
import util.HibernateUtil;

/**
 *
 * @author benep
 */
public class Camisa10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UsuarioController control = new UsuarioController();
        control.UsuPadrao();
        new view.Login().setVisible(true);

        Observador obs1 = new Observador();
        obs1.setId(0);
        obs1.setNome("João Miguel");
        obs1.setCnpj("33.180.677/0001-08");

        Atleta atleta1 = new Atleta();
        Atleta atleta2 = new Atleta();

        atleta1.setId(0);
        atleta1.setNome("Brenno");
        atleta1.setCelular("996968353");
        atleta1.setTelefone("344-1122");
        atleta1.setCidade("Taquarussu");
        atleta1.setEmail("brenno.martins@novaandradina.org");
        atleta1.setPosicao("Meia");
        atleta1.setAltura("1.72");
        atleta1.setSexo("Masculino");
        atleta1.setLastClube("Sao Paulo Futebol Clube");
        atleta1.setObservador(obs1);

        atleta2.setId(0);
        atleta2.setNome("Diogo");
        atleta2.setCelular("999396918");
        atleta2.setTelefone("344-1056");
        atleta2.setCidade("Taquarussu");
        atleta2.setEmail("diogo.martins@novaandradina.org");
        atleta2.setPosicao("Meia");
        atleta2.setAltura("1.75");
        atleta2.setSexo("Masculino");
        atleta2.setLastClube("Sao Paulo");
        atleta2.setObservador(obs1);

    }

}
