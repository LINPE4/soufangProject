package com.imooc.service.user;

import com.imooc.entity.User;
import com.imooc.service.ServiceResult;
import com.imooc.web.dto.UserDTO;

/**
 * 用户服务
 * Created by 瓦力.
 */
public interface IUserService {
    User findUserByName(String userName);

    ServiceResult<UserDTO> findById(Long userId);
}
