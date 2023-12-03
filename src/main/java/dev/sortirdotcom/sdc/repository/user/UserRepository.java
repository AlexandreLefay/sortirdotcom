package dev.sortirdotcom.sdc.repository.user;

import dev.sortirdotcom.sdc.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
