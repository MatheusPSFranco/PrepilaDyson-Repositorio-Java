package br.com.prepiladyson.model;

import java.time.LocalDateTime;

public class Usuario {

    private int idUsuario;
    private String nomeCompleto;
    private String email;
    private String senha;
    private String perfilAcesso;
    private LocalDateTime dataCadastro;
    private String status;
    private Organizacao organizacao;

    //Construtores
    public Usuario(int idUsuario, String nomeCompleto, String email, String senha, String perfilAcesso, LocalDateTime dataCadastro, String status, Organizacao organizacao) {
        this.idUsuario = idUsuario;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.perfilAcesso = perfilAcesso;
        this.dataCadastro = dataCadastro;
        this.status = status;
        this.organizacao = organizacao;
    }

    //Getter and Setter
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfilAcesso() {
        return perfilAcesso;
    }

    public void setPerfilAcesso(String perfilAcesso) {
        this.perfilAcesso = perfilAcesso;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return nomeCompleto + ", email: " + email + ", possui cargo: " + perfilAcesso;
    }

    //metodos
    public void alterarPerfilAcesso(String novoPerfil) {
        perfilAcesso = novoPerfil;
    }

    public void redefinirSenha(String novaSenha) {
        senha = novaSenha;
    }

}
