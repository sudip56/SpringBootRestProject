package com.intelliswift.store.app.serviceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelliswift.store.app.dto.ProductDTO;
import com.intelliswift.store.app.mapper.ProductMapper;
import com.intelliswift.store.app.model.Product;
import com.intelliswift.store.app.repository.IProductRepository;
import com.intelliswift.store.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	
	@Autowired
	private IProductRepository productRepository;
	
	private static final Logger logger = LogManager.getLogger(ProductServiceImpl.class);
	
	/**
	 * This method is used to save product
	 * 
	 * @param ProductDTO
	 * @return ProductDTO
	 */
	@Override
	public ProductDTO createProduct(ProductDTO productDTOReq) {
		logger.info("ProductServiceImpl : createProduct Method Called");
		ProductDTO productDTO;
		try {
			Product product = ProductMapper.toProductEntity(productDTOReq);
			if(null!=product)
			{
				product = productRepository.save(product);
				logger.info("Producted is added.");
			}
			productDTO = ProductMapper.toProductDTO(product);
		}catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
			throw ex;
		}
		return productDTO;
	}
}
