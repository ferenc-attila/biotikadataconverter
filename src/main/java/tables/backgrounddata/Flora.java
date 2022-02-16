package tables.backgrounddata;

public class Flora {

    private Double code;
    private Long taxonCode;
    private String ScientificName;
    private Relevance relevance;
    private Unit unit;
    private Setup setup;

    public Flora(Double code, Long taxonCode, String scientificName, Relevance relevance, Unit unit, Setup setup) {
        this.code = code;
        this.taxonCode = taxonCode;
        ScientificName = scientificName;
        this.relevance = relevance;
        this.unit = unit;
        this.setup = setup;
    }

    public Double getCode() {
        return code;
    }

    public void setCode(Double code) {
        this.code = code;
    }

    public Long getTaxonCode() {
        return taxonCode;
    }

    public void setTaxonCode(Long taxonCode) {
        this.taxonCode = taxonCode;
    }

    public String getScientificName() {
        return ScientificName;
    }

    public void setScientificName(String scientificName) {
        ScientificName = scientificName;
    }

    public Relevance getRelevance() {
        return relevance;
    }

    public void setRelevance(Relevance relevance) {
        this.relevance = relevance;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Setup getSetup() {
        return setup;
    }

    public void setSetup(Setup setup) {
        this.setup = setup;
    }
}
