package com.alstate.speedyclaimsserver.service;

import com.alstate.speedyclaimsserver.domain.Claimant;

import java.util.List;

public interface ClaimantService {

    public List<Claimant> getAll();
    public Claimant add(Claimant newClaim);
}
