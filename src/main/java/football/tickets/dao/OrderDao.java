package football.tickets.dao;

import java.util.List;
import football.tickets.model.Order;
import football.tickets.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
