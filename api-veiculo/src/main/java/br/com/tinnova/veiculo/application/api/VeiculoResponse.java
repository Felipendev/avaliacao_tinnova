package br.com.tinnova.veiculo.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class VeiculoResponse {
    private UUID idVeiculo;
}
