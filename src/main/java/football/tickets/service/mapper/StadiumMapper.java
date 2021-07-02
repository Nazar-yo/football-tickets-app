package football.tickets.service.mapper;

import football.tickets.dto.request.StadiumRequestDto;
import football.tickets.dto.response.StadiumResponseDto;
import football.tickets.model.Stadium;
import org.springframework.stereotype.Component;

@Component
public class StadiumMapper implements RequestDtoMapper<StadiumRequestDto, Stadium>,
        ResponseDtoMapper<StadiumResponseDto, Stadium> {
    @Override
    public Stadium mapToModel(StadiumRequestDto dto) {
        Stadium stadium = new Stadium();
        stadium.setDescription(dto.getDescription());
        stadium.setCapacity(dto.getCapacity());
        return stadium;
    }

    @Override
    public StadiumResponseDto mapToDto(Stadium stadium) {
        StadiumResponseDto responseDto = new StadiumResponseDto();
        responseDto.setId(stadium.getId());
        responseDto.setDescription(stadium.getDescription());
        return responseDto;
    }
}
