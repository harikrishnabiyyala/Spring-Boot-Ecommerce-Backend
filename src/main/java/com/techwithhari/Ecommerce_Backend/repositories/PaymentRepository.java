package com.techwithhari.Ecommerce_Backend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techwithhari.Ecommerce_Backend.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

}