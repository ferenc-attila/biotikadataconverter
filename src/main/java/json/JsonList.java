package json;

import java.util.ArrayList;
import java.util.List;

public class JsonList {

    private String name;
    private List<String> jsonList = new ArrayList<>();

    public JsonList(String name) {
        this.name = name;
    }

    public void addJsonElement (String jsonElement) {
        jsonList.add(jsonElement);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJsonList(List<String> jsonList) {
        this.jsonList = jsonList;
    }

    public List<String> getJsonList() {
        return List.copyOf(jsonList);
    }

    @Override
    public String toString() {
        return name + ": " + jsonList.toString();
    }
}
