package br.com.tinnova.veiculo.infra;

import br.com.tinnova.veiculo.application.api.VeiculoRequest;
import br.com.tinnova.veiculo.application.repository.VeiculoRepository;
import br.com.tinnova.veiculo.domain.Veiculo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class VeiculoInfraRepository implements VeiculoRepository {
    private final TarefaSpringMongoDBRepository tarefaSpringMongoDBRepository;
    @Override
    public Veiculo salva(Veiculo veiculo) {
        log.info("[inicia] VeiculoInfraRepository - salva");
        tarefaSpringMongoDBRepository.save(veiculo);
        log.info("[finaliza] VeiculoInfraRepository - salva");
        return veiculo;
    }
}
