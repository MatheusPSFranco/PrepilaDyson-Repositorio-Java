package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class RecomentacaoIA {

    private int idRecomendacao;
    private LocalDateTime dataHoraGeracao;
    private String recomendacao;
    private String status;
    private String justificativa_descarte;
    private LocalDateTime dataHoraAlteracao;
    private OperacaoSBSP operacaoSBSP;
    private Anomalia anomalia;

    //Construtores
    public RecomentacaoIA(int idRecomendacao, LocalDateTime dataHoraGeracao, String recomendacao, String status, String justificativa_descarte, LocalDateTime dataHoraAlteracao, OperacaoSBSP operacaoSBSP, Anomalia anomalia) {
        this.idRecomendacao = idRecomendacao;
        this.dataHoraGeracao = dataHoraGeracao;
        this.recomendacao = recomendacao;
        this.status = status;
        this.justificativa_descarte = justificativa_descarte;
        this.dataHoraAlteracao = dataHoraAlteracao;
        this.operacaoSBSP = operacaoSBSP;
        this.anomalia = anomalia;
    }

    //Getter and Setter
    public int getIdRecomendacao() {
        return idRecomendacao;
    }

    public void setIdRecomendacao(int idRecomendacao) {
        this.idRecomendacao = idRecomendacao;
    }

    public LocalDateTime getDataHoraGeracao() {
        return dataHoraGeracao;
    }

    public void setDataHoraGeracao(LocalDateTime dataHoraGeracao) {
        this.dataHoraGeracao = dataHoraGeracao;
    }

    public String getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJustificativa_descarte() {
        return justificativa_descarte;
    }

    public void setJustificativa_descarte(String justificativa_descarte) {
        this.justificativa_descarte = justificativa_descarte;
    }

    public LocalDateTime getDataHoraAlteracao() {
        return dataHoraAlteracao;
    }

    public void setDataHoraAlteracao(LocalDateTime dataHoraAlteracao) {
        this.dataHoraAlteracao = dataHoraAlteracao;
    }

    public OperacaoSBSP getOperacaoSBSP() {
        return operacaoSBSP;
    }

    public void setOperacaoSBSP(OperacaoSBSP operacaoSBSP) {
        this.operacaoSBSP = operacaoSBSP;
    }

    public Anomalia getAnomalia() {
        return anomalia;
    }

    public void setAnomalia(Anomalia anomalia) {
        this.anomalia = anomalia;
    }
}
