package br.com.tinnova.veiculo.application.repository;

import br.com.tinnova.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.veiculo.domain.Veiculo;

public interface VeiculoRepository {
    Veiculo salva(Veiculo veiculo);
}
