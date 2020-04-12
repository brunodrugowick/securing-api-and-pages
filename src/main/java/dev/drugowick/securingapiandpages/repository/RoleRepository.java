package dev.drugowick.securingapiandpages.repository;

import dev.drugowick.securingapiandpages.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
