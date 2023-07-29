package by.itacademy.bootcamp.services.api;


import by.itacademy.bootcamp.entity.User;
import by.itacademy.bootcamp.util.dto.InputDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService extends IService<User, InputDto, Pageable, Page> {
}
