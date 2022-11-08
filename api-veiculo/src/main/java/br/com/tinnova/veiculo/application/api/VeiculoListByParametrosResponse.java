package br.com.tinnova.veiculo.application.api;

import br.com.tinnova.veiculo.domain.Veiculo;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class VeiculoListByParametrosResponse {
    private String marca;
    private String cor;
    private Integer ano;

    public static List<VeiculoListByParametrosResponse> converte(List<Veiculo> veiculos) {
        return veiculos.stream()
                .map(VeiculoListByParametrosResponse::new)
                .collect(Collectors.toList());
    }
    public VeiculoListByParametrosResponse(Veiculo veiculo) {
        this.marca = veiculo.getMarca();
        this.ano = veiculo.getAno();
        this.cor = veiculo.getCor();
    }
}
