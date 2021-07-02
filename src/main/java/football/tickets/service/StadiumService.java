package football.tickets.service;

import java.util.List;
import football.tickets.model.Stadium;

public interface StadiumService {
    Stadium add(Stadium stadium);

    Stadium get(Long id);

    List<Stadium> getAll();
}
