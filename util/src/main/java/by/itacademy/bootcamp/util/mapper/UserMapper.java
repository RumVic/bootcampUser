package by.itacademy.bootcamp.util.mapper;

import by.itacademy.bootcamp.entity.User;
import by.itacademy.bootcamp.util.mapper.api.IMapUser;
import by.itacademy.bootcamp.util.page.OutPage;
import by.itacademy.bootcamp.util.page.OutUserDto;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

public class UserMapper implements IMapUser {

    public OutPage<OutUserDto> map(Page<User> productOutPage) {

        OutPage<OutUserDto> outPage = new OutPage<>();

        outPage.setNumber(productOutPage.getNumber());
        outPage.setSize(productOutPage.getSize());
        outPage.setTotalPages(productOutPage.getTotalPages());
        outPage.setTotalElements((int) productOutPage.getTotalElements());
        outPage.setFirst(productOutPage.isFirst());
        outPage.setNumberOfElements(productOutPage.getNumberOfElements());
        outPage.setLast(productOutPage.isLast());

        List<OutUserDto> list = new ArrayList<>();

        for (User product : productOutPage.getContent()) {
            OutUserDto userDto = fromEntityToOutput(product);
            list.add(userDto);
        }

        outPage.setContent(list);
        return outPage;
    }

    public OutUserDto fromEntityToOutput(User user) {

        OutUserDto dto = new OutUserDto();
        dto.setName(user.getName());
        dto.setSurname(user.getSurname());
        dto.setPatronymic(user.getPatronymic());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole());
        return dto;
    }
}
