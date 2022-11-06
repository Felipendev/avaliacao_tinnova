package br.com.tinnova.veiculo.application.repository;

import br.com.tinnova.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.veiculo.domain.Veiculo;

import java.util.List;

public interface VeiculoRepository {
    Veiculo salva(Veiculo veiculo);
    List<Veiculo> buscaTodosVeiculos();
}
