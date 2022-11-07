package br.com.tinnova.veiculo.application.repository;

import br.com.tinnova.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.veiculo.domain.Veiculo;

import java.util.List;
import java.util.UUID;

public interface VeiculoRepository {
    Veiculo salva(Veiculo veiculo);
    List<Veiculo> buscaTodosVeiculos();
    Veiculo buscaVeiculoAtravesId(UUID idVeiculo);
    void deletaVeiculoAtravesId(Veiculo veiculo);
}
