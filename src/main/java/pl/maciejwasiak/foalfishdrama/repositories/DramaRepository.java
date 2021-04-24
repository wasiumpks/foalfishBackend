package pl.maciejwasiak.foalfishdrama.repositories;

import pl.maciejwasiak.foalfishdrama.entities.Drama;
import org.springframework.data.repository.CrudRepository;

public interface DramaRepository extends CrudRepository<Drama, Long> {
}
