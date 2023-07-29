package by.itacademy.bootcamp.services;

import by.itacademy.bootcamp.api.IUserStorage;
import by.itacademy.bootcamp.entity.User;
import by.itacademy.bootcamp.services.api.IUserService;
import by.itacademy.bootcamp.util.buider.UserBuilder;
import by.itacademy.bootcamp.util.dto.InputDto;
import by.itacademy.bootcamp.util.mapper.api.IMapUser;
import by.itacademy.bootcamp.util.page.OutUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService implements IUserService {
    @Autowired
    public UserService(IUserStorage userStorage, IMapUser iMap) {
        this.userStorage = userStorage;
        this.iMap = iMap;
    }

    private final IUserStorage userStorage;
    private final IMapUser iMap;

    @Override
    public User create(InputDto iDto) {
       return userStorage.save(UserBuilder
                .create()
                .setId(UUID.randomUUID().toString())
                .setName(iDto.getName())
                .setSurname(iDto.getSurname())
                .setPatronymic(iDto.getPatronymic())
                .setEmail(iDto.getEmail())
                .setRole(iDto.getRole())
                .build());
    }

    @Override
    public Page<OutUserDto> read(Pageable pag) {
        Page<User> pageOfProduct = userStorage.findAll(pag);
        return iMap.mapPage(pageOfProduct);
    }
}

