package football.tickets.service.mapper;

import football.tickets.dto.request.GameSessionRequestDto;
import football.tickets.dto.response.GameSessionResponseDto;
import football.tickets.model.GameSession;
import football.tickets.service.GameService;
import football.tickets.service.StadiumService;
import football.tickets.util.DateTimePatternUtil;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

@Component
public class GameSessionMapper implements RequestDtoMapper<GameSessionRequestDto, GameSession>,
        ResponseDtoMapper<GameSessionResponseDto, GameSession> {
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(DateTimePatternUtil.DATE_TIME_PATTERN);
    private final StadiumService stadiumService;
    private final GameService gameService;

    public GameSessionMapper(StadiumService stadiumService, GameService gameService) {
        this.stadiumService = stadiumService;
        this.gameService = gameService;
    }

    @Override
    public GameSession mapToModel(GameSessionRequestDto dto) {
        GameSession gameSession = new GameSession();
        gameSession.setMovie(gameService.get(dto.getGameId()));
        gameSession.setCinemaHall(stadiumService.get(dto.getStadiumId()));
        gameSession.setShowTime(LocalDateTime.parse(dto.getShowTime(), formatter));
        return gameSession;
    }

    @Override
    public GameSessionResponseDto mapToDto(GameSession gameSession) {
        GameSessionResponseDto responseDto = new GameSessionResponseDto();
        responseDto.setGameSessionId(gameSession.getId());
        responseDto.setStadiumId(gameSession.getCinemaHall().getId());
        responseDto.setGameId(gameSession.getMovie().getId());
        responseDto.setGameTitle(gameSession.getMovie().getTitle());
        responseDto.setShowTime(gameSession.getShowTime().format(formatter));
        return responseDto;
    }
}
