/**
 * 
 */
package com.intelliswift.store.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intelliswift.store.app.dto.ProductDTO;
import com.intelliswift.store.app.service.ProductService;

/**
 * @author sudip banerjee
 *
 */
@RestController
@RequestMapping(value = "/products")
@Validated
public class ProductController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private HttpHeaders headers;

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/healthCheck")
	public String healthCheck() {

		logger.info("APP-API : Server is Working fine");

		return "APP-API : Server is working fine";
	}

	/**
	 * This API is used to add product iteams to store
	 * 
	 * @param ProductDTO
	 * @param request
	 * @param response
	 * @return ResponseEntity<ProductDTO>
	 * @throws Exception
	 */
	@PostMapping
	public ResponseEntity<ProductDTO> addIteamsToStore(@Valid @RequestBody ProductDTO productDTOReq,
			HttpServletRequest request, HttpServletResponse response) {
		logger.info("ProductController : addIteamsToStore Method Called");

		headers = new HttpHeaders();

		try {

			ProductDTO productDTO = productService.createProduct(productDTOReq);

			return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(productDTO);

		} catch (Exception ex) {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body(null);
		}
	}

	// call update product method..
	public String updateIteam() {
		return null;
	}

	// call delete product mthod..
	public String deleteIteam() {
		return null;
	}

	// serach all product by using any property of product, pagination and sorting..
	public String getAllIteams() {
		return null;
	}

	// getting bills of product..

}
