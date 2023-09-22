package com.sangeng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.User;


/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2023-09-08 16:29:37
 */
public interface UserService extends IService<User> {

    ResponseResult userInfo();

    ResponseResult uploadUserInfo(User user);

    ResponseResult register(User user);
}


