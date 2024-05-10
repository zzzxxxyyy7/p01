package com.rhss.rhssp01;

import com.rhss.rhssp01.Model.entiey.domain.Role;
import com.rhss.rhssp01.Model.entiey.service.RoleService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RhssP01ApplicationTests {

    @Resource
    private RoleService roleService;

    @Test
    void contextLoads() {
        Role role = new Role();
        role.setName("超级管理员");
        roleService.save(role);
    }
}