package br.com.tinnova.veiculo.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/veiculo")
public interface VeiculoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    VeiculoResponse postVeiculo(@Valid @RequestBody VeiculoRequest veiculoRequest);
}
