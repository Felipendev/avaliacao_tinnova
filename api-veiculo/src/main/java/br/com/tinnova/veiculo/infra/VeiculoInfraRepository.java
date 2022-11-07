package br.com.tinnova.veiculo.infra;

import br.com.tinnova.veiculo.application.repository.VeiculoRepository;
import br.com.tinnova.veiculo.domain.Veiculo;
import br.com.tinnova.veiculo.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class VeiculoInfraRepository implements VeiculoRepository {
    private final VeiculoSpringMongoDBRepository veiculoSpringMongoDBRepository;
    @Override
    public Veiculo salva(Veiculo veiculo) {
        log.info("[inicia] VeiculoInfraRepository - salva");
        veiculoSpringMongoDBRepository.save(veiculo);
        log.info("[finaliza] VeiculoInfraRepository - salva");
        return veiculo;
    }
    @Override
    public List<Veiculo> buscaTodosVeiculos() {
        log.info("[inicia] VeiculoInfraRepository - buscaTodosVeiculos");
        List<Veiculo> todosVeiculos = veiculoSpringMongoDBRepository.findAll();
        log.info("[finaliza] VeiculoInfraRepository - buscaTodosVeiculos");
        return todosVeiculos;
    }
    @Override
    public Veiculo buscaVeiculoAtravesId(UUID idVeiculo) {
        log.info("[inicia] VeiculoInfraRepository - buscaVeiculoAtravesId");
        Veiculo veiculo = veiculoSpringMongoDBRepository.findById(idVeiculo)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Veiculo não encontrado!"));
        log.info("[finaliza] VeiculoInfraRepository - buscaVeiculoAtravesId");
        return veiculo;
    }
    @Override
    public void deletaVeiculoAtravesId(Veiculo veiculo) {
        log.info("[inicia] VeiculoInfraRepository - deletaVeiculoAtravesId");
        veiculoSpringMongoDBRepository.delete(veiculo);
        log.info("[finaliza] VeiculoInfraRepository - deletaVeiculoAtravesId");
    }
}
