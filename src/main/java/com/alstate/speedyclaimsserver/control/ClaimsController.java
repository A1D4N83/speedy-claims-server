package com.alstate.speedyclaimsserver.control;

import com.alstate.speedyclaimsserver.domain.Claimant;
import com.alstate.speedyclaimsserver.service.ClaimantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/claims")

public class ClaimsController {

    @Autowired
    private ClaimantService claimantService;

    @GetMapping
    public List<Claimant> getAll(){
        return claimantService.getAll();
    }

    @PostMapping
    public Claimant addNewClaim(@RequestBody Claimant newClaim) {
        return claimantService.add(newClaim);
    }
}
