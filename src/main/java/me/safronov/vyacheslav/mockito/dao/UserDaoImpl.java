package me.safronov.vyacheslav.mockito.dao;

import lombok.Data;
import me.safronov.vyacheslav.mockito.model.User;

import java.util.*;

@Data
public class UserDaoImpl implements UserDao {
    //В классе
    //UserDaoImpl
    // создайте лист юзеров и в конструкторе наполните его несколькими объектами класса User.
    // Также в этом классе нужно реализовать 2 метода
    //getUserByName
    //, который будет принимать имя и возвращать юзера по этому имени или null в противном случае и метод
    //findAllUsers
    //, который будет возвращать список юзеров.
    List<User> users;

    public UserDaoImpl() {
        this.users = new ArrayList<>();
        users.add(new User("Slava", "Viktrovich", "Slava1993@mail.ru"));
        users.add(new User("Sasha", "Romanovich", "Sasha1990@mail.ru"));
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public User getUserByName(String name) {
        List<User> allUser = findAllUsers();
        for (User user : allUser) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}
