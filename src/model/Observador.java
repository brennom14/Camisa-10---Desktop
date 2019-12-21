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
    private String dataNascimento;
    private String Cpf;
    private String sexo;
    private String cidade;
    private String obsDesde;
    private String anexo;
    private String AtletasAssociado;
    private String celular;
    private String email;

    public Observador() {
    }

    public Observador(int id, String nome, String dataNascimento, String Cpf, String sexo, String cidade, String obsDesde, String anexo, String AtletasAssociado, String celular, String email) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.Cpf = Cpf;
        this.sexo = sexo;
        this.cidade = cidade;
        this.obsDesde = obsDesde;
        this.anexo = anexo;
        this.AtletasAssociado = AtletasAssociado;
        this.celular = celular;
        this.email = email;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getObsDesde() {
        return obsDesde;
    }

    public void setObsDesde(String obsDesde) {
        this.obsDesde = obsDesde;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public String getAtletasAssociado() {
        return AtletasAssociado;
    }

    public void setAtletasAssociado(String AtletasAssociado) {
        this.AtletasAssociado = AtletasAssociado;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
    
    
    
    
     
    