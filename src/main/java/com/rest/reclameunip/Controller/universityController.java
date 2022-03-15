package com.rest.reclameunip.Controller;

import com.rest.reclameunip.Model.university;
import com.rest.reclameunip.Repository.universityRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class universityController {

    @Autowired
    universityRepository universityRepository;

    // Get all claims
    @GetMapping("/claims")
    public List<university> getAllClaims() {
        return universityRepository.findAll();
    }


    // Create a new Claim
    @PostMapping("/claims")
    public university createClaim(@Valid @RequestBody university university){
        return universityRepository.save(university);
    }

}

