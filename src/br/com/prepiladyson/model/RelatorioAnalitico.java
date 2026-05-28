package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class RelatorioAnalitico {

    private int idRelatorio;
    private LocalDateTime dataInicioPeriodo;
    private LocalDateTime dataFimPeriodo;
    private String titulo;
    private String tipoRelatorio;
    private String conteudo;
    private String status;
    private LocalDateTime dataGeracao;
    private Organizacao organizacao;
    private Usuario usuario;
    private String periodoReferencia;

    //Construtores
    public RelatorioAnalitico(int idRelatorio, LocalDateTime dataInicioPeriodo, LocalDateTime dataFimPeriodo, String titulo, String tipoRelatorio, String conteudo, String status, LocalDateTime dataGeracao, Organizacao organizacao, Usuario usuario, String periodoReferencia) {
        this.idRelatorio = idRelatorio;
        this.dataInicioPeriodo = dataInicioPeriodo;
        this.dataFimPeriodo = dataFimPeriodo;
        this.titulo = titulo;
        this.tipoRelatorio = tipoRelatorio;
        this.conteudo = conteudo;
        this.status = status;
        this.dataGeracao = dataGeracao;
        this.organizacao = organizacao;
        this.usuario = usuario;
        this.periodoReferencia = periodoReferencia;
    }

    //Getter and Setter
    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public LocalDateTime getDataInicioPeriodo() {
        return dataInicioPeriodo;
    }

    public void setDataInicioPeriodo(LocalDateTime dataInicioPeriodo) {
        this.dataInicioPeriodo = dataInicioPeriodo;
    }

    public LocalDateTime getDataFimPeriodo() {
        return dataFimPeriodo;
    }

    public void setDataFimPeriodo(LocalDateTime dataFimPeriodo) {
        this.dataFimPeriodo = dataFimPeriodo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoRelatorio() {
        return tipoRelatorio;
    }

    public void setTipoRelatorio(String tipoRelatorio) {
        this.tipoRelatorio = tipoRelatorio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDateTime dataGeracao) {
        this.dataGeracao = dataGeracao;
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

    public String getPeriodoReferencia() {
        return periodoReferencia;
    }

    public void setPeriodoReferencia(String periodoReferencia) {
        this.periodoReferencia = periodoReferencia;
    }
}
