package com.tencet.service.impl;

import com.tencet.dao.IUserDao;
import com.tencet.entity.User;
import com.tencet.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: shopping
 * @description: ${description}
 * @author: wangluliang
 * @create: 2018-06-04 13:42
 **/
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}