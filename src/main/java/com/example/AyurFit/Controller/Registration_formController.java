package com.example.AyurFit.Controller;

import com.example.AyurFit.Model.Registration_form;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/registration")
public class Registration_formController {

    private List<Registration_form> registrationList = new ArrayList<>();

    @GetMapping("/registrationList")
    public List<Registration_form> getAllMembers() {
        return registrationList;
    }

    @PostMapping("/createMember")
    public ResponseEntity<String> createMember(@RequestBody Registration_form newMember) {
        // You can add validation logic here to ensure the data is valid before adding to the list.
        // For simplicity, we're assuming the data is valid.

        registrationList.add(newMember);

        return ResponseEntity.ok("Member created successfully.");
    }
}
