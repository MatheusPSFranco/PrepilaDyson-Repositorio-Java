package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class Monitoramento {

    private int idMonitoramento;
    private LocalDateTime dataHoraColeta;
    private double energiaCaptada; //Energia Gerada pelo satelite
    private double energiaTransmitida; //Energia Enviada
    private double energiaRecebida; //Energia que chegou
    private double eficienciaPercentual;
    private String status;
    private String observacao;
    private OperacaoSBSP operacaoSBSP;

    //Construtores
    public Monitoramento(int idMonitoramento, LocalDateTime dataHoraColeta, double energiaCaptada, double energiaTransmitida, double energiaRecebida, String status, String observacao, OperacaoSBSP operacaoSBSP) {
        this.idMonitoramento = idMonitoramento;
        this.dataHoraColeta = dataHoraColeta;
        this.energiaCaptada = energiaCaptada;
        this.energiaTransmitida = energiaTransmitida;
        this.energiaRecebida = energiaRecebida;
        this.status = status;
        this.observacao = observacao;
        this.operacaoSBSP = operacaoSBSP;
    }

    //Getter and Setter
    public int getidMonitoramento() {
        return idMonitoramento;
    }

    public void setidMonitoramento(int idMonitoramento) {
        this.idMonitoramento = idMonitoramento;
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

    public double geteficienciaPercentual() {
        return eficienciaPercentual;
    }

    public void seteficienciaPercentual(double eficienciaPercentual) {
        this.eficienciaPercentual = eficienciaPercentual;
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

    //toString()
    @Override
    public String toString(){
        return "Energia captada: " + energiaCaptada + ", energia transmitida: " + energiaTransmitida + ", energia Recebida: " + energiaRecebida;
    }

    //metodos
    public double calcularPerdaEnergetica() {
        return energiaCaptada - energiaRecebida;
    }

    public void calcularEficienciaPercentual() {

        eficienciaPercentual = (energiaRecebida / energiaCaptada) * 100;
    }}
