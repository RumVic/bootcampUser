package by.itacademy.bootcamp.api;

import by.itacademy.bootcamp.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserStorage extends JpaRepository<User, String> {

    Page<User> findAll(Pageable pageable);

}
