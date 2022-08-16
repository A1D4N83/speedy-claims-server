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
    String PolNum;

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

    public Claimant() {
    }

    public Claimant(Integer claim_id, String polNum, String title, String firstname, String surname, String status, String claimType, Double claimAmount, LocalDate claimDate, String claimReason) {
        this.claim_id = claim_id;
        PolNum = polNum;
        this.title = title;
        this.firstname = firstname;
        this.surname = surname;
        this.status = status;
        this.claimType = claimType;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.claimReason = claimReason;
    }

    public Integer getClaim_id() {
        return claim_id;
    }

    public void setClaim_id(Integer claim_id) {
        this.claim_id = claim_id;
    }

    public String getPolNum() {
        return PolNum;
    }

    public void setPolNum(String polNum) {
        PolNum = polNum;
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
}
