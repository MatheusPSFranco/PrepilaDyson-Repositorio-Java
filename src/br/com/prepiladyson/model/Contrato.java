package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class Contrato {

    private int idContrato;
    private String modalidade;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private String status;
    private LocalDateTime dataCadastro;
    private Organizacao organizacao;

    //Construtores
    public Contrato(int idContrato, String modalidade, LocalDateTime dataInicio, LocalDateTime dataFim, String status, LocalDateTime dataCadastro, Organizacao organizacao) {
        this.idContrato = idContrato;
        this.modalidade = modalidade;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.organizacao = organizacao;
    }

    //Getter and Setter
    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
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
        return organizacao.getNome() + " tem um contrato " + modalidade + " que atualmente está " + status;
    }

    //metodos
    public void renovarContrato(LocalDateTime novaDataFim) {
        dataFim = novaDataFim;
        status = "ATIVO";
    }
}
