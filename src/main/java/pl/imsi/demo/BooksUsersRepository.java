package pl.imsi.demo;

import org.springframework.data.repository.CrudRepository;

public interface BooksUsersRepository extends CrudRepository<BooksUsers, Long> {
}
