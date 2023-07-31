package by.itacademy.bootcamp.api;

import by.itacademy.bootcamp.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserStorage extends JpaRepository<User, String> {

    @Query(value = "SELECT * FROM user ORDER BY email ASC", nativeQuery = true)
    Page<User> findAll(Pageable pageable);

}
