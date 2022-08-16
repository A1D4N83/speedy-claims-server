package com.alstate.speedyclaimsserver.control;

import com.alstate.speedyclaimsserver.domain.Claimant;
import com.alstate.speedyclaimsserver.service.ClaimantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
