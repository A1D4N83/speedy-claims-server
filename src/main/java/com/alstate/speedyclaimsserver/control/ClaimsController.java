package com.alstate.speedyclaimsserver.control;

import com.alstate.speedyclaimsserver.domain.Claimant;
import com.alstate.speedyclaimsserver.service.ClaimantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api/claims")

public class ClaimsController {

    @Autowired
    private ClaimantService claimantService;

    @GetMapping
    public List<Claimant> getAll(@RequestParam(value="status", required=false) String status) {
        if (status != null){
            return claimantService.getAllByStatus(status);
        }
        return claimantService.getAll();
    }

    @PostMapping
    public Claimant addNewClaim(@RequestBody Claimant newClaim) {
        return claimantService.add(newClaim);
    }

    @GetMapping(value ="/{claim_id}", produces={MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Claimant getByClaimId(@PathVariable("claim_id") Integer id) {
        return claimantService.getClaimByClaimId(id);
    }

    @PutMapping("/{claim_id}")
    public Claimant updateClaim(@PathVariable("claim_id") Integer id,
                                @RequestBody Map<String, String> data){
        return claimantService.updateClaim(id, data);
    }

}
