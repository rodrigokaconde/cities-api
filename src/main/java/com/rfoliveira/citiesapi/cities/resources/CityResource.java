package com.rfoliveira.citiesapi.cities.resources;

import com.rfoliveira.citiesapi.cities.entities.City;
import com.rfoliveira.citiesapi.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {
    @Autowired
    private CityRepository repository;

    @GetMapping
    public Page<City> cities(Pageable pag){
        return repository.findAll(pag);
    }
}
