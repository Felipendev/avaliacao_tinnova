package br.com.tinnova.veiculo.application.service;

import br.com.tinnova.veiculo.application.api.VeiculoListResponse;
import br.com.tinnova.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.veiculo.application.api.VeiculoResponse;

import java.util.List;

public interface VeiculoService {
    VeiculoResponse criaVeiculo(VeiculoRequest veiculoRequest);
    List<VeiculoListResponse> buscaTodosVeiculos();
}
