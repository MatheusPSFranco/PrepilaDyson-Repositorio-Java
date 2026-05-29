package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class MonitoramentoRecomendacao {

    private int idMonitoramentoRecomendacao;
    private Monitoramento monitoramento;
    private RecomendacaoIA recomendacaoIA;
    private LocalDateTime dataVinculo;
    private String origemAnalise;

    //Construtores
    public MonitoramentoRecomendacao(int idMonitoramentoRecomendacao, Monitoramento monitoramento, RecomendacaoIA recomendacaoIA, LocalDateTime dataVinculo, String origemAnalise) {
        this.idMonitoramentoRecomendacao = idMonitoramentoRecomendacao;
        this.monitoramento = monitoramento;
        this.recomendacaoIA = recomendacaoIA;
        this.dataVinculo = dataVinculo;
        this.origemAnalise = origemAnalise;
    }

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

    public RecomendacaoIA getRecomentacaoIA() {
        return recomendacaoIA;
    }

    public void setRecomentacaoIA(RecomendacaoIA recomendacaoIA) {
        this.recomendacaoIA = recomendacaoIA;
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

    //toString()
    @Override
    public String toString(){
        return "Monitoramento "+monitoramento.getidMonitoramento() + " recomendou o uso da IA em " + recomendacaoIA.getRecomendacao();
    }
}
