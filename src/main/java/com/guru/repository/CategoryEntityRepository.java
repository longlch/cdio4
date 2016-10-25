package com.guru.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guru.entities.CategoryEntity;

@Repository
public interface CategoryEntityRepository extends JpaRepository<CategoryEntity,Integer> {

}