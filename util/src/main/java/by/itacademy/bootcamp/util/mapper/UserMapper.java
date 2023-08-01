package by.itacademy.bootcamp.util.mapper;

import by.itacademy.bootcamp.entity.User;
import by.itacademy.bootcamp.util.mapper.api.IMap;
import by.itacademy.bootcamp.util.page.OutUserDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;



@Component
@Log4j2
public class UserMapper implements IMap<User, OutUserDto> {

    public Page<OutUserDto> mapPage(Page<User> productOutPage) {
        return productOutPage.map(this::map);
    }

    public OutUserDto map(User user) {

        OutUserDto dto = new OutUserDto();
        dto.setName(user.getName());
        dto.setSurname(user.getSurname());
        dto.setPatronymic(user.getPatronymic());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole());
        return dto;
    }
}
