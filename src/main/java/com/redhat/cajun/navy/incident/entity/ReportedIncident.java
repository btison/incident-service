package com.redhat.cajun.navy.incident.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Access(AccessType.FIELD)
@SequenceGenerator(name="ReportedIncidentSeq", sequenceName="REPORTED_INCIDENT_SEQ")
@Table(name = "ReportedIncident")
public class ReportedIncident {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="ReportedIncidentSeq")
    private long id;

    @Column(name = "incident_id")
    private String incidentId;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "number_of_people")
    private int numberOfPeople;

    @Column(name = "medical_needed")
    private boolean medicalNeeded;

    @Column(name = "victim_name")
    private String victimName;

    @Column(name = "victim_phone")
    private String victimPhoneNumber;

    @Column(name = "reported_timestamp")
    private long timestamp;

    @Column(name = "incident_status")
    private String status;

    public long getId() {
        return id;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public boolean isMedicalNeeded() {
        return medicalNeeded;
    }

    public String getVictimName() {
        return victimName;
    }

    public String getVictimPhoneNumber() {
        return victimPhoneNumber;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getStatus() {
        return status;
    }

    public static class Builder {

        private final ReportedIncident reportedIncident;

        public Builder() {
            reportedIncident = new ReportedIncident();
        }

        public Builder incidentId(String incidentId) {
            reportedIncident.incidentId = incidentId;
            return this;
        }

        public Builder latitude(String latitude) {
            reportedIncident.latitude = latitude;
            return this;
        }

        public Builder longitude(String longitude) {
            reportedIncident.longitude = longitude;
            return this;
        }

        public Builder numberOfPeople(int numberOfPeople) {
            reportedIncident.numberOfPeople = numberOfPeople;
            return this;
        }

        public Builder medicalNeeded(boolean medicalNeeded) {
            reportedIncident.medicalNeeded = medicalNeeded;
            return this;
        }

        public Builder victimName(String victimName) {
            reportedIncident.victimName = victimName;
            return this;
        }

        public Builder victimPhoneNumber(String victimPhoneNumber) {
            reportedIncident.victimPhoneNumber = victimPhoneNumber;
            return this;
        }

        public Builder timestamp(long timestamp) {
            reportedIncident.timestamp = timestamp;
            return this;
        }

        public Builder status(String status) {
            reportedIncident.status = status;
            return this;
        }

        public ReportedIncident build() {
            return reportedIncident;
        }

    }

}
