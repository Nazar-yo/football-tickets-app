package football.tickets.service;

import java.util.List;
import football.tickets.model.Game;

public interface GameService {
    Game add(Game game);

    Game get(Long id);

    List<Game> getAll();
}
