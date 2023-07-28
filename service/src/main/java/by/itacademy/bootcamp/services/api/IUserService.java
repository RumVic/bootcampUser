package by.itacademy.bootcamp.services.api;


import by.itacademy.bootcamp.entity.User;
import by.itacademy.bootcamp.util.dto.InputDto;
import by.itacademy.bootcamp.util.page.OutPage;
import org.springframework.data.domain.Pageable;

public interface IUserService extends IService<User, InputDto, Pageable, OutPage> {
}
