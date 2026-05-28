package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class EstacaoReceptora {

    private int idEstacao;
    private String nome;
    private String localizacao;
    private String status;
    private LocalDateTime dataCadastro;
    private String observacao;
    private Organizacao organizacao;
    private double capacidadeRecepcao;

    //Construtores
    public EstacaoReceptora(int idEstacao, String nome, String localizacao, String status, LocalDateTime dataCadastro, String observacao, Organizacao organizacao, double capacidadeRecepcao) {
        this.idEstacao = idEstacao;
        this.nome = nome;
        this.localizacao = localizacao;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.observacao = observacao;
        this.organizacao = organizacao;
        this.capacidadeRecepcao = capacidadeRecepcao;
    }

    //Getter and Setter
    public int getIdEstacao() {
        return idEstacao;
    }

    public void setIdEstacao(int idEstacao) {
        this.idEstacao = idEstacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Organizacao getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(Organizacao organizacao) {
        this.organizacao = organizacao;
    }

    public double getCapacidadeRecepcao() {
        return capacidadeRecepcao;
    }

    public void setCapacidadeRecepcao(double capacidadeRecepcao) {
        this.capacidadeRecepcao = capacidadeRecepcao;
    }

    //toString()
    @Override
    public String toString(){
        return "Estação Receptora " + nome + " da " + organizacao.getNome() + " localizada em " + localizacao;
    }
}
