package br.com.tinnova.veiculo.application.service;

import br.com.tinnova.veiculo.application.api.*;
import br.com.tinnova.veiculo.application.repository.VeiculoRepository;
import br.com.tinnova.veiculo.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class VeiculoApplicationService implements VeiculoService {
    private final VeiculoRepository veiculoRepository;
    @Override
    public VeiculoResponse criaVeiculo(VeiculoRequest veiculoRequest) {
        log.info("[inicia] VeiculoApplicationService - criaVeiculo");
        Veiculo veiculo = veiculoRepository.salva(new Veiculo(veiculoRequest));
        log.info("[finaliza] VeiculoApplicationService - criaVeiculo");
        return VeiculoResponse.builder().idVeiculo(veiculo.getIdVeiculo()).build();
    }
    @Override
    public List<VeiculoListResponse> buscaTodosVeiculos() {
        log.info("[inicia] VeiculoApplicationService - buscaTodosVeiculos");
        List<Veiculo> veiculos = veiculoRepository.buscaTodosVeiculos();
        log.info("[finaliza] VeiculoApplicationService - buscaTodosVeiculos");
        return VeiculoListResponse.converte(veiculos);
    }
    @Override
    public VeiculoDetalhadoResponse buscaVeiculoAtravesId(UUID idVeiculo) {
        log.info("[inicia] VeiculoApplicationService - buscaVeiculoAtravesId");
        Veiculo veiculo = veiculoRepository.buscaVeiculoAtravesId(idVeiculo);
        log.info("[finaliza] VeiculoApplicationService - buscaVeiculoAtravesId");
        return new VeiculoDetalhadoResponse(veiculo);
    }
    @Override
    public void putAlteraVeiculo(UUID idVeiculo, VeiculoAlteracaoRequest veiculoAlteracaoRequest) {
        log.info("[inicia] VeiculoApplicationService - putAlteraVeiculo");
        Veiculo veiculo = veiculoRepository.buscaVeiculoAtravesId(idVeiculo);
        veiculo.altera(veiculoAlteracaoRequest);
        veiculoRepository.salva(veiculo);
        log.info("[finaliza] VeiculoApplicationService - putAlteraVeiculo");
    }
    @Override
    public void patchAlteraVeiculo(UUID idVeiculo, VeiculoAlteraStatusRequest veiculoAlteraStatusRequest) {
        log.info("[inicia] VeiculoApplicationService - patchAlteraVeiculo");
        Veiculo veiculo = veiculoRepository.buscaVeiculoAtravesId(idVeiculo);
        veiculo.atualiza(veiculoAlteraStatusRequest);
        veiculoRepository.salva(veiculo);
        log.info("[finaliza] VeiculoApplicationService - patchAlteraVeiculo");
    }
    @Override
    public void deletaVeiculoAtravesId(UUID idVeiculo) {
        log.info("[inicia] VeiculoApplicationService - deletaVeiculoAtravesId");
        Veiculo veiculo = veiculoRepository.buscaVeiculoAtravesId(idVeiculo);
        veiculoRepository.deletaVeiculoAtravesId(veiculo);
        log.info("[finaliza] VeiculoApplicationService - deletaVeiculoAtravesId");
    }
}
