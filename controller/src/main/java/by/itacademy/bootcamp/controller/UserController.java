package by.itacademy.bootcamp.controller;

import by.itacademy.bootcamp.services.api.IService;
import by.itacademy.bootcamp.util.dto.InputDto;
import by.itacademy.bootcamp.util.page.OutUserDto;
import by.itacademy.bootcamp.util.validation.UserValidator;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1/user")
@AllArgsConstructor
@Log4j2
@Validated
public class UserController {

    private final String CREATED = "User was created successfully";
    private final IService service;

    @PostMapping
    public ResponseEntity<String> addUser(@Valid @RequestBody InputDto inputDto) {
        UserValidator.isValidUserDTO(inputDto);
        service.create(inputDto);
        return new ResponseEntity<>(CREATED, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Page> getUsers(@RequestParam int page,
                                         @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<OutUserDto> user = service.read(pageable);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
