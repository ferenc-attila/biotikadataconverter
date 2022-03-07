package tables.backgrounddata;

import java.util.Objects;

public class Accuracy {

    private Long code;
    private String description;

    public Accuracy(Long code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String toString() {
        return code + ";" + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accuracy accuracy = (Accuracy) o;
        return code.equals(accuracy.code) && description.equals(accuracy.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description);
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
}
