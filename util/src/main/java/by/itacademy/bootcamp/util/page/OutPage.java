package by.itacademy.bootcamp.util.page;

import by.itacademy.bootcamp.util.page.api.IOut;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Log4j2
public class OutPage<ENTITY> implements IOut {

    private int number;
    private int size;
    private int totalPages;
    private int totalElements;
    private boolean first;
    private int numberOfElements;
    private boolean last;
    private List<ENTITY> content;
}