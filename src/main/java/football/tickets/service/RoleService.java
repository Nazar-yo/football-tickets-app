package football.tickets.service;

import football.tickets.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getRoleByName(String roleName);
}
