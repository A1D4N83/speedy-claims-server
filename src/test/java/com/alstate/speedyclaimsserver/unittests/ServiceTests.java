package com.alstate.speedyclaimsserver.unittests;

import com.alstate.speedyclaimsserver.data.ClaimantRepository;
import com.alstate.speedyclaimsserver.domain.Claimant;
import com.alstate.speedyclaimsserver.service.ClaimantService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})

public class ServiceTests {

    @Autowired
    ClaimantService claimantService;

    @MockBean
    ClaimantRepository claimantRepository;

    @Test
    public void testNumberOfTransactions() {
        List<Claimant> claims = new ArrayList<>();
        claims.add(new Claimant(1,"3281", "Mr", "Simon", "Smith","new", "motor", 400.00, LocalDate.now(), "backed into lamp post", "Nissan", "Juke", "2018", "", "", "", "2022-05-18", "claimed that the lamp post wasn't there the last time they looked",0.0));
        claims.add(new Claimant(2,"4406", "Mrs", "Jane", "Jones","paid", "pet", 240.00, LocalDate.now(), "cut on front left paw", "", "", "", "", "dog", "Border collie",  "2022-05-18", "",0.0));
        claims.add(new Claimant(3,"9191", "Dr","Geraldine", "Green","rejected", "motor", 380.00, LocalDate.now(), "skidded on ice", "Citroen", "Berlingo", "2021", "", "", "", "2022-05-18", "Had been snowing all morning",0.));

        Mockito.when(claimantRepository.findAll()).thenReturn(claims);

        int result = claimantService.countClaims();
        assertEquals(3, result);
    }
}
