package football.tickets.dao.impl;

import football.tickets.dao.AbstractDao;
import football.tickets.dao.TicketDao;
import football.tickets.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
