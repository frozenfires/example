package com.tencet.dao;

import com.tencet.entity.User;

/**
 * @program: shopping
 * @description: ${description}
 * @author: wangluliang
 * @create: 2018-06-04 11:52
 **/
public interface IUserDao {

    User selectUser(long id);
}
