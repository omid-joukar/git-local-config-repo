package omid.springframework.msscbrewery.services.v2;

import omid.springframework.msscbrewery.web.model.BeerDto;
import omid.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDtoV2 beerDto);
    void updateBeer(UUID beerId, BeerDtoV2 beerDto);
    void deleteBeerById(UUID beerId);
}
