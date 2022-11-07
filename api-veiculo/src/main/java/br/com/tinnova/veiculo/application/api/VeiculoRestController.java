package br.com.tinnova.veiculo.application.api;

import br.com.tinnova.veiculo.application.service.VeiculoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class VeiculoRestController implements VeiculoAPI {
    private final VeiculoService veiculoService;
    @Override
    public VeiculoResponse postVeiculo(VeiculoRequest veiculoRequest) {
        log.info("[inicia]  VeiculoRestController - postVeiculo");
        VeiculoResponse veiculoCriado = veiculoService.criaVeiculo(veiculoRequest);
        log.info("[finaliza]  VeiculoRestController - postVeiculo");
        return veiculoCriado;
    }
    @Override
    public List<VeiculoListResponse> getTodosVeiculos() {
        log.info("[inicia]  VeiculoRestController - getTodosVeiculos");
        List<VeiculoListResponse> veiculos = veiculoService.buscaTodosVeiculos();
        log.info("[finaliza]  VeiculoRestController - getTodosVeiculos");
        return veiculos;
    }
    @Override
    public VeiculoDetalhadoResponse getVeiculoAtravesId(UUID idVeiculo) {
        log.info("[inicia]  VeiculoRestController - getVeiculoAtravesId");
        VeiculoDetalhadoResponse veiculoDetalhado = veiculoService.buscaVeiculoAtravesId(idVeiculo);
        log.info("[finaliza]  VeiculoRestController - getVeiculoAtravesId");
        return veiculoDetalhado;
    }
    @Override
    public void putAlteraVeiculo(UUID idVeiculo, VeiculoAlteracaoRequest veiculoAlteracaoRequest) {
        log.info("[inicia] VeiculoRestController - putAlteraVeiculo");
        veiculoService.putAlteraVeiculo(idVeiculo, veiculoAlteracaoRequest);
        log.info("[inicia] VeiculoRestController - putAlteraVeiculo");
    }
    @Override
    public void patchAlteraVeiculo(UUID idVeiculo, VeiculoAlteraStatusRequest veiculoAlteraStatusRequest) {
        log.info("[inicia] VeiculoRestController - patchAlteraVeiculo");
        veiculoService.patchAlteraVeiculo(idVeiculo, veiculoAlteraStatusRequest);
        log.info("[inicia] VeiculoRestController - patchAlteraVeiculo");
    }

    @Override
    public void deletaVeiculoAtravesId(UUID idVeiculo) {
        log.info("[inicia] VeiculoRestController - deletaVeiculoAtravesId");
        veiculoService.deletaVeiculoAtravesId(idVeiculo);
        log.info("[finaliza] VeiculoRestController - deletaVeiculoAtravesId");
    }

    @Override
    public List<VeiculoListByParametrosResponse> listaVeiculosPorParametros(String marca, Integer ano, String cor) {
        log.info("[inicia] VeiculoRestController - listaVeiculosPorParametros");
        List<VeiculoListByParametrosResponse> veiculosPorParametros = veiculoService.buscaVeiculosPorParametros(marca,
                ano, cor);
        log.info("[finaliza] VeiculoRestController - listaVeiculosPorParametros");
        return veiculosPorParametros;
    }
}
