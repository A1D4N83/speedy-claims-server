package com.alstate.speedyclaimsserver.data;

import com.alstate.speedyclaimsserver.domain.Claimant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimantRepository extends JpaRepository<Claimant, Integer> {
    public List<Claimant> findAllByStatus(String status);
}
