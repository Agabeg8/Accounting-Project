package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import com.cydeo.reopsitory.RoleRepository;
import com.cydeo.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
//    private final RoleMapper roleMapper;

    @Override
    public List<RoleDTO> listAllRoles() {
        List<Role> roleList = roleRepository.findAll().stream().map()

        return null;
    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}
