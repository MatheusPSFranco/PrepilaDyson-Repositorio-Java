package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class SateliteOperacao {

    private int idSateliteOperacao;
    private Satelite satelite;
    private OperacaoSBSP operacaoSBSP;
    private LocalDateTime dataVinculo;
    private String statusParticipacao;

    //Getter and Setter
    public int getIdSateliteOperacao() {
        return idSateliteOperacao;
    }

    public void setIdSateliteOperacao(int idSateliteOperacao) {
        this.idSateliteOperacao = idSateliteOperacao;
    }

    public Satelite getSatelite() {
        return satelite;
    }

    public void setSatelite(Satelite satelite) {
        this.satelite = satelite;
    }

    public OperacaoSBSP getOperacaoSBSP() {
        return operacaoSBSP;
    }

    public void setOperacaoSBSP(OperacaoSBSP operacaoSBSP) {
        this.operacaoSBSP = operacaoSBSP;
    }

    public LocalDateTime getDataVinculo() {
        return dataVinculo;
    }

    public void setDataVinculo(LocalDateTime dataVinculo) {
        this.dataVinculo = dataVinculo;
    }

    public String getStatusParticipacao() {
        return statusParticipacao;
    }

    public void setStatusParticipacao(String statusParticipacao) {
        this.statusParticipacao = statusParticipacao;
    }
}
