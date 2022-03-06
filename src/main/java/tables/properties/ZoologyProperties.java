package tables.properties;

import tables.backgrounddata.Activity;
import tables.backgrounddata.Age;
import tables.backgrounddata.Fauna;
import tables.backgrounddata.Gender;

public class ZoologyProperties implements BioticProperties {

    private Fauna species;
    private double individuals;
    private Gender gender;
    private Age age;
    private Activity activity;

    public ZoologyProperties(Fauna species, double individuals, Activity activity) {
        this.species = species;
        this.individuals = individuals;
        this.activity = activity;
    }

    public ZoologyProperties(Fauna species, double individuals, Gender gender, Age age, Activity activity) {
        this(species, individuals, activity);
        this.gender = gender;
        this.age = age;
    }

    public Fauna getSpecies() {
        return species;
    }

    public void setSpecies(Fauna species) {
        this.species = species;
    }

    public double getIndividuals() {
        return individuals;
    }

    public void setIndividuals(double individuals) {
        this.individuals = individuals;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
