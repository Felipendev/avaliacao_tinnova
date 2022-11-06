package br.com.tinnova.veiculo.application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class VeiculoRestController implements VeiculoAPI {
    @Override
    public VeiculoResponse postVeiculo(VeiculoRequest veiculoRequest) {
        log.info("[start]  VeiculoRestController - postVeiculo");
        log.info("[finish]  VeiculoRestController - postVeiculo");
        return null;
    }
}
