package com.guru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guru.entities.UserRoleEntity;

@Repository
public interface UserRoleEntityRepository extends JpaRepository<UserRoleEntity,Integer>{

}