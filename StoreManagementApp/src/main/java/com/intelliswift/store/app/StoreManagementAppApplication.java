package com.intelliswift.store.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.intelliswift.store.app.model.Product;
import com.intelliswift.store.app.repository.IProductRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.intelliswift.store"})
@EnableTransactionManagement
public class StoreManagementAppApplication implements CommandLineRunner{
	
	@Autowired
	private IProductRepository productRepository;
	
	private final static Logger logger = LoggerFactory.getLogger(StoreManagementAppApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(StoreManagementAppApplication.class, args);
		
		logger.info("Service Started");
	}
	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
		
		product.setCatagory("A");
		product.setDescription("Good Pen");
		product.setPrice(15.10d);
		product.setProductName("Pen");
	
		productRepository.save(product);
		
	}

}
