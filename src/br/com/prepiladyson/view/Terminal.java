package br.com.prepiladyson.view;

import br.com.prepiladyson.model.*;

import java.time.LocalDateTime;

public class Terminal {
    static void main(String[] args) {

        //Organizacao
        int idOrganizacao = 1;
        String nomeOrganizacao = "Acrux Aerospace";
        String cnpj = "10.524.120/0001-41";
        String tipoOrganizacao = "empresa";
        String pais = "Brasil";
        LocalDateTime dataCadastroOrganizacao = LocalDateTime.now();
        String statusOrganizacao = "ativa";

        //Instanciando Organizacao
        Organizacao organizacao = new Organizacao(idOrganizacao, nomeOrganizacao, cnpj, tipoOrganizacao, pais, dataCadastroOrganizacao, statusOrganizacao);

        //Satelite
        int idSatelite = 1;
        String nomeSatelite = "Amazonia 1";
        String codigoSatelite = "123098";
        String statusSatelite = "ativo";
        LocalDateTime dataLancamento = LocalDateTime.now();
        String observacaoSatelite = "Satelite Brasileiro";
        double altitudeOrbital = 752.0;
        String fabricante = "INPE";
        LocalDateTime dataCadastroSatelite = LocalDateTime.now();

        //Instanciando Satelite
        Satelite satelite = new Satelite(idSatelite, nomeSatelite, codigoSatelite, statusSatelite, dataLancamento, observacaoSatelite, altitudeOrbital, fabricante, dataCadastroSatelite, organizacao);

        //Usuario
        int idUsuario = 1;
        String nomeCompleto = "Matheus Pereira Da Silva Franco";
        String email = "matheuspsilvafranco@gmail.com";
        String senha = "123456789@";
        String perfilAcesso = "administrador";
        LocalDateTime dataCadastroUsuario = LocalDateTime.now();
        String statusUsuario = "ativo";

        //Instanciando Usuario
        Usuario usuario = new Usuario(idUsuario, nomeCompleto, email, senha, perfilAcesso, dataCadastroUsuario, statusUsuario, organizacao);

        //Contrato
        int idContrato = 1;
        String modalidade = "SaaS mensal";
        LocalDateTime dataInicio = LocalDateTime.of(2026, 5, 1, 0, 0, 0);
        LocalDateTime dataFim = LocalDateTime.of(2026, 6, 1, 0, 0, 0);
        String statusContrato = "ativo";
        LocalDateTime dataCadastroContrato = LocalDateTime.now();

        //Instanciando Contrato
        Contrato contrato = new Contrato(idContrato, modalidade, dataInicio, dataFim, statusContrato, dataCadastroContrato, organizacao);

        //EstacaoReceptora
        int idEstacao = 1;
        String nomeEstacao = "AmazoniaNet";
        String localizacao = "Brasil, Amazonia";
        String statusEstacao = "ativo";
        LocalDateTime dataCadastroEstacao = LocalDateTime.now();
        String observacaoEstacao = "Estação Receptora na Amazonia";
        double capacidadeRecepcao = 200000;

        //Instanciando EstacaoReceptora
        EstacaoReceptora estacaoReceptora = new EstacaoReceptora(idEstacao, nomeEstacao, localizacao, statusEstacao, dataCadastroEstacao, observacaoEstacao, organizacao, capacidadeRecepcao);

        //OperacaoSBSP
        int idOperacao = 1;
        String nomeOperacao = "AmazonasEco";
        String descricaoOperacao = "Projeto que tem como objetivo o crescimento economico da Amazonia";
        LocalDateTime dataInicioPlanejada = LocalDateTime.of(2026, 1, 1, 0, 0);
        LocalDateTime dataFimPlanejada = LocalDateTime.of(2026, 12, 1, 0, 0);
        String statusOperacao = "ativa";
        LocalDateTime dataCadastroOperacao = LocalDateTime.now();

        //Instanciando OperacaoSBSP
        OperacaoSBSP operacaoSBSP = new OperacaoSBSP(idOperacao, nomeOperacao, descricaoOperacao, dataInicioPlanejada, dataFimPlanejada, statusOperacao, dataCadastroOperacao, organizacao, usuario);

        //RelatorioAnalitico
        int idRelatorio = 1;
        LocalDateTime dataInicioPeriodo = LocalDateTime.of(2026, 6, 1, 0, 0);
        LocalDateTime dataFimPeriodo = LocalDateTime.of(2026, 7, 1, 0, 0);
        String titulo = "Mês de Junho";
        String tipoRelatorio = "Mensal";
        String conteudo = "Tudo no padrão";
        String statusRelatorio = "ativo";
        LocalDateTime dataGeracao = LocalDateTime.now();
        String periodoReferencia = "Mês de Junho";

        //Instanciando RelatorioAnalitico
        RelatorioAnalitico relatorioAnalitico = new RelatorioAnalitico(idRelatorio, dataInicioPeriodo, dataFimPeriodo, titulo, tipoRelatorio, conteudo, statusRelatorio, dataGeracao, organizacao, usuario, periodoReferencia);

        //RelatorioOperacao
        int idRelatorioOperacao = 1;

        //Instanciando RelatorioOperacao
        RelatorioOperacao relatorioOperacao = new RelatorioOperacao(idRelatorioOperacao, relatorioAnalitico, operacaoSBSP);

        //Monitoramento
        int idMonitoramento = 1;
        LocalDateTime dataHoraColeta = LocalDateTime.now();
        double energiaCaptada = 100000;
        double energiaTransmitida = 120000;
        double energiaRecebida = 100000;
        String statusMonitoramento = "ativo";
        String observacaoMonitoramento = "Fora do Padrão";

        //Instanciando Monitoramento
        Monitoramento monitoramento = new Monitoramento(idMonitoramento, dataHoraColeta, energiaCaptada, energiaTransmitida, energiaRecebida, statusMonitoramento, observacaoMonitoramento, operacaoSBSP);

        //Anomalia
        int idAnomalia = 1;
        String tipoAnomalia = "Perda Energetica";
        String descricaoAnomalia = "Muita perda de energia na transmissão";
        String severidadeAnomalia = "medio";
        LocalDateTime dataHoraDetectada = LocalDateTime.now();
        String statusAnomalia = "detectada";

        //Instanciando Anomalia
        Anomalia anomalia = new Anomalia(idAnomalia, tipoAnomalia, descricaoAnomalia, severidadeAnomalia, dataHoraDetectada, statusAnomalia, monitoramento);

        //SateliteOperacao
        int idSateliteOperacao = 1;
        LocalDateTime dataVinculoSateliteOperacao = LocalDateTime.now();
        String statusParticipacao = "ativo";

        //Instanciando SateliteOperacao
        SateliteOperacao sateliteOperacao = new SateliteOperacao(idSateliteOperacao, satelite, operacaoSBSP, dataVinculoSateliteOperacao, statusParticipacao);

        //EstacaoOperacao
        int idEstacaoOperacao = 1;
        LocalDateTime dataVinculoEstacaoOperacao = LocalDateTime.now();
        String statusVinculo = "ativo";

        //Instanciando EstacaoOperacao
        EstacaoOperacao estacaoOperacao = new EstacaoOperacao(idEstacaoOperacao, estacaoReceptora, operacaoSBSP, dataVinculoEstacaoOperacao, statusVinculo);

        //RecomentacaoIA
        int idRecomendacao = 1;
        LocalDateTime dataHoraGeracao = LocalDateTime.now();
        String recomendacao = "Verificar se envio e coleta de energia está correto";
        String statusRecomentacaoIA = "pendente";

        //Instanciando RecomentacaoIA
        RecomentacaoIA recomentacaoIA = new RecomentacaoIA(idRecomendacao, dataHoraGeracao, recomendacao, statusRecomentacaoIA, operacaoSBSP, anomalia);

        //MonitoramentoRecomendacao
        int idMonitoramentoRecomendacao = 1;
        LocalDateTime dataVinculoMonitoramentoRecomendacao = LocalDateTime.now();
        String origemAnalise = "perda de 20000 de energia";

        //Instanciando MonitoramentoRecomendacao
        MonitoramentoRecomendacao monitoramentoRecomendacao = new MonitoramentoRecomendacao(idMonitoramentoRecomendacao, monitoramento, recomentacaoIA, dataVinculoMonitoramentoRecomendacao, origemAnalise);

        //Alerta
        int idAlerta = 1;
        LocalDateTime dataHoraGeracaoAlerta = LocalDateTime.now();
        String prioridade = "media";
        String statusAlerta = "nao lido";

        //Instanciando Alerta
        Alerta alerta = new Alerta(idAlerta, dataHoraGeracaoAlerta, prioridade, statusAlerta, anomalia, usuario);

    }
}
