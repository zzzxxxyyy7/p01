package com.rhss.rhssp01.Services;

import com.rhss.rhssp01.Model.dto.UserSaveDto;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserControllerService {

    @Resource
    private UserControllerService userControllerService;

    public void save(UserSaveDto userSaveDto){
        Integer userId = userSaveDto.getId();
        if (userId == null){
            // 新增用户

        }else {
            // 更新用户
        }
    }
}
