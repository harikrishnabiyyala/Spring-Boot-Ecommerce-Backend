package com.techwithhari.Ecommerce_Backend.repositories;

import com.techwithhari.Ecommerce_Backend.model.AppRole;
import com.techwithhari.Ecommerce_Backend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
