package by.itacademy.bootcamp.util.dto;

import by.itacademy.bootcamp.util.dto.api.IDto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import lombok.extern.log4j.Log4j2;



@Builder
@Data
@Jacksonized
@Log4j2
public class InputDto implements IDto {

    @Valid
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid alphabet")
    private String name;

    @Valid
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid alphabet")
    private String surname;

    @Valid
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid alphabet")
    private String patronymic;

    @Valid
    @Pattern(regexp = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$", message = "Email invalid")
    private String email;

    private String role;

}
