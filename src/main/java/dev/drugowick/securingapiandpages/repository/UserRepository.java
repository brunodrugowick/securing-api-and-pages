package dev.drugowick.securingapiandpages.repository;

import dev.drugowick.securingapiandpages.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
