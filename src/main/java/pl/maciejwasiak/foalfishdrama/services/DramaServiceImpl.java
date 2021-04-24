package pl.maciejwasiak.foalfishdrama.services;

import pl.maciejwasiak.foalfishdrama.entities.Drama;
import pl.maciejwasiak.foalfishdrama.repositories.DramaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DramaServiceImpl implements DramaService {

    private final DramaRepository dramaRepository;

    @Autowired
    public DramaServiceImpl(DramaRepository dramaRepository) {
        this.dramaRepository = dramaRepository;
    }

    @Override
    public List<Drama> findAllDramas() {
        Iterable<Drama> dramas = dramaRepository.findAll();
        return StreamSupport.stream(dramas.spliterator(), true).collect(Collectors.toList());
    }

    @Override
    public Drama findLastDrama() {
        Iterable<Drama> dramas = dramaRepository.findAll();
        return StreamSupport.stream(dramas.spliterator(), true).collect(Collectors.toList()).get((int) StreamSupport.stream(dramas.spliterator(), true).count()-1);
    }

    @Override
    public Drama findDramaById(Long id) {
        Optional<Drama> vehicleOptional = dramaRepository.findById(id);
        return vehicleOptional.orElseThrow(() -> new EntityNotFoundException("No drama with such id: " + id));
    }

    @Override
    public Drama saveDrama(Drama drama) {
        return dramaRepository.save(drama);
    }

}
