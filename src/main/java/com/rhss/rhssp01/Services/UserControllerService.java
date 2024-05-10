package com.rhss.rhssp01.Services;

import com.rhss.rhssp01.Model.dto.UserSaveDto;
import com.rhss.rhssp01.Model.entiey.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserControllerService {

    @Resource
    private UserService userService;

    public void save(UserSaveDto userSaveDto){
        Integer userId = userSaveDto.getId();
        if (userId == null){
            // 新增用户

        }else {
            // 更新用户
        }
    }
}
