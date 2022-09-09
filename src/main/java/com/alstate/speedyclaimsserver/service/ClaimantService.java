package com.alstate.speedyclaimsserver.service;

import com.alstate.speedyclaimsserver.domain.Claimant;

import java.util.List;
import java.util.Map;

public interface ClaimantService {

    public List<Claimant> getAll();
    public int countClaims();
    public List<Claimant> getAllByStatus(String status);
    public Claimant add(Claimant newClaim);
    public Claimant getClaimByClaimId(Integer id);
    public Claimant updateClaim(Integer id, Map<String, String> data);
}
