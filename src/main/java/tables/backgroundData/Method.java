package tables.backgroundData;

public class Method {

    private Long code;
    private String description;
    private String group;
    private double rank;

    public Method(Long code, String description, String group, double rank) {
        this.code = code;
        this.description = description;
        this.group = group;
        this.rank = rank;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }
}
