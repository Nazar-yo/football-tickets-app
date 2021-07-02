package football.tickets.dao.impl;

import football.tickets.dao.AbstractDao;
import football.tickets.dao.GameDao;
import football.tickets.model.Game;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class GameDaoImpl extends AbstractDao<Game> implements GameDao {
    public GameDaoImpl(SessionFactory factory) {
        super(factory, Game.class);
    }
}
