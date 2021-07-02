package football.tickets.service;

import football.tickets.model.Stadium;
import java.util.List;

public interface StadiumService {
    Stadium add(Stadium stadium);

    Stadium get(Long id);

    List<Stadium> getAll();
}
