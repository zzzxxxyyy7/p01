package com.rhss.rhssp01.Model.entiey.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rhss.rhssp01.Model.entiey.domain.User;
import com.rhss.rhssp01.Model.entiey.mapper.UserMapper;
import com.rhss.rhssp01.Model.entiey.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author Rhss
* @description 针对表【user(用户信息表)】的数据库操作Service实现
* @createDate 2024-05-09 21:58:18
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




