package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class MonitoramentoRecomendacao {

    private int idMonitoramentoRecomendacao;
    private Monitoramento monitoramento;
    private RecomentacaoIA recomentacaoIA;
    private LocalDateTime dataVinculo;
    private String origemAnalise;

    //Getter and Setter
    public int getIdMonitoramentoRecomendacao() {
        return idMonitoramentoRecomendacao;
    }

    public void setIdMonitoramentoRecomendacao(int idMonitoramentoRecomendacao) {
        this.idMonitoramentoRecomendacao = idMonitoramentoRecomendacao;
    }

    public Monitoramento getMonitoramento() {
        return monitoramento;
    }

    public void setMonitoramento(Monitoramento monitoramento) {
        this.monitoramento = monitoramento;
    }

    public RecomentacaoIA getRecomentacaoIA() {
        return recomentacaoIA;
    }

    public void setRecomentacaoIA(RecomentacaoIA recomentacaoIA) {
        this.recomentacaoIA = recomentacaoIA;
    }

    public LocalDateTime getDataVinculo() {
        return dataVinculo;
    }

    public void setDataVinculo(LocalDateTime dataVinculo) {
        this.dataVinculo = dataVinculo;
    }

    public String getOrigemAnalise() {
        return origemAnalise;
    }

    public void setOrigemAnalise(String origemAnalise) {
        this.origemAnalise = origemAnalise;
    }
}
