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
 * @author brenn
 */
@Entity
@Table(name = "tb_atleta")
public class Atleta implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String nome;
    private String data;
    private String cidade;
    private String nomeResponsavel;
    private String celularResponsavel;
    private String celular;
    private String telefone;
    private String email;
    private String posicao;
    private String altura;
    private String sexo;
    private String lastClube;
    private String link;
    private String peDominante;
    private String peso;
    private byte[] imagem; //urlimagem String /imgatleta/+url 
    @ManyToOne
    @JoinColumn(name = "observador", referencedColumnName = "id", nullable = false)
    private Observador observador;

    public Atleta() {
    }

    public Atleta(int id, String nome, String data, String cidade, String nomeResponsavel, String celularResponsavel, String celular, String telefone, String email, String posicao, String altura, String sexo, String lastClube, String link, String peDominante, String peso, byte[] imagem, Observador observador) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.cidade = cidade;
        this.nomeResponsavel = nomeResponsavel;
        this.celularResponsavel = celularResponsavel;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.posicao = posicao;
        this.altura = altura;
        this.sexo = sexo;
        this.lastClube = lastClube;
        this.link = link;
        this.peDominante = peDominante;
        this.peso = peso;
        this.imagem = imagem;
        this.observador = observador;
    }

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getCelularResponsavel() {
        return celularResponsavel;
    }

    public void setCelularResponsavel(String celularResponsavel) {
        this.celularResponsavel = celularResponsavel;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLastClube() {
        return lastClube;
    }

    public void setLastClube(String lastClube) {
        this.lastClube = lastClube;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPeDominante() {
        return peDominante;
    }

    public void setPeDominante(String peDominante) {
        this.peDominante = peDominante;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public Observador getObservador() {
        return observador;
    }

    public void setObservador(Observador observador) {
        this.observador = observador;
    }
    

}