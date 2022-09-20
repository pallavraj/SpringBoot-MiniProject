package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    //fake user list
    List<User> list = List.of(
      new User(123L,"pallav","12234455"),
      new User(12444L,"raj","46884455"),
      new User(9000L,"vicky","9074422")
    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user-> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
