package br.com.tinnova.veiculo.application.api;

import br.com.tinnova.veiculo.application.service.VeiculoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class VeiculoRestController implements VeiculoAPI {
    private final VeiculoService veiculoServie;

    @Override
    public VeiculoResponse postVeiculo(VeiculoRequest veiculoRequest) {
        log.info("[inicia]  VeiculoRestController - postVeiculo");
        VeiculoResponse veiculoCriado = veiculoServie.criaVeiculo(veiculoRequest);
        log.info("[finaliza]  VeiculoRestController - postVeiculo");
        return veiculoCriado;
    }
}
