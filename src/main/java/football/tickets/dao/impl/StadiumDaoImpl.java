package football.tickets.dao.impl;

import football.tickets.dao.AbstractDao;
import football.tickets.dao.StadiumDao;
import football.tickets.model.Stadium;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class StadiumDaoImpl extends AbstractDao<Stadium> implements StadiumDao {
    public StadiumDaoImpl(SessionFactory factory) {
        super(factory, Stadium.class);
    }
}
