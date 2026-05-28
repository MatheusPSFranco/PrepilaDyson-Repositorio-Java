package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class Alerta {

    private int idAlerta;
    private LocalDateTime dataHoraGeracao;
    private String prioridade;
    private String status;
    private LocalDateTime dataHoraLeitura;
    private Anomalia anomalia;
    private Usuario usuario;

    //Construtores
    public Alerta(int idAlerta, LocalDateTime dataHoraGeracao, String prioridade, String status, LocalDateTime dataHoraLeitura, Anomalia anomalia, Usuario usuario) {
        this.idAlerta = idAlerta;
        this.dataHoraGeracao = dataHoraGeracao;
        this.prioridade = prioridade;
        this.status = status;
        this.dataHoraLeitura = dataHoraLeitura;
        this.anomalia = anomalia;
        this.usuario = usuario;
    }

    //Getter and Setter
    public int getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }

    public LocalDateTime getDataHoraGeracao() {
        return dataHoraGeracao;
    }

    public void setDataHoraGeracao(LocalDateTime dataHoraGeracao) {
        this.dataHoraGeracao = dataHoraGeracao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataHoraLeitura() {
        return dataHoraLeitura;
    }

    public void setDataHoraLeitura(LocalDateTime dataHoraLeitura) {
        this.dataHoraLeitura = dataHoraLeitura;
    }

    public Anomalia getAnomalia() {
        return anomalia;
    }

    public void setAnomalia(Anomalia anomalia) {
        this.anomalia = anomalia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
