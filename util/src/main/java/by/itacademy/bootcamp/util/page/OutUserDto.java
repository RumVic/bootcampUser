package by.itacademy.bootcamp.util.page;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Log4j2
public class OutUserDto {
    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private String role;

}
