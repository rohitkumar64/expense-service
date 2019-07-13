package com.example.codeengine.expense.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name="category")
@Data
@NoArgsConstructor
public class Category {

	@Id
	private Long id;
	
	@NonNull
	private String name;
	
}

