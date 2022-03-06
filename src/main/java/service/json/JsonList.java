package service.json;

import java.util.ArrayList;
import java.util.List;

public class JsonList {

    private String name;
    private List<String> listOfJson = new ArrayList<>();

    public JsonList(String name) {
        this.name = name;
    }

    public void addJsonElement (String jsonElement) {
        listOfJson.add(jsonElement);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfJson(List<String> listOfJson) {
        this.listOfJson = listOfJson;
    }

    public List<String> getListOfJson() {
        return List.copyOf(listOfJson);
    }

    @Override
    public String toString() {
        return name + ": " + listOfJson.toString();
    }
}
