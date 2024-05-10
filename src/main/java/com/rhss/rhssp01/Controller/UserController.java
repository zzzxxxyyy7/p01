package com.rhss.rhssp01.Controller;

import com.rhss.rhssp01.Model.dto.UserSaveDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rhss.rhssp01.Services.UserControllerService;

@RestController
@RequestMapping("/user")
@Tag(name = "用户管理接口" , description = "用户的增删改查")
public class UserController {

    @Resource
    private UserControllerService userControllerService;

    @PostMapping("/save")
    @Operation(summary = "保存 和 更新用户信息")
    public void save(UserSaveDto userSaveDto) {
        userControllerService.save(userSaveDto);
    }




}
