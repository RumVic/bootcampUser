package by.itacademy.bootcamp.util.dto;

import by.itacademy.bootcamp.util.dto.api.IDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InputDto implements IDto {

    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private String role;
}
