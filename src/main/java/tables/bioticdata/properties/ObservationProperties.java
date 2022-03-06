package tables.bioticdata.properties;

import tables.backgrounddata.Contributor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ObservationProperties {

    private LocalDateTime recordTime;
    private LocalDate date;
    private Contributor observer;
    private Coordinates coordinates;
    private String notes;

    public ObservationProperties(LocalDateTime recordTime, LocalDate date, Contributor observer, Coordinates coordinates) {
        this.recordTime = recordTime;
        this.date = date;
        this.observer = observer;
        this.coordinates = coordinates;
    }

    public ObservationProperties(LocalDateTime recordTime, LocalDate date, Contributor observer, Coordinates coordinates, String notes) {
        this(recordTime, date, observer, coordinates);
        this.notes = notes;
    }

    public LocalDateTime getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(LocalDateTime recordTime) {
        this.recordTime = recordTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Contributor getObserver() {
        return observer;
    }

    public void setObserver(Contributor observer) {
        this.observer = observer;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
