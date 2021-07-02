package football.tickets.service;

import football.tickets.model.Game;
import java.util.List;

public interface GameService {
    Game add(Game game);

    Game get(Long id);

    List<Game> getAll();
}
