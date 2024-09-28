package br.com.fiap.twoespwx.libunclesampler.libunclesampler.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.twoespwx.libunclesampler.libunclesampler.model.Discoverer;
import br.com.fiap.twoespwx.libunclesampler.service.DiscovererService;

@RestController
@RequestMapping("/discoverer")
public class DiscovererController {

    private DiscovererService discovererService;

    @Autowired
    public DiscovererController(DiscovererService discovererService) {
        this.discovererService = discovererService;
    }

    @GetMapping(path = "/all")
    public List<Discoverer> getAll() {
        return this.discovererService.findAll();
    }
}
