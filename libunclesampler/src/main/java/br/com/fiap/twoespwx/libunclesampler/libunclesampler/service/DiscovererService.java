package br.com.fiap.twoespwx.libunclesampler.libunclesampler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.twoespwx.libunclesampler.libunclesampler.controller.input.DiscovererFormInput;
import br.com.fiap.twoespwx.libunclesampler.libunclesampler.model.Discoverer;
import br.com.fiap.twoespwx.libunclesampler.libunclesampler.repository.DiscovererRepository;

@Service
public class DiscovererService {

    private DiscovererRepository discovererRepository;

    @Autowired
    public DiscovererService(DiscovererRepository discovererRepository) {
        this.discovererRepository = discovererRepository;
    }
 
    public List<Discoverer> findAll() {
        return discovererRepository.findAll();
    }

    public Discoverer create(DiscovererFormInput input) {
        Discoverer newDiscoverer = new Discoverer(
            input.getFullName(),
            input.getBirthDate(),
            input.getDeathDate(),
            input.getNationality(),
            input.getFieldOfStudy(),
            input.getDiscoveries(),
            input.getPublications(),
            input.getBiography(),
            input.getKnownFor(),
            input.getGeoJsonExplorationAreas(),
            input.isAlive()
         );
         return discovererRepository.save(newDiscoverer);
    }
}
