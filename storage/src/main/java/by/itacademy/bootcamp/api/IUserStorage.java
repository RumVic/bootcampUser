package by.itacademy.bootcamp.api;

import by.itacademy.bootcamp.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IUserStorage extends JpaRepository<User, UUID> {

    Page<User> findAll(Pageable pageable);

}
