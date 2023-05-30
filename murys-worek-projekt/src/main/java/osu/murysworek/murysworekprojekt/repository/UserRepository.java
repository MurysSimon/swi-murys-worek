package osu.murysworek.murysworekprojekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import osu.murysworek.murysworekprojekt.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
