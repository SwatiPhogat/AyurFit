package com.example.AyurFit.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

class HCAppControllerTest {
    @WebMvcTest(HCAppController.class)
    public class HealthcareControllerMockMvcTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        public void testGetEarlyDetection() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.get("/healthcare/earlyDetection"))
                    .andExpect(MockMvcResultMatchers.status().isOk());
        }

        @Test
        public void testSetEarlyDetection() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.post("/healthcare/earlyDetection")
                            .param("value", "New Early Detection Value"))
                    .andExpect(MockMvcResultMatchers.status().isOk());
        }

        // Repeat similar tests for other attributes (Prevention, Ayurveda, PersonalGuidance, HolisticCare, HealthPlans, Motivation, SelfLearning)
    }


}