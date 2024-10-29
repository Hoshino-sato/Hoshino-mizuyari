package com.mizuyarikun.mizuyarikun.repository;

import com.mizuyarikun.mizuyarikun.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}