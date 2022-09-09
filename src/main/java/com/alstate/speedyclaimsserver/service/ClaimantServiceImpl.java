package com.alstate.speedyclaimsserver.service;

import com.alstate.speedyclaimsserver.data.ClaimantRepository;
import com.alstate.speedyclaimsserver.domain.Claimant;
import com.alstate.speedyclaimsserver.exceptions.ClaimNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ClaimantServiceImpl implements ClaimantService {

    @Autowired
    private ClaimantRepository claimantRepository;

    Logger logger = LoggerFactory.getLogger(ClaimantService.class);

    @Override
    public int countClaims() {
        return claimantRepository.findAll().size();
    }


    @Override
    public List<Claimant> getAll() {
        return claimantRepository.findAll();
    }

    @Override
    public List<Claimant> getAllByStatus(String status) {
        return claimantRepository.findAllByStatus(status);
    }

    @Override
    public Claimant add(Claimant newClaim) {
        return claimantRepository.save(newClaim);
    }

    @Override
    public Claimant getClaimByClaimId(Integer id) {
        Optional<Claimant> optionalCCT = claimantRepository.findById(id);
        if (optionalCCT.isPresent()) {
            return optionalCCT.get();
        }
        logger.info("There is no transaction with an ID of " + id);
        throw new ClaimNotFound("There is no transaction with an ID of " + id);
    }

    @Override
    public Claimant updateClaim(Integer id, Map<String, String> data){
        Claimant claim = getClaimByClaimId(id);
        if(data.containsKey("polNum")) claim.setPolNum(data.get("polNum"));
        if(data.containsKey("title")) claim.setTitle(data.get("title"));
        if(data.containsKey("firstname")) claim.setFirstname(data.get("firstname"));
        if(data.containsKey("surname")) claim.setSurname(data.get("surname"));
        if(data.containsKey("status")) claim.setStatus(data.get("status"));
        if(data.containsKey("claimType")) claim.setClaimType(data.get("claimType"));
        if(data.containsKey("claimAmount")) claim.setClaimAmount(Double.parseDouble(data.get("claimAmount")));
        if(data.containsKey("claimDate")) claim.setClaimDate(LocalDate.parse(data.get("claimDate")));
        if(data.containsKey("claimReason")) claim.setPolNum(data.get("claimReason"));
        if(data.containsKey("make")) claim.setPolNum(data.get("make"));
        if(data.containsKey("model")) claim.setPolNum(data.get("model"));
        if(data.containsKey("year")) claim.setPolNum(data.get("year"));
        if(data.containsKey("address")) claim.setPolNum(data.get("address"));
        if(data.containsKey("animalType")) claim.setPolNum(data.get("animalType"));
        if(data.containsKey("breed")) claim.setPolNum(data.get("breed"));
        if(data.containsKey("incidentDate")) claim.setPolNum(data.get("incidentDate"));
        if(data.containsKey("furtherDetails")) claim.setPolNum(data.get("furtherDetails"));
        if(data.containsKey("amountToBePaid")) claim.setAmountToBePaid(Double.parseDouble(data.get("amountToBePaid")));

        return claimantRepository.save(claim);
    }
}
