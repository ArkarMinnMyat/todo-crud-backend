package com.example.todocrudbackend.repository;

import com.example.todocrudbackend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
