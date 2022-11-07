package br.com.tinnova.veiculo.application.service;

import br.com.tinnova.veiculo.application.api.*;

import java.util.List;
import java.util.UUID;

public interface VeiculoService {
    VeiculoResponse criaVeiculo(VeiculoRequest veiculoRequest);
    List<VeiculoListResponse> buscaTodosVeiculos();
    VeiculoDetalhadoResponse buscaVeiculoAtravesId(UUID idVeiculo);
    void putAlteraVeiculo(UUID idVeiculo, VeiculoAlteracaoRequest veiculoAlteracaoRequest);
    void patchAlteraVeiculo(UUID idVeiculo, VeiculoAlteraStatusRequest veiculoAlteraStatusRequest);
}
