package com.xoriant.ecart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoriant.ecart.entities.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

}
