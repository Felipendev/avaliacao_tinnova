package br.com.tinnova.veiculo.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/veiculo")
public interface VeiculoAPI {
    @CrossOrigin
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    VeiculoResponse postVeiculo(@RequestBody @Valid VeiculoRequest veiculoRequest);

    @CrossOrigin
    @GetMapping(value = "/veiculos")
    @ResponseStatus(code = HttpStatus.OK)
    List<VeiculoListResponse> getTodosVeiculos();

    @CrossOrigin
    @GetMapping(value = "/{idVeiculo}")
    @ResponseStatus(code = HttpStatus.OK)
    VeiculoDetalhadoResponse getVeiculoAtravesId(@PathVariable UUID idVeiculo);

    @CrossOrigin
    @PutMapping(value = "/{idVeiculo}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void  putAlteraVeiculo(@PathVariable UUID idVeiculo,
                           @Valid @RequestBody VeiculoAlteracaoRequest veiculoAlteracaoRequest);
    @CrossOrigin
    @PatchMapping(value = "/{idVeiculo}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void  patchAlteraVeiculo(@PathVariable UUID idVeiculo,
                                     @Valid @RequestBody VeiculoAlteraStatusRequest veiculoAlteraStatusRequest);

    @CrossOrigin
    @DeleteMapping(value = "/{idVeiculo}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void  deletaVeiculoAtravesId(@PathVariable UUID idVeiculo);

    @CrossOrigin
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<VeiculoListByParametrosResponse> listaVeiculosPorParametros(@RequestParam(value = "marca", required = false) String marca,
                                                                     @RequestParam(value = "ano", required = false) Integer ano,
                                                                     @RequestParam(value = "cor", required = false) String cor);
}
