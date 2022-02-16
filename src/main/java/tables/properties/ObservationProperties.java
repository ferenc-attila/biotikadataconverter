package tables.properties;

import tables.backgrounddata.Observer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ObservationProperties {

    private LocalDateTime recordTime;
    private LocalDate date;
    private Observer observer;
    private Coordinates coordinates;

    public ObservationProperties(LocalDateTime recordTime, LocalDate date, Observer observer, Coordinates coordinates) {
        this.recordTime = recordTime;
        this.date = date;
        this.observer = observer;
        this.coordinates = coordinates;
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

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
