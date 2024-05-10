package com.rhss.rhssp01.Services;

import com.rhss.rhssp01.Exception.P01Exception;
import com.rhss.rhssp01.Model.dto.UserSaveDto;
import com.rhss.rhssp01.Model.entiey.domain.User;
import com.rhss.rhssp01.Model.entiey.service.UserService;
import jakarta.annotation.Resource;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserControllerService {

    @Resource
    private UserService userService;

    /**
     * 新增 或 保存用户
     * @param userSaveDto
     */
    public void save(UserSaveDto userSaveDto){
        String userId = userSaveDto.getId();
        if (userId == null){
            // 新增用户
            User user = new User();
            BeanUtils.copyProperties(userSaveDto,user);
            // 默认生成随机昵称
            user.setNickname(UUID.randomUUID().toString());
            user.setRole("Maintainer");
            boolean save = userService.save(user);
            if(BooleanUtils.isFalse(save)) {
                throw new P01Exception("保存用户失败");
            }
        }else {
            // 更新用户
            User user = new User();
            BeanUtils.copyProperties(userSaveDto,user);
            boolean update = userService.updateById(user);
            if(BooleanUtils.isFalse(update)) {
                throw new P01Exception("更新用户失败");
            }
        }
    }
}
