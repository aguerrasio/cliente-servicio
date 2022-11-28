package guru.springFramework.spring5webbapp.repositories;

import guru.springFramework.spring5webbapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
