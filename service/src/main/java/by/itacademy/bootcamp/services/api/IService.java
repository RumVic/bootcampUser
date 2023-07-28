package by.itacademy.bootcamp.services.api;

import by.itacademy.bootcamp.util.page.OutPage;
import by.itacademy.bootcamp.util.page.OutUserDto;
import org.springframework.data.domain.Page;

public interface IService<TYPE, IDTO, PAG, OUTPAGE> {

    TYPE create(IDTO idto);

    Page<OutUserDto> read(PAG pag);

}
