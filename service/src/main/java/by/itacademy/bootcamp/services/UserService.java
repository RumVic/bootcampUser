package by.itacademy.bootcamp.services;

import by.itacademy.bootcamp.api.IUserStorage;
import by.itacademy.bootcamp.entity.User;
import by.itacademy.bootcamp.services.api.IUserService;
import by.itacademy.bootcamp.util.buider.UserBuilder;
import by.itacademy.bootcamp.util.dto.InputDto;
import by.itacademy.bootcamp.util.mapper.api.IMapUser;
import by.itacademy.bootcamp.util.page.OutPage;
import by.itacademy.bootcamp.util.page.OutUserDto;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    private final IUserStorage userStorage;
    private final IMapUser iMap;

    @Override
    public User create(InputDto iDto) {
        userStorage.save(UserBuilder
                .create()
                .setId(UUID.randomUUID())
                .setName(iDto.getName())
                .setSurname(iDto.getSurname())
                .setPatronymic(iDto.getPatronymic())
                .setEmail(iDto.getEmail())
                .setRole(iDto.getRole())
                .build());
        return null;
    }

    @Override
    public OutPage<OutUserDto> read(Pageable pag) {
        Page<User> pageOfProduct = userStorage.findAll(pag);
        return iMap.map(pageOfProduct);
    }
}

