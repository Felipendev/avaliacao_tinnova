package br.com.tinnova.veiculo.application.api;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
public class VeiculoAlteraStatusRequest {
    @NotBlank(message = "O Nome do Veículo não pode estar vazio")
    @Size(message = "Nome do Veículo deve conter entre 3 e 255 caracteres ", min = 3, max = 255)
    private String nomeVeiculo;

    @NotBlank(message = "O Campo Marca não pode estar vazio")
    private String marca;

    @NotNull(message = "O Campo Ano não pode estar vazio")
    private Integer ano;

    @NotBlank(message = "O Campo Cor não pode estar vazio")
    private String cor;
    private Boolean vendido;
    private String descricao;


}
