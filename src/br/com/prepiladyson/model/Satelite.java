package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class Satelite {

    private int idSatelite;
    private String nome;
    private String codigoSatelite;
    private String status;
    private LocalDateTime data_lancamento;
    private String observacao;
    private double altitudeOrbital;
    private String fabricante;
    private LocalDateTime data_cadastro;
    private Organizacao organizacao;

    //Getter and Setter
    public int getIdSatelite() {
        return idSatelite;
    }

    public void setIdSatelite(int idSatelite) {
        this.idSatelite = idSatelite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoSatelite() {
        return codigoSatelite;
    }

    public void setCodigoSatelite(String codigoSatelite) {
        this.codigoSatelite = codigoSatelite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(LocalDateTime data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getAltitudeOrbital() {
        return altitudeOrbital;
    }

    public void setAltitudeOrbital(double altitudeOrbital) {
        this.altitudeOrbital = altitudeOrbital;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDateTime getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Organizacao getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(Organizacao organizacao) {
        this.organizacao = organizacao;
    }
}
