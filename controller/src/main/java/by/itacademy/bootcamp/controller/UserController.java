package by.itacademy.bootcamp.controller;

import by.itacademy.bootcamp.services.api.IService;
import by.itacademy.bootcamp.util.dto.InputDto;
import by.itacademy.bootcamp.util.page.OutPage;
import by.itacademy.bootcamp.util.page.OutUserDto;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@AllArgsConstructor
public class UserController {

    private final String CREATED = "User was created successfully";
    private final IService service;

    @PostMapping
    protected ResponseEntity<String> addUser(@RequestBody InputDto inputDto) {
        service.create(inputDto);
        return new ResponseEntity<>(CREATED, HttpStatus.CREATED);
    }

    @GetMapping
    protected ResponseEntity<OutPage> getUsers(@RequestParam int page,
                                               @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        OutPage<OutUserDto> user = service.read(pageable);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
