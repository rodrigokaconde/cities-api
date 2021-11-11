package com.rfoliveira.citiesapi.countries.repository;

import com.rfoliveira.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
