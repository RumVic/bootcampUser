package by.itacademy.bootcamp.util.validation;

import by.itacademy.bootcamp.util.dto.InputDto;


public class UserValidator {
    public static void isValidUserDTO(InputDto inputDto) {

        if (!UserStringValidator.isValidName(inputDto.getName())) {
            throw new IllegalArgumentException("Name is invalid");
        }
        if (!UserStringValidator.isValidSurname(inputDto.getSurname())) {
            throw new IllegalArgumentException("Surname is invalid");
        }
        if (!UserStringValidator.isValidSurname(inputDto.getPatronymic())) {
            throw new IllegalArgumentException("Patronymic is invalid");
        }
        if (!UserStringValidator.isValidEmail(inputDto.getEmail())) {
            throw new IllegalArgumentException("Email is invalid");
        }
    }
}
