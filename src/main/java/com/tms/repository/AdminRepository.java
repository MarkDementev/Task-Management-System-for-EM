package com.tms.repository;

import com.tms.model.user.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByIsAdmin(Boolean isAdmin);
}
