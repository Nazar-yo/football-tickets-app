package football.tickets.service.impl;

import football.tickets.dao.GameDao;
import football.tickets.exception.DataProcessingException;
import football.tickets.model.Game;
import football.tickets.service.GameService;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {
    private final GameDao gameDao;

    public GameServiceImpl(GameDao gameDao) {
        this.gameDao = gameDao;
    }

    @Override
    public Game add(Game game) {
        return gameDao.add(game);
    }

    @Override
    public Game get(Long id) {
        return gameDao.get(id).orElseThrow(
                () -> new DataProcessingException("Can't get game by id " + id));
    }

    @Override
    public List<Game> getAll() {
        return gameDao.getAll();
    }
}
