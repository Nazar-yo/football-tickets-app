package football.tickets.service;

import java.util.List;
import football.tickets.model.Order;
import football.tickets.model.ShoppingCart;
import football.tickets.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
