/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author brenn
 */
@Entity
@Table(name = "tb_observador")
public class Observador implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cnpj;

    public Observador() {
    }

    public Observador(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }
    @OneToMany(mappedBy = "observador", targetEntity = Atleta.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Atleta> atleta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
