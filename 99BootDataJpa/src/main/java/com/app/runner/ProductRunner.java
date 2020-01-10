package com.app.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		//1...save
		/*repo.save(new Product("Akshay"));
		repo.save(new Product("ajay"));
		Product product = repo.save(new Product("ravi"));
		System.out.println(product.getProdId());*/
		//2...update
		/*repo.save(new Product(1, "mama"));*/
		//3...save list of object
		/*repo.saveAll(Arrays.asList(
				new Product("A"),
				new Product("B"),
				new Product("C")
				));*/
		//4...fetch one row
		/*Optional<Product> optional = repo.findById(1);
		if (optional.isPresent()) {
			Product product = optional.get();
			System.out.println(product.getProdName());
		}else System.out.println("Id is Not avalable");*/
		//5...to fetch all data
		/*repo.findAll().forEach(System.out::println);*/
		//6...to delete one record
		/*repo.deleteById(1);*/
		/*repo.deleteAll();*/
		
		
		
		
        /**********************findAll() from Repository*******************/
		//findAll(Sort sort); it perform accending order by default
		//repo.findAll(Sort.by("prodName")).forEach(System.out::println);	
		////findAll(Sort sort); it perform customization sorting
		repo.findAll(Sort.by(Direction.DESC, "prodName")).forEach(System.out::println);
		
		//public void addedForMaster(){
	}

	}
}
