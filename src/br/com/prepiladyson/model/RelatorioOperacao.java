package br.com.prepiladyson.model;

public class RelatorioOperacao {

    private int idRelatorioOperacao;
    private RelatorioAnalitico relatorioAnalitico;
    private OperacaoSBSP operacaoSBSP;

    //Construtores
    public RelatorioOperacao(int idRelatorioOperacao, RelatorioAnalitico relatorioAnalitico, OperacaoSBSP operacaoSBSP) {
        this.idRelatorioOperacao = idRelatorioOperacao;
        this.relatorioAnalitico = relatorioAnalitico;
        this.operacaoSBSP = operacaoSBSP;
    }

    //Getter and Setter
    public int getIdRelatorioOperacao() {
        return idRelatorioOperacao;
    }

    public void setIdRelatorioOperacao(int idRelatorioOperacao) {
        this.idRelatorioOperacao = idRelatorioOperacao;
    }

    public RelatorioAnalitico getRelatorioAnalitico() {
        return relatorioAnalitico;
    }

    public void setRelatorioAnalitico(RelatorioAnalitico relatorioAnalitico) {
        this.relatorioAnalitico = relatorioAnalitico;
    }

    public OperacaoSBSP getOperacaoSBSP() {
        return operacaoSBSP;
    }

    public void setOperacaoSBSP(OperacaoSBSP operacaoSBSP) {
        this.operacaoSBSP = operacaoSBSP;
    }
}
