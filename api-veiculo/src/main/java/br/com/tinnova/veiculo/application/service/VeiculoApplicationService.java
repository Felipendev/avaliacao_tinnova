package br.com.tinnova.veiculo.application.service;

import br.com.tinnova.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.veiculo.application.api.VeiculoResponse;
import br.com.tinnova.veiculo.application.repository.VeiculoRepository;
import br.com.tinnova.veiculo.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class VeiculoApplicationService implements VeiculoService {
    private final VeiculoRepository veiculoRepository;
    @Override
    public VeiculoResponse criaVeiculo(VeiculoRequest veiculoRequest) {
        log.info("[inicia] VeiculoApplicationService - criaVeiculo");
        Veiculo veiculo = veiculoRepository.salva(veiculoRequest);
        log.info("[finaliza] VeiculoApplicationService - criaVeiculo");
        return VeiculoResponse.builder().idVeiculo(veiculo.getIdVeiculo()).build();
    }
}
