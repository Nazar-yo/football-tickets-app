package football.tickets.service;

import football.tickets.model.GameSession;
import football.tickets.model.ShoppingCart;
import football.tickets.model.User;

public interface ShoppingCartService {
    void addSession(GameSession gameSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
