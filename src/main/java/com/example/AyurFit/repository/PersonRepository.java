package com.example.AyurFit.repository;

import com.example.AyurFit.Model.Registration_form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Registration_form, Long> {
}
