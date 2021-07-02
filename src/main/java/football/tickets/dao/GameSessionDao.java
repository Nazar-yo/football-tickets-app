package football.tickets.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import football.tickets.model.GameSession;

public interface GameSessionDao {
    GameSession add(GameSession gameSession);

    Optional<GameSession> get(Long id);

    List<GameSession> findAvailableSessions(Long movieId, LocalDate date);

    GameSession update(GameSession gameSession);

    void delete(Long id);
}
