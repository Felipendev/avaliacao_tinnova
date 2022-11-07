package br.com.tinnova.veiculo.infra;

import br.com.tinnova.veiculo.domain.Veiculo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface VeiculoSpringMongoDBRepository extends MongoRepository<Veiculo, UUID> {
}
