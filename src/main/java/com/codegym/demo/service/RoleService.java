package com.codegym.demo.service;

import com.codegym.demo.model.Role;

public interface RoleService {
    Role findRoleByName(String roleName);

    Iterable<Role> findAll();

    void save(Role role);
}
