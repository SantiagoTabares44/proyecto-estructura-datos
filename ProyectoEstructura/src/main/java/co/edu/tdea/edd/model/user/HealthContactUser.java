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

    public HealthContactUser(User patient, String triageCategory) {
        this.patient = patient;
        this.contactDate = LocalDateTime.now();
        this.triageCategory = triageCategory;
    }
    private User patient;
    private LocalDateTime contactDate;
    private String triageCategory;
    private String reason;
    private String diagnosis;
    private String treatment;
}
