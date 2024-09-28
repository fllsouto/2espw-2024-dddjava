package br.com.fiap.twoespwx.libunclesampler.libunclesampler.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/")
public class HomeController {
    
    @GetMapping("/health")
    public String health() {
        return "up";
    }
    
}
