package com.alstate.speedyclaimsserver.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

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

    @Column(name="amount_to_be_paid")
    Double amountToBePaid;


    public Claimant() {
    }

    public Claimant(Integer claim_id, String polNum, String title, String firstname, String surname, String status, String claimType, Double claimAmount, LocalDate claimDate, String claimReason, String make, String model, String year, String address, String animalType, String breed, String incidentDate, String furtherDetails, Double amountToBePaid) {
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
        this.amountToBePaid = amountToBePaid;
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

    public Double getAmountToBePaid() {
        return amountToBePaid;
    }

    public void setAmountToBePaid(Double amountToBePaid) {
        this.amountToBePaid = amountToBePaid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claimant claimant = (Claimant) o;
        return Objects.equals(claim_id, claimant.claim_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claim_id);
    }
}
