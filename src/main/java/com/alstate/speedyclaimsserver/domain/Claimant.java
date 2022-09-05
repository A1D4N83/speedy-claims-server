package com.alstate.speedyclaimsserver.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="claimant")
public class Claimant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer claim_id;

    @Column(name="policy_number")
    String polNum;

    String title;
    String firstname;
    String surname;
    String status;

    @Column(name="claim_type")
    String claimType;

    @Column(name="claim_amount")
    Double claimAmount;

    @Column(name="claim_date")
    LocalDate claimDate;

    @Column(name="claim_reason")
    String claimReason;

    String make;
    String model;
    String year;
    String address;
    @Column(name="animal_type")
    String animalType;
    String breed;

    @Column(name="incident_date")
    String incidentDate;
    @Column(name="further_details")
    String furtherDetails;


    public Claimant() {
    }

    public Claimant(Integer claim_id, String polNum, String title, String firstname, String surname, String status, String claimType, Double claimAmount, LocalDate claimDate, String claimReason, String make, String model, String year, String address, String animalType, String breed, String incidentDate, String furtherDetails) {
        this.claim_id = claim_id;
        this.polNum = polNum;
        this.title = title;
        this.firstname = firstname;
        this.surname = surname;
        this.status = status;
        this.claimType = claimType;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.claimReason = claimReason;
        this.make = make;
        this.model = model;
        this.year = year;
        this.address = address;
        this.animalType = animalType;
        this.breed = breed;
        this.incidentDate = incidentDate;
        this.furtherDetails = furtherDetails;
    }

    public Integer getClaim_id() {
        return claim_id;
    }

    public void setClaim_id(Integer claim_id) {
        this.claim_id = claim_id;
    }

    public String getPolNum() {
        return polNum;
    }

    public void setPolNum(String polNum) {
        this.polNum = polNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public Double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDate claimDate) {
        this.claimDate = claimDate;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getIncidentDate() {
        return incidentDate;
    }

    public void setIncidentDate(String incidentDate) {
        this.incidentDate = incidentDate;
    }

    public String getFurtherDetails() {
        return furtherDetails;
    }

    public void setFurtherDetails(String furtherDetails) {
        this.furtherDetails = furtherDetails;
    }
}
