package br.com.tinnova.veiculo.domain;

import br.com.tinnova.veiculo.application.api.VeiculoAlteracaoRequest;
import br.com.tinnova.veiculo.application.api.VeiculoRequest;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Document(collection = "Veiculo")
public class Veiculo {
    @Id
    private UUID idVeiculo;
    @NotBlank
    private String nomeVeiculo;
    @NotBlank
    private String marca;
    @NotNull
    private Integer ano;
    @NotBlank
    private String cor;
    private String descricao;
    private Boolean vendido = false;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Veiculo(VeiculoRequest veiculoRequest) {
        this.idVeiculo = UUID.randomUUID();
        this.nomeVeiculo = veiculoRequest.getNomeVeiculo();
        this.marca = veiculoRequest.getMarca();
        this.ano = veiculoRequest.getAno();
        this.cor = veiculoRequest.getCor();
        this.descricao = veiculoRequest.getDescricao();
        this.vendido = false;
        this.created = LocalDateTime.now();;
    }
    public void altera(VeiculoAlteracaoRequest veiculoAlteracaoRequest) {
        this.nomeVeiculo = veiculoAlteracaoRequest.getNomeVeiculo();
        this.marca = veiculoAlteracaoRequest.getMarca();
        this.ano = veiculoAlteracaoRequest.getAno();
        this.cor = veiculoAlteracaoRequest.getCor();
        this.descricao = veiculoAlteracaoRequest.getDescricao();
        this.vendido = veiculoAlteracaoRequest.getVendido();
        this.updated = LocalDateTime.now();
    }
}
