package com.rfoliveira.citiesapi.staties.repository;

import com.rfoliveira.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
