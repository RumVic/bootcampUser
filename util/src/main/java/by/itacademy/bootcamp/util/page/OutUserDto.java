package by.itacademy.bootcamp.util.page;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OutUserDto {
    private UUID id;
    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private String role;

}
