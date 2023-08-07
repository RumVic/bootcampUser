package by.itacademy.bootcamp.util.dto;

import by.itacademy.bootcamp.util.dto.api.IDto;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class InputDto implements IDto {

    @Size(max = 20 , message = "name length must be no more than 20 characters ")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "name can include only Latin letters")
    private   String name;

    @Size(max = 40 , message = "name length must be no more than 40 characters ")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "surname can include only Latin letters")
    private String surname;

    @Size(max = 40 , message = "name length must be no more than 40 characters ")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "patronymic can include only Latin letters")
    private String patronymic;

    @Size(max = 50 , message = "email length must be no more than 50 characters ")
    @Pattern(regexp = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$", message = "Email invalid")
    private String email;

    private String role;
}