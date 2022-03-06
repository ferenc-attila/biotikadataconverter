package tables.bioticdata.properties;

import tables.backgrounddata.Accuracy;
import tables.backgrounddata.Contributor;
import tables.backgrounddata.Relevance;
import tables.backgrounddata.Source;

import java.time.LocalDateTime;

public class RecordingProperties {

    private Contributor interpreter;
    private Accuracy accuracy;
    private String quality;
    private Relevance relevance;
    private Source source;
    private LocalDateTime recordingTime;

    public RecordingProperties(Contributor interpreter, Accuracy accuracy, String quality, Relevance relevance, Source source, LocalDateTime recordingTime) {
        this(interpreter, quality, source, relevance, recordingTime);
        this.accuracy = accuracy;
    }

    public RecordingProperties(Contributor interpreter, String quality, Source source, Relevance relevance, LocalDateTime recordingTime) {
        this.interpreter = interpreter;
        this.quality = quality;
        this.relevance = relevance;
        this.source = source;
        this.recordingTime = recordingTime;
    }

    public Contributor getInterpreter() {
        return interpreter;
    }

    public void setInterpreter(Contributor interpreter) {
        this.interpreter = interpreter;
    }

    public Accuracy getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Relevance getRelevance() {
        return relevance;
    }

    public void setRelevance(Relevance relevance) {
        this.relevance = relevance;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public LocalDateTime getRecordingTime() {
        return recordingTime;
    }

    public void setRecordingTime(LocalDateTime recordingTime) {
        this.recordingTime = recordingTime;
    }
}
