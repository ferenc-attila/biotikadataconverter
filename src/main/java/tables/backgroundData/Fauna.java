package tables.backgroundData;

public class Fauna {

    private Long code;
    private String scientificName;
    private Suprataxon suprataxon;
    private Relevance relevance;

    public Fauna(Long code, String scientificName, Suprataxon suprataxon, Relevance relevance) {
        this.code = code;
        this.scientificName = scientificName;
        this.suprataxon = suprataxon;
        this.relevance = relevance;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public Suprataxon getSuprataxon() {
        return suprataxon;
    }

    public void setSuprataxon(Suprataxon suprataxon) {
        this.suprataxon = suprataxon;
    }

    public Relevance getRelevance() {
        return relevance;
    }

    public void setRelevance(Relevance relevance) {
        this.relevance = relevance;
    }
}
