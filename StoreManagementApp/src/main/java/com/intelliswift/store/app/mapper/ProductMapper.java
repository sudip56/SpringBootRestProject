package com.intelliswift.store.app.mapper;

import com.intelliswift.store.app.dto.ProductDTO;
import com.intelliswift.store.app.model.Customer;
import com.intelliswift.store.app.model.Product;

public class ProductMapper {

	public static Product toProductEntity(ProductDTO productDTOReq) {
		
		Product product = new Product();
		product.setProductName(productDTOReq.getProductName());
		product.setPrice(productDTOReq.getPrice());
		product.setDescription(productDTOReq.getDescription());
		product.setCatagory(productDTOReq.getCatagory());
		//product.setCustomer(productDTOReq.getCustomerDTO());
		
		return product;
	}

	public static ProductDTO toProductDTO(Product product) {
		
		ProductDTO productDTO = new ProductDTO();
		
		productDTO.setProductName(product.getProductName());
		productDTO.setCatagory(product.getCatagory());
		productDTO.setDescription(product.getDescription());
		productDTO.setPrice(product.getPrice());
		//productDTO.setCustomerDTO(product.getCustomer());
		return productDTO;
	}

}
