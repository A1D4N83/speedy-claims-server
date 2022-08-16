package com.alstate.speedyclaimsserver.data;

import com.alstate.speedyclaimsserver.domain.Claimant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimantRepository extends JpaRepository<Claimant, Integer> {
}
