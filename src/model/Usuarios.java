/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author benep
 */
@Entity
@Table(name = "tb_usuario")
public class Usuarios implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String email;
    private String senha;
    private int status;
    private boolean valido;
    
    public boolean isValido() {
        return valido;
    }

    public Usuarios() {
        this.valido = false;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    

}
