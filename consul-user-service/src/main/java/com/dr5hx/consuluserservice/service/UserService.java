package com.dr5hx.consuluserservice.service;



import com.dr5hx.consuluserservice.domain.User;

import java.util.List;

/**
 * Created by macro on 2019/8/29.
 */
public interface UserService {
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
