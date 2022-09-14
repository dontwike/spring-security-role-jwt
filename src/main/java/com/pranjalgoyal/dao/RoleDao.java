package com.pranjalgoyal.dao;

import com.pranjalgoyal.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Role findRoleByName(String name);
}