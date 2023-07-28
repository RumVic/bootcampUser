package by.itacademy.bootcamp.util.mapper.api;

import by.itacademy.bootcamp.entity.User;
import by.itacademy.bootcamp.util.page.OutPage;
import by.itacademy.bootcamp.util.page.OutUserDto;
import org.springframework.data.domain.Page;

public interface IMapUser extends IMap<User, OutUserDto>{

}
