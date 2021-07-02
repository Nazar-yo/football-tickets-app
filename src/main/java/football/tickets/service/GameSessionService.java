package football.tickets.service;

import football.tickets.model.GameSession;
import java.time.LocalDate;
import java.util.List;

public interface GameSessionService {
    List<GameSession> findAvailableSessions(Long movieId, LocalDate date);

    GameSession add(GameSession session);

    GameSession get(Long id);

    GameSession update(GameSession gameSession);

    void delete(Long id);
}
