package by.itacademy.bootcamp.util.mapper.api;

import org.springframework.data.domain.Page;

public interface IMap <A,T>{
    T map(A entity);

    Page<T> mapPage(Page<A> page);
}
