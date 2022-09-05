package com.alstate.speedyclaimsserver.service;

import com.alstate.speedyclaimsserver.data.ClaimantRepository;
import com.alstate.speedyclaimsserver.domain.Claimant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimantServiceImpl implements ClaimantService {

    @Autowired
    private ClaimantRepository claimantRepository;

    @Override
    public List<Claimant> getAll() {
        return claimantRepository.findAll();
    }

    @Override
    public Claimant add(Claimant newClaim) {
        return claimantRepository.save(newClaim);
    }
}
