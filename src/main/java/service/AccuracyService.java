package service;

import tables.backgrounddata.Accuracy;

import java.util.List;

public class AccuracyService {

    public List<Accuracy> createListOfAccuraciesFromListOfStrings(List<String> data) {
        return data.stream()
                .map(string -> string.split(";"))
                .map(array -> new Accuracy(Long.parseLong(array[0]), array[1]))
                .toList();
    }

    public List<String> createListOfStringFromListOfAccuracies(List<Accuracy> accuracies) {
        return accuracies.stream()
                .map(Accuracy::toString)
                .toList();
    }
}
