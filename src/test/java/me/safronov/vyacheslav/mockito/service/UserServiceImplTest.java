package me.safronov.vyacheslav.mockito.service;

import me.safronov.vyacheslav.mockito.dao.UserDaoImpl;
import me.safronov.vyacheslav.mockito.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

//Вторым классом для тестирования будет класс
//UserServiceTest
//, в котором нам необходимо протестировать метод
//checkUserExist
// из класса
//UserService
//. Протестировать его нужно дважды: На возврат true и false при передачи ему разных значений.
// Значения устанавливаем с помощью функционала Mockito. То есть наша задача "замокать" обращение класса
//UserService
// к классу
//UserDaoImpl
//.
@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @Mock
    private UserDaoImpl userDao;
    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void shouldCheckUserExistTrue() {
        when(userDao.getUserByName("Slava")).thenReturn(new User("Slava", "Viktrovich", "Slava1993@mail.ru"));
        boolean userExist = userService.checkUserExist(new User("Slava", "Viktrovich", "Slava1993@mail.ru"));
        verify(userDao, times(1)).getUserByName("Slava");
        Assertions.assertTrue(userExist);
    }

    @Test
    public void shouldCheckUserExistFalse() {
        when(userDao.getUserByName("Slava")).thenReturn(null);
        boolean userExistFalse = userService.checkUserExist(new User("Slava", "Viktrovich", "Slava1993@mail.ru"));
        Assertions.assertFalse(userExistFalse);
    }
}
