package football.tickets.dao;

import java.util.Optional;
import football.tickets.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(String roleName);
}
