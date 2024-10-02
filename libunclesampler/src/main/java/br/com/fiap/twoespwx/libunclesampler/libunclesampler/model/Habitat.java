package br.com.fiap.twoespwx.libunclesampler.libunclesampler.model;

import java.util.List;

public class Habitat {

    // Fields to describe a habitat
    private String name;                 // Name of the habitat (e.g., Forest, Desert, Ocean)
    private String type;                 // Type of habitat (e.g., Terrestrial, Aquatic, Arboreal)
    private double area;                 // Size of the habitat in square kilometers or another appropriate unit
    private String climate;              // Climate of the habitat (e.g., Tropical, Arid, Temperate)
    private List<String> species;        // List of species that inhabit the area
    private double averageTemperature;   // Average temperature in the habitat
    private double precipitation;        // Average annual precipitation (rainfall)
    private List<String> foodSources;    // List of food sources available in the habitat
    private List<String> waterSources;   // List of water sources available in the habitat (e.g., rivers, lakes)
    private boolean isProtected;         // Whether the habitat is protected (e.g., national park, conservation area)
    private String location;             // General location of the habitat (e.g., continent, country, coordinates)
    private String geoJsonGeometry;      // GeoJSON string representing the habitat's geometry

    // Constructors, Getters, Setters, and Methods
    // ...
}
