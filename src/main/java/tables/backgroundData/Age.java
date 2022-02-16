package tables.backgroundData;

public class Age {

    private Long code;
    private String description;
    private boolean[] suprataxonValidation;

    public Age(Long code, String description, boolean[] suprataxonValidation) {
        this.code = code;
        this.description = description;
        this.suprataxonValidation = suprataxonValidation;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean[] getSuprataxonValidation() {
        return suprataxonValidation;
    }

    public void setSuprataxonValidation(boolean[] suprataxonValidation) {
        this.suprataxonValidation = suprataxonValidation;
    }
}
