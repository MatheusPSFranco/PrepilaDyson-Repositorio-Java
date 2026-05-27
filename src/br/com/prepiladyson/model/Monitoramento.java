package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class Monitoramento {

    private int idMovimento;
    private LocalDateTime dataHoraColeta;
    private double energiaCaptada;
    private double energiaTransmitida;
    private double energiaRecebida;
    private double eficiencia_percentual;
    private String status;
    private String observacao;
    private OperacaoSBSP operacaoSBSP;

    //Getter and Setter
    public int getIdMovimento() {
        return idMovimento;
    }

    public void setIdMovimento(int idMovimento) {
        this.idMovimento = idMovimento;
    }

    public LocalDateTime getDataHoraColeta() {
        return dataHoraColeta;
    }

    public void setDataHoraColeta(LocalDateTime dataHoraColeta) {
        this.dataHoraColeta = dataHoraColeta;
    }

    public double getEnergiaCaptada() {
        return energiaCaptada;
    }

    public void setEnergiaCaptada(double energiaCaptada) {
        this.energiaCaptada = energiaCaptada;
    }

    public double getEnergiaTransmitida() {
        return energiaTransmitida;
    }

    public void setEnergiaTransmitida(double energiaTransmitida) {
        this.energiaTransmitida = energiaTransmitida;
    }

    public double getEnergiaRecebida() {
        return energiaRecebida;
    }

    public void setEnergiaRecebida(double energiaRecebida) {
        this.energiaRecebida = energiaRecebida;
    }

    public double getEficiencia_percentual() {
        return eficiencia_percentual;
    }

    public void setEficiencia_percentual(double eficiencia_percentual) {
        this.eficiencia_percentual = eficiencia_percentual;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public OperacaoSBSP getOperacaoSBSP() {
        return operacaoSBSP;
    }

    public void setOperacaoSBSP(OperacaoSBSP operacaoSBSP) {
        this.operacaoSBSP = operacaoSBSP;
    }
}
