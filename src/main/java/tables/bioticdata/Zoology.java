package tables.bioticdata;

import tables.bioticdata.properties.ObservationProperties;
import tables.bioticdata.properties.RecordingProperties;
import tables.bioticdata.properties.ZoologyProperties;

public class Zoology implements BioticData {

    private Long id;
    private ObservationProperties observationProperties;
    private ZoologyProperties zoologyProperties;
    private RecordingProperties recordingProperties;

    public Zoology(Long id, ObservationProperties observationProperties, ZoologyProperties zoologyProperties, RecordingProperties recordingProperties) {
        this.id = id;
        this.observationProperties = observationProperties;
        this.zoologyProperties = zoologyProperties;
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

    public ZoologyProperties getZoologyProperties() {
        return zoologyProperties;
    }

    public void setZoologyProperties(ZoologyProperties zoologyProperties) {
        this.zoologyProperties = zoologyProperties;
    }

    public RecordingProperties getRecordingProperties() {
        return recordingProperties;
    }

    public void setRecordingProperties(RecordingProperties recordingProperties) {
        this.recordingProperties = recordingProperties;
    }
}
