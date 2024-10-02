package br.com.fiap.twoespwx.libunclesampler.libunclesampler.model;

import java.time.LocalDate;
import java.util.List;

public class Insect {
    
    private String commonName;
    private String scientificName;
    private String specieName;
    private String pictureProfilePath;
    private List<InsectPicture> pictures;
    private List<Habitat> habitats;
    private Double averageSize;
    private Double averageWeight;
    private LocalDate dateDiscovery;
    private Discoverer originalDiscoverer;

}

