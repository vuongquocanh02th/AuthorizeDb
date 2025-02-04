package com.authorizedb.repository;

import com.authorizedb.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}
