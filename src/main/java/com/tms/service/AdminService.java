package com.tms.service;

import com.tms.dto.UserDTO;
import com.tms.model.user.Admin;

public interface AdminService {
    Admin getAdmin();
    Admin updateAdmin(UserDTO adminDTO);
}
