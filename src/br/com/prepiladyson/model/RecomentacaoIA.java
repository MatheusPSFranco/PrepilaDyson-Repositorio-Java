package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class RecomentacaoIA {

    private int idRecomendacao;
    private LocalDateTime dataHoraGeracao;
    private String recomendacao;
    private String status;
    private String justificativaDescarte;
    private LocalDateTime dataHoraAlteracao;
    private OperacaoSBSP operacaoSBSP;
    private Anomalia anomalia;

    //Construtores
    public RecomentacaoIA(int idRecomendacao, LocalDateTime dataHoraGeracao, String recomendacao, String status, OperacaoSBSP operacaoSBSP, Anomalia anomalia) {
        this.idRecomendacao = idRecomendacao;
        this.dataHoraGeracao = dataHoraGeracao;
        this.recomendacao = recomendacao;
        this.status = status;
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

    public String getjustificativaDescarte() {
        return justificativaDescarte;
    }

    public void setjustificativaDescarte(String justificativaDescarte) {
        this.justificativaDescarte = justificativaDescarte;
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

    //toString()
    @Override
    public String toString(){
        return recomendacao + ", " + status;
    }
    
    //metodos
    public void adicionarJustificativaDescarte(String novaJustificativa) {

        justificativaDescarte = novaJustificativa;
        dataHoraAlteracao = LocalDateTime.now();
    }
}
