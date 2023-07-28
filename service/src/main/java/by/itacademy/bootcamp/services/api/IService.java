package by.itacademy.bootcamp.services.api;

import by.itacademy.bootcamp.util.page.OutPage;
import by.itacademy.bootcamp.util.page.OutUserDto;

public interface IService<TYPE, IDTO, PAG, OUTPAGE> {

    TYPE create(IDTO idto);

    OutPage<OutUserDto> read(PAG pag);

}
