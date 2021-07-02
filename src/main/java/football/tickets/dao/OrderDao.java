package football.tickets.dao;

import football.tickets.model.Order;
import football.tickets.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
