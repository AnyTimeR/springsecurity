package com.atr.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atr.springsecurity.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    public AppUser findByEmail(String email);
}