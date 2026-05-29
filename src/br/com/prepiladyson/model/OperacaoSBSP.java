package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class OperacaoSBSP {

    private int idOperacao;
    private String nomeOperacao;
    private String descricao;
    private LocalDateTime dataInicioPlanejada;
    private LocalDateTime dataFimPlanejada;
    private LocalDateTime dataInicioReal;
    private LocalDateTime dataFimReal;
    private String status;
    private LocalDateTime dataCadastro;
    private Organizacao organizacao;
    private Usuario usuario;

    //Construtores
    public OperacaoSBSP(int idOperacao, String nomeOperacao, String descricao, LocalDateTime dataInicioPlanejada, LocalDateTime dataFimPlanejada, LocalDateTime dataInicioReal, LocalDateTime dataFimReal, String status, LocalDateTime dataCadastro, Organizacao organizacao, Usuario usuario) {
        this.idOperacao = idOperacao;
        this.nomeOperacao = nomeOperacao;
        this.descricao = descricao;
        this.dataInicioPlanejada = dataInicioPlanejada;
        this.dataFimPlanejada = dataFimPlanejada;
        this.dataInicioReal = dataInicioReal;
        this.dataFimReal = dataFimReal;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.organizacao = organizacao;
        this.usuario = usuario;
    }

    public OperacaoSBSP(int idOperacao, String nomeOperacao, String descricao, LocalDateTime dataInicioPlanejada, LocalDateTime dataFimPlanejada, String status, LocalDateTime dataCadastro, Organizacao organizacao, Usuario usuario) {
        this.idOperacao = idOperacao;
        this.nomeOperacao = nomeOperacao;
        this.descricao = descricao;
        this.dataInicioPlanejada = dataInicioPlanejada;
        this.dataFimPlanejada = dataFimPlanejada;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.organizacao = organizacao;
        this.usuario = usuario;
    }

    //Getter and Setter
    public int getIdOperacao() {
        return idOperacao;
    }

    public void setIdOperacao(int idOperacao) {
        this.idOperacao = idOperacao;
    }

    public String getNomeOperacao() {
        return nomeOperacao;
    }

    public void setNomeOperacao(String nomeOperacao) {
        this.nomeOperacao = nomeOperacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataInicioPlanejada() {
        return dataInicioPlanejada;
    }

    public void setDataInicioPlanejada(LocalDateTime dataInicioPlanejada) {
        this.dataInicioPlanejada = dataInicioPlanejada;
    }

    public LocalDateTime getDataFimPlanejada() {
        return dataFimPlanejada;
    }

    public void setDataFimPlanejada(LocalDateTime dataFimPlanejada) {
        this.dataFimPlanejada = dataFimPlanejada;
    }

    public LocalDateTime getDataInicioReal() {
        return dataInicioReal;
    }

    public void setDataInicioReal(LocalDateTime dataInicioReal) {
        this.dataInicioReal = dataInicioReal;
    }

    public LocalDateTime getDataFimReal() {
        return dataFimReal;
    }

    public void setDataFimReal(LocalDateTime dataFimReal) {
        this.dataFimReal = dataFimReal;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //toString()
    @Override
    public String toString(){
        return "Operação: " + nomeOperacao + " " + descricao;
    }

    //metodos
    public void iniciarOperacao() {
        status = "ativa";
        dataInicioReal = LocalDateTime.now();
    }

    public void finalizarOperacao() {
        status = "finalizada";
        dataFimReal = LocalDateTime.now();
    }
}
