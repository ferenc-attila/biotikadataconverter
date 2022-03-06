package tables.properties;

import tables.backgrounddata.Phenology;
import tables.backgrounddata.Flora;
import tables.backgrounddata.Unit;

public class BotanyProperties implements BioticProperties {

    private Flora species;
    private double individuals;
    private Unit unit;
    private Phenology phenology;

    public BotanyProperties(Flora species, double individuals, Unit unit, Phenology phenology) {
        this.species = species;
        this.individuals = individuals;
        this.unit = unit;
        this.phenology = phenology;
    }

    public Flora getSpecies() {
        return species;
    }

    public void setSpecies(Flora species) {
        this.species = species;
    }

    public double getIndividuals() {
        return individuals;
    }

    public void setIndividuals(double individuals) {
        this.individuals = individuals;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Phenology getPhenology() {
        return phenology;
    }

    public void setPhenology(Phenology phenology) {
        this.phenology = phenology;
    }
}
