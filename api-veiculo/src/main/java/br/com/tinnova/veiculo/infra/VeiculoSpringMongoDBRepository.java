package br.com.tinnova.veiculo.infra;

import br.com.tinnova.veiculo.domain.Veiculo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface VeiculoSpringMongoDBRepository extends MongoRepository<Veiculo, UUID> {
    List<Veiculo> findByMarcaOrAnoOrCor(String marca, Integer ano, String cor);
}
