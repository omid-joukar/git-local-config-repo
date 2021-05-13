package omid.springframework.msscbrewery.services;

import omid.springframework.msscbrewery.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
