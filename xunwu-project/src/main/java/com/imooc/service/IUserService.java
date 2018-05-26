package com.imooc.service;

import com.imooc.entity.User;

/**
 * 用户服务
 * Created by 瓦力.
 */
public interface IUserService {
    User findUserByName(String userName);


}
