package me.safronov.vyacheslav.mockito.dao;


import me.safronov.vyacheslav.mockito.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserDaoImplTest {
    //Первый класс
    //UserDaoTest
    // будет без применения Mockito. В этом классе тестируем метод
    //getUserByName
    // из класса
    //UserDaoImpl
    //. Сначала нужно задать нового юзера с существующем именем из нашего списка и убедиться,
    // что метод вернет созданного нами юзера. Вторым тестовым методом будет обратная проверка на то,
    // что метод вернет null, если мы зададим пользователя с именем, не существующем в списке.

    private static final User user1 = new User("Slava", "Viktrovich", "Slava1993@mail.ru");

    @Test
    public void shouldGetUserByName() {
        UserDaoImpl userDao = new UserDaoImpl();
        Assertions.assertEquals(user1, userDao.getUserByName("Slava"));
    }

    @Test
    public void shouldGetUserByNameNull() {
        UserDaoImpl userDao = new UserDaoImpl();
        Assertions.assertNull(userDao.getUserByName("Roma"));
    }
}
