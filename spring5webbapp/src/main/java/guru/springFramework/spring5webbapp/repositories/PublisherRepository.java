package guru.springFramework.spring5webbapp.repositories;

import guru.springFramework.spring5webbapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
