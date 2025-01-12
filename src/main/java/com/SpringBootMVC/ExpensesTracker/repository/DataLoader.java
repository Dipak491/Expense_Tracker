package com.SpringBootMVC.ExpensesTracker.repository;



import com.SpringBootMVC.ExpensesTracker.entity.Category;
import com.SpringBootMVC.ExpensesTracker.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        // Insert default categories if they do not exist
        if (categoryRepository.count() == 0) {  // To avoid re-inserting categories on each restart
            Category category1 = new Category(1, "Groceries");
            Category category2 = new Category(2, "Utilities (bill)");
            Category category3 = new Category(3, "Transportation");
            Category category4 = new Category(4, "Dining Out");
            Category category5 = new Category(5, "Entertainment");
            Category category6 = new Category(6, "Shopping");
            Category category7 = new Category(7, "Travel");
            Category category8 = new Category(8, "Education");

            categoryRepository.save(category1);
            categoryRepository.save(category2);
            categoryRepository.save(category3);
            categoryRepository.save(category4);
            categoryRepository.save(category5);
            categoryRepository.save(category6);
            categoryRepository.save(category7);
            categoryRepository.save(category8);

            System.out.println("Default categories inserted successfully!");
        } else {
            System.out.println("Categories already exist. Skipping insertion.");
        }
    }
}
