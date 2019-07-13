package com.example.codeengine.expense.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="expense")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expense {

	@Id
	private Long id;
	
	private String desc;
	
	private Instant expenseDate;
	
	// ID(Pk), date,    description            user id   category id - say under travel category
	// 1000, 6/16/2019, "visiting switzerland", 1 ,      10
	
	@ManyToOne
	private Category category;
	
	@ManyToOne
	private User user;
}
