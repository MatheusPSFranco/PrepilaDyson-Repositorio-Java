package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class Satelite {

    private int idSatelite;
    private String nome;
    private String codigoSatelite;
    private String status;
    private LocalDateTime dataLancamento;
    private String observacao;
    private double altitudeOrbital;
    private String fabricante;
    private LocalDateTime dataCadastro;
    private Organizacao organizacao;

    //Construtores
    public Satelite(int idSatelite, String nome, String codigoSatelite, String status, LocalDateTime dataLancamento, String observacao, double altitudeOrbital, String fabricante, LocalDateTime dataCadastro, Organizacao organizacao) {
        this.idSatelite = idSatelite;
        this.nome = nome;
        this.codigoSatelite = codigoSatelite;
        this.status = status;
        this.dataLancamento = dataLancamento;
        this.observacao = observacao;
        this.altitudeOrbital = altitudeOrbital;
        this.fabricante = fabricante;
        this.dataCadastro = dataCadastro;
        this.organizacao = organizacao;
    }

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

    public LocalDateTime getdataLancamento() {
        return dataLancamento;
    }

    public void setdataLancamento(LocalDateTime dataLancamento) {
        this.dataLancamento = dataLancamento;
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

    public LocalDateTime getdataCadastro() {
        return dataCadastro;
    }

    public void setdataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Organizacao getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(Organizacao organizacao) {
        this.organizacao = organizacao;
    }

    //toString()
    @Override
    public String toString(){
        return "Satelite " + nome + " codigo " + codigoSatelite + " está " + status;
    }

    //metodos
    public void entrarManutencao() {
        status = "em manutencao";
    }
}
