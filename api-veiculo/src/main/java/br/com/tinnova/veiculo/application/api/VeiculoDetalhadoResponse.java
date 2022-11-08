package br.com.tinnova.veiculo.application.api;

import br.com.tinnova.veiculo.domain.Veiculo;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class VeiculoDetalhadoResponse {
    private UUID idVeiculo;
    private String nomeVeiculo;
    private String marca;
    private Integer ano;
    private String cor;
    private String descricao;
    private Boolean vendido;
    private LocalDateTime created;

    public VeiculoDetalhadoResponse(Veiculo veiculo){
        this.idVeiculo = veiculo.getIdVeiculo();
        this.nomeVeiculo = veiculo.getNomeVeiculo();
        this.marca = veiculo.getMarca();
        this.ano = veiculo.getAno();
        this.cor = veiculo.getCor();
        this.descricao = veiculo.getDescricao();
        this.vendido = veiculo.getVendido();
        this.created = veiculo.getCreated();
    }
}
