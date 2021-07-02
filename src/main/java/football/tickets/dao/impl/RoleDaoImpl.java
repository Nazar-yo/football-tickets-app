package football.tickets.dao.impl;

import java.util.Optional;
import football.tickets.dao.AbstractDao;
import football.tickets.dao.RoleDao;
import football.tickets.exception.DataProcessingException;
import football.tickets.model.Role;
import football.tickets.model.RoleName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(String roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> findRoleByName = session.createQuery(
                    "FROM Role WHERE roleName = :roleName ", Role.class);
            findRoleByName.setParameter("roleName", RoleName.valueOf(roleName.toUpperCase()));
            return findRoleByName.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Can`t get role by name " + roleName, e);
        }
    }
}
