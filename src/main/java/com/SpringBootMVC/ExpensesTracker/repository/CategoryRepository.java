package com.SpringBootMVC.ExpensesTracker.repository;

import com.SpringBootMVC.ExpensesTracker.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	
	 public default void insertcData() {
	        // Insert default categories
	        Category category1 = new Category(1, "Groceries");
	        Category category2 = new Category(2, "Utilities(bill)");
	        Category category3 = new Category(3, "Transportation");
	        Category category4 = new Category(4, "Dining Out");
	        Category category5 = new Category(5, "Entertainment");
	        Category category6 = new Category(3, "Shopping");
	        Category category7 = new Category(4, "Travel");
	        Category category8 = new Category(5, "Education");

	        CrudRepository<Category, Integer> categoryRepository = null;
			categoryRepository.save(category1);
	        categoryRepository.save(category2);
	        categoryRepository.save(category3);
	        categoryRepository.save(category4);
	        categoryRepository.save(category5); 
	        categoryRepository.save(category6);
	        categoryRepository.save(category7);
	        categoryRepository.save(category8);
	  }

	
	
    Category findByName(String category);
}
