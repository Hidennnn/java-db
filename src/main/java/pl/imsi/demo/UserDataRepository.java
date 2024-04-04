package pl.imsi.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserDataRepository extends CrudRepository<UserData, Long> {
}
