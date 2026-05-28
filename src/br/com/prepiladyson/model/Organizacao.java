package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class Organizacao {

    private int idOrganizacao;
    private String nome;
    private String cnpj;
    private String tipoOrganizacao;
    private String pais;
    private LocalDateTime dataCadastro;
    private String status;

    //Construtores
    public Organizacao(int idOrganizacao, String nome, String cnpj, String tipoOrganizacao, String pais, LocalDateTime dataCadastro, String status) {
        this.idOrganizacao = idOrganizacao;
        this.nome = nome;
        this.cnpj = cnpj;
        this.tipoOrganizacao = tipoOrganizacao;
        this.pais = pais;
        this.dataCadastro = dataCadastro;
        this.status = status;
    }

    //Getter and Setter
    public int getIdOrganizacao() {
        return idOrganizacao;
    }

    public void setIdOrganizacao(int idOrganizacao) {
        this.idOrganizacao = idOrganizacao;
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

    public String getTipoOrganizacao() {
        return tipoOrganizacao;
    }

    public void setTipoOrganizacao(String tipoOrganizacao) {
        this.tipoOrganizacao = tipoOrganizacao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
