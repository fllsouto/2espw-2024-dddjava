package br.com.fiap.twoespwx.libunclesampler.libunclesampler.controller.input;

import java.time.LocalDate;
import java.util.List;

public class DiscovererFormInput {

    private String fullName;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private String nationality;
    private String fieldOfStudy;
    private List<String> discoveries;
    private List<String> publications;
    private String biography;
    private String knownFor;
    private String geoJsonExplorationAreas;
    private boolean isAlive;
    
    public DiscovererFormInput(String fullName, LocalDate birthDate, LocalDate deathDate, String nationality,
            String fieldOfStudy, String biography, String knownFor, String geoJsonExplorationAreas, boolean isAlive) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.nationality = nationality;
        this.fieldOfStudy = fieldOfStudy;
        this.biography = biography;
        this.knownFor = knownFor;
        this.geoJsonExplorationAreas = geoJsonExplorationAreas;
        this.isAlive = isAlive;
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
