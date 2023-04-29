package me.safronov.vyacheslav.mockito.service;

import me.safronov.vyacheslav.mockito.dao.UserDao;
import me.safronov.vyacheslav.mockito.model.User;


public class UserServiceImpl {
    //В классе
    //UserService
    // нужно реализовать один метод
    //checkUserExist
    //, который принимает юзера и, обращаясь к дао, будет искать юзера в списке и возвращать
    // true или false, в зависимости от результата.
    //Теперь нам нужно создать два класса для тестирования.

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {

        this.userDao = userDao;
    }

    public boolean checkUserExist(User user) {
        return userDao.getUserByName(user.getName()) != null;
    }
}
