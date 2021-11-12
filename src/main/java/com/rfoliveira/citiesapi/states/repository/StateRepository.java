package com.rfoliveira.citiesapi.states.repository;

import com.rfoliveira.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
