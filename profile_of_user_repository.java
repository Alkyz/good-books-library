package software1.softwareengineering1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import software1.softwareengineering1.entity.profile_of_user;

import java.util.List;

@Repository
public interface profile_of_user_repository extends JpaRepository<profile_of_user, String> {
}
