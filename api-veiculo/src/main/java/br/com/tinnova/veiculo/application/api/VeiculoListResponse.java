package br.com.tinnova.veiculo.application.api;

import br.com.tinnova.veiculo.domain.Veiculo;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class VeiculoListResponse {
    private UUID idVeiculo;
    private String nomeVeiculo;
    private String marca;
    private String cor;
    private String descricao;
    private Integer ano;
    private Boolean vendido;

    public static List<VeiculoListResponse> converte(List<Veiculo> veiculos) {
        return veiculos.stream()
                .map(VeiculoListResponse::new)
                .collect(Collectors.toList());
    }
    public VeiculoListResponse(Veiculo veiculo) {
        this.idVeiculo = veiculo.getIdVeiculo();
        this.nomeVeiculo = veiculo.getNomeVeiculo();
        this.ano = veiculo.getAno();
        this.cor = veiculo.getCor();
        this.vendido = veiculo.getVendido();
        this.marca = veiculo.getMarca();
        this.descricao = veiculo.getDescricao();
    }
}