package br.com.prepiladyson.model;

public class RelatorioOperacao {

    private int idRelatorioOperacao;
    private RelatorioAnalitico relatorioAnalitico;
    private OperacaoSBSP operacaoSBSP;

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
