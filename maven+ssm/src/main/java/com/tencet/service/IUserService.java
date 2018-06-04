package com.tencet.service;

import com.tencet.entity.User;

/**
 * @program: shopping
 * @description: ${description}
 * @author: wangluliang
 * @create: 2018-06-04 11:55
 **/
public interface IUserService {
    public User selectUser(long userId);
}
