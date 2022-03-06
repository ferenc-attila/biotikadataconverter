package tables.backgrounddata;

public class Contributor {

    private Long code;
    private String name;

    public Contributor(Long code, String name) {
        this.code = code;
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
