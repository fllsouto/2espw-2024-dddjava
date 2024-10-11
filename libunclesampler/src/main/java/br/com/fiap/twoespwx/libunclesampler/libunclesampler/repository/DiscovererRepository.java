package br.com.fiap.twoespwx.libunclesampler.libunclesampler.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.com.fiap.twoespwx.libunclesampler.libunclesampler.model.Discoverer;

public interface DiscovererRepository extends Repository<Discoverer, Long> {
    
    List<Discoverer> findAll();

    Discoverer save(Discoverer discoverer);
}
