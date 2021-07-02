package football.tickets.service;

import football.tickets.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
