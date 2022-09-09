package com.alstate.speedyclaimsserver.integrationtests;

import com.alstate.speedyclaimsserver.data.ClaimantRepository;
import com.alstate.speedyclaimsserver.domain.Claimant;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
@AutoConfigureMockMvc
public class ClaimsTesting {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    private ClaimantRepository claimantRepository;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void checkNewClaimsAreAddedToDatabse() throws Exception{
        Claimant newClaimant = new Claimant();
        newClaimant.setPolNum("123456");
        newClaimant.setTitle("Mr");
        newClaimant.setFirstname("Aidan");
        newClaimant.setSurname("McCormick");
        newClaimant.setClaimType("Motor");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(newClaimant);

        RequestBuilder request = MockMvcRequestBuilders
                .post("/api/claims")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(json);

        ResultActions result = mockMvc.perform(request)
                .andExpect(status().isOk());

        ArgumentCaptor<Claimant> capturedTransaction = ArgumentCaptor.forClass(Claimant.class);

        Mockito.verify(claimantRepository).save(capturedTransaction.capture());

        Claimant c1 = capturedTransaction.getValue();
        assertEquals ("Motor", c1.getClaimType());
    }
}
