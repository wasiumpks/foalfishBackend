package pl.maciejwasiak.foalfishdrama.services;

import pl.maciejwasiak.foalfishdrama.entities.Drama;

import java.util.List;

public interface DramaService {

    List<Drama> findAllDramas();

    Drama findLastDrama();

    Drama findDramaById(Long id);

    Drama saveDrama(Drama drama);

}
