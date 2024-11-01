/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.tdea.edd.model.user;

import java.time.LocalDateTime;

/**
 *
 * @author Britney Niño
 */
public class HealthContactUser {

    private User patient;
    private LocalDateTime contactDate;
    private String triageCategory;
    private String reason;
    private String diagnosis;
    private String treatment;

    public HealthContactUser(User patient, String triageCategory) {
        this.patient = patient;
        this.contactDate = LocalDateTime.now();
        this.triageCategory = triageCategory;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }

    public LocalDateTime getContactDate() {
        return contactDate;
    }

    public void setContactDate(LocalDateTime contactDate) {
        this.contactDate = contactDate;
    }

    public String getTriageCategory() {
        return triageCategory;
    }

    public void setTriageCategory(String triageCategory) {
        this.triageCategory = triageCategory;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
