package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class EstacaoOperacao {

    private int idEstacaoOperacao;
    private EstacaoReceptora estacaoReceptora;
    private OperacaoSBSP operacaoSBSP;
    private LocalDateTime dataVinculo;
    private String statusVinculo;

    //Getter and Setter
    public int getIdEstacaoOperacao() {
        return idEstacaoOperacao;
    }

    public void setIdEstacaoOperacao(int idEstacaoOperacao) {
        this.idEstacaoOperacao = idEstacaoOperacao;
    }

    public EstacaoReceptora getEstacaoReceptora() {
        return estacaoReceptora;
    }

    public void setEstacaoReceptora(EstacaoReceptora estacaoReceptora) {
        this.estacaoReceptora = estacaoReceptora;
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

    public String getStatusVinculo() {
        return statusVinculo;
    }

    public void setStatusVinculo(String statusVinculo) {
        this.statusVinculo = statusVinculo;
    }
}
