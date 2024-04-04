package pl.imsi.demo;

import org.springframework.data.repository.CrudRepository;

public interface AuthorsRepository extends CrudRepository<Authors, Long> {
}
