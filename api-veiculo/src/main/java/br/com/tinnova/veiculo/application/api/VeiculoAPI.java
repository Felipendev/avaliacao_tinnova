package br.com.tinnova.veiculo.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/veiculo")
public interface VeiculoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    VeiculoResponse postVeiculo(@RequestBody @Valid VeiculoRequest veiculoRequest);

    @GetMapping(value = "/veiculos")
    @ResponseStatus(code = HttpStatus.OK)
    List<VeiculoListResponse> getTodosVeiculos();

    @GetMapping(value = "/{idVeiculo}")
    @ResponseStatus(code = HttpStatus.OK)
    VeiculoDetalhadoResponse getVeiculoAtravesId(@PathVariable UUID idVeiculo);
}
