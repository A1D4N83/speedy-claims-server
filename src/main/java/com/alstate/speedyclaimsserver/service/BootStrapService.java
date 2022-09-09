package com.alstate.speedyclaimsserver.service;

import com.alstate.speedyclaimsserver.data.ClaimantRepository;
import com.alstate.speedyclaimsserver.domain.Claimant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
public class BootStrapService {

    @Autowired
    ClaimantRepository claimantRepository;

    @Autowired
    ClaimantService claimantService;

    @PostConstruct
    public void createInitialClaims() {
        if (claimantRepository.findAll().size() == 0) {
            Claimant claim1 = new Claimant(1,"3281", "Mr", "Simon", "Smith","new", "motor", 400.00, LocalDate.now(), "backed into lamp post", "Nissan", "Juke", "2018", "", "", "", "2022-05-18", "claimed that the lamp post wasn't there the last time they looked", 0.0);
            Claimant claim2 = new Claimant(2,"4406", "Mrs", "Jane", "Jones","paid", "pet", 240.00, LocalDate.now(), "cut on front left paw", "", "", "", "", "dog", "Border collie",  "2022-05-18", "",0.0);
            Claimant claim3 = new Claimant(3,"9191", "Dr","Geraldine", "Green","rejected", "motor", 380.00, LocalDate.now(), "skidded on ice", "Citroen", "Berlingo", "2021", "", "", "", "2022-05-18", "Had been snowing all morning",0.0);
            Claimant claim4 = new Claimant(4,"1200", "Prof.", "Clive",  "Cole","open", "property",  200.00, LocalDate.now(), "damage from flood", "", "", "", "15 Acacia Avenue, Sometown","", "", "2022-05-18", "",0.0);
            Claimant claim5 = new Claimant(5,"1655", "Miss", "Wanda", "Web", "rejected", "property", 300.00, LocalDate.now(), "window broken by neighbour's child playing football", "", "", "", "27 Summer View, Differentown", "", "", "2022-05-18", "",0.0);

            claimantRepository.save(claim1);
            claimantRepository.save(claim2);
            claimantRepository.save(claim3);
            claimantRepository.save(claim4);
            claimantRepository.save(claim5);

        }
    }
}
