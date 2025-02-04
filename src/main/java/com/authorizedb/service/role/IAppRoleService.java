package com.authorizedb.service.role;

import com.authorizedb.model.AppRole;
import com.authorizedb.service.IGeneralService;

public interface IAppRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}
