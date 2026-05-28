package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class Anomalia {

    private int idAnomalia;
    private String tipoAnomalia;
    private String descricao;
    private String severidade;
    private LocalDateTime dataHoraDetectada;
    private String status;
    private Monitoramento monitoramento;
    private String descricaoResolucao;

    //Construtores
    public Anomalia(int idAnomalia, String tipoAnomalia, String descricao, String severidade, LocalDateTime dataHoraDetectada, String status, Monitoramento monitoramento, String descricaoResolucao) {
        this.idAnomalia = idAnomalia;
        this.tipoAnomalia = tipoAnomalia;
        this.descricao = descricao;
        this.severidade = severidade;
        this.dataHoraDetectada = dataHoraDetectada;
        this.status = status;
        this.monitoramento = monitoramento;
        this.descricaoResolucao = descricaoResolucao;
    }

    //Getter and Setter
    public int getIdAnomalia() {
        return idAnomalia;
    }

    public void setIdAnomalia(int idAnomalia) {
        this.idAnomalia = idAnomalia;
    }

    public String getTipoAnomalia() {
        return tipoAnomalia;
    }

    public void setTipoAnomalia(String tipoAnomalia) {
        this.tipoAnomalia = tipoAnomalia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSeveridade() {
        return severidade;
    }

    public void setSeveridade(String severidade) {
        this.severidade = severidade;
    }

    public LocalDateTime getDataHoraDetectada() {
        return dataHoraDetectada;
    }

    public void setDataHoraDetectada(LocalDateTime dataHoraDetectada) {
        this.dataHoraDetectada = dataHoraDetectada;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Monitoramento getMonitoramento() {
        return monitoramento;
    }

    public void setMonitoramento(Monitoramento monitoramento) {
        this.monitoramento = monitoramento;
    }

    public String getDescricaoResolucao() {
        return descricaoResolucao;
    }

    public void setDescricaoResolucao(String descricaoResolucao) {
        this.descricaoResolucao = descricaoResolucao;
    }
}
