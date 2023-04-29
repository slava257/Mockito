package me.safronov.vyacheslav.mockito.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//Создайте небольшое приложение, в котором будут созданы Класс User с обязательным полем name
// (другие поля по желанию), а также слои Dao и Service.
public class User {
    private String name;
    private String patronymic;
    private String email;

}
