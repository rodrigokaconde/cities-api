package com.rfoliveira.citiesapi.repository;

import com.rfoliveira.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
