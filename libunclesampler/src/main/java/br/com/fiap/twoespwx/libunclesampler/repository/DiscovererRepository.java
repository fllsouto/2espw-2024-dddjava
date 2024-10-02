package br.com.fiap.twoespwx.libunclesampler.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import br.com.fiap.twoespwx.libunclesampler.libunclesampler.model.Discoverer;

public interface DiscovererRepository extends Repository<Discoverer, Long> {
    
    List<Discoverer> findAll();
}
