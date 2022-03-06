package tables.data;

import tables.data.properties.BotanyProperties;
import tables.data.properties.ObservationProperties;
import tables.data.properties.RecordingProperties;

public class Botany implements BioticData {

    private Long id;
    private ObservationProperties observationProperties;
    private BotanyProperties botanyProperties;
    private RecordingProperties recordingProperties;

    public Botany(Long id, ObservationProperties observationProperties, BotanyProperties botanyProperties, RecordingProperties recordingProperties) {
        this.id = id;
        this.observationProperties = observationProperties;
        this.botanyProperties = botanyProperties;
        this.recordingProperties = recordingProperties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ObservationProperties getObservationProperties() {
        return observationProperties;
    }

    public void setObservationProperties(ObservationProperties observationProperties) {
        this.observationProperties = observationProperties;
    }

    public BotanyProperties getBotanyProperties() {
        return botanyProperties;
    }

    public void setBotanyProperties(BotanyProperties botanyProperties) {
        this.botanyProperties = botanyProperties;
    }

    public RecordingProperties getRecordingProperties() {
        return recordingProperties;
    }

    public void setRecordingProperties(RecordingProperties recordingProperties) {
        this.recordingProperties = recordingProperties;
    }
}
