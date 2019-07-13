package com.example.codeengine.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.codeengine.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	//findBy + field name (in category class by which you want to search the Category)
	Category findByName(String name);

}
