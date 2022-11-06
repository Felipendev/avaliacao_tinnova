package br.com.tinnova.veiculo.domain;

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
    private Marca marca;
    @NotNull
    private Integer ano;
    @NotBlank
    private String cor;
    private String descricao;
    private Boolean vendido = false;
    private LocalDateTime created;
    private LocalDateTime updated;
}
