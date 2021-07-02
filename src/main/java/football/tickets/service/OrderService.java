package football.tickets.service;

import football.tickets.model.Order;
import football.tickets.model.ShoppingCart;
import football.tickets.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
