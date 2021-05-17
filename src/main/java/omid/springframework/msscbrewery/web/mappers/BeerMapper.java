package omid.springframework.msscbrewery.web.mappers;

import omid.springframework.msscbrewery.domain.Beer;
import omid.springframework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerdto);
}
