package br.com.fiap.twoespwx.libunclesampler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.twoespwx.libunclesampler.libunclesampler.model.Discoverer;
import br.com.fiap.twoespwx.libunclesampler.repository.DiscovererRepository;

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
}
