package com.techwithhari.Ecommerce_Backend.repositories;

import com.techwithhari.Ecommerce_Backend.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
