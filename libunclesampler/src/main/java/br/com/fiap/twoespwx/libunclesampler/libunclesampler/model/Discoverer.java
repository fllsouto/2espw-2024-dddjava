package br.com.fiap.twoespwx.libunclesampler.libunclesampler.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Discoverer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Fields to describe a discoverer
    private String fullName;                   // Full name of the discoverer (e.g., Carl Linnaeus)
    private LocalDate birthDate;               // Date of birth
    private LocalDate deathDate;               // Date of death (nullable for living discoverers)
    private String nationality;                // Nationality of the discoverer
    private String fieldOfStudy;               // Primary field of study (e.g., Botany, Zoology, Taxonomy)
    private List<String> discoveries;          // List of discoveries or contributions (e.g., Species, classifications)
    private List<String> publications;         // List of notable publications or papers
    private String biography;                  // Brief biography or description
    private String knownFor;                   // Key achievement or discovery they are famous for
    private String geoJsonExplorationAreas;    // GeoJSON representing areas explored by the discoverer
    private boolean isAlive;
  
    public Discoverer(Long id, String fullName, LocalDate birthDate, LocalDate deathDate, String nationality,
            String fieldOfStudy, List<String> discoveries, List<String> publications, String biography, String knownFor,
            String geoJsonExplorationAreas, boolean isAlive) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.nationality = nationality;
        this.fieldOfStudy = fieldOfStudy;
        this.discoveries = discoveries;
        this.publications = publications;
        this.biography = biography;
        this.knownFor = knownFor;
        this.geoJsonExplorationAreas = geoJsonExplorationAreas;
        this.isAlive = isAlive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public List<String> getDiscoveries() {
        return discoveries;
    }

    public void setDiscoveries(List<String> discoveries) {
        this.discoveries = discoveries;
    }

    public List<String> getPublications() {
        return publications;
    }

    public void setPublications(List<String> publications) {
        this.publications = publications;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getKnownFor() {
        return knownFor;
    }

    public void setKnownFor(String knownFor) {
        this.knownFor = knownFor;
    }

    public String getGeoJsonExplorationAreas() {
        return geoJsonExplorationAreas;
    }

    public void setGeoJsonExplorationAreas(String geoJsonExplorationAreas) {
        this.geoJsonExplorationAreas = geoJsonExplorationAreas;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    

    

}
