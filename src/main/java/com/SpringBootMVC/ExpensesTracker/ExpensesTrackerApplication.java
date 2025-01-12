package com.SpringBootMVC.ExpensesTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import com.SpringBootMVC.ExpensesTracker.entity.Category;
import com.SpringBootMVC.ExpensesTracker.repository.CategoryRepository;

import java.time.LocalDateTime;
import java.time.Month;

@SpringBootApplication
public class ExpensesTrackerApplication {
	
	 
	
	
	public static void main(String[] args) {
		SpringApplication.run(ExpensesTrackerApplication.class, args);
		
		ExpensesTrackerApplication ets=new ExpensesTrackerApplication();
		
	
	
		
		
	}
	
	
	 
}
