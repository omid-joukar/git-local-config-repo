package omid.springframework.msscbrewery.mappers;

import omid.springframework.msscbrewery.domain.Beer;
import omid.springframework.msscbrewery.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerdto);
}
