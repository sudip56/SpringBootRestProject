package com.intelliswift.store.app.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5279200836951771554L;

	private long productId;

	@NotNull(message = "product Name can not be null")
	@Size(min = 3, max = 50, message = "product should be between {min} and {max} chars")
	private String productName;

	@NotNull(message = "description can not be null")
	@Size(min = 3, max = 50, message = "Description should be between {min} and {max} chars")
	private String description;

	private double price;

	@NotNull(message = "catagory can not be null")
	@Size(min = 3, max = 50, message = "catagory should be between {min} and {max} chars")
	private String catagory;

	@JsonProperty("customer")
	private CustomerDTO customerDTO;

	public ProductDTO() {
		super();
	}

	public ProductDTO(long productId,
			@NotNull(message = "product Name can not be null") @Size(min = 3, max = 50, message = "product should be between {min} and {max} chars") String productName,
			@NotNull(message = "description can not be null") @Size(min = 3, max = 50, message = "Description should be between {min} and {max} chars") String description,
			double price,
			@NotNull(message = "catagory can not be null") @Size(min = 3, max = 50, message = "catagory should be between {min} and {max} chars") String catagory,
			CustomerDTO customerDTO) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.catagory = catagory;
		this.customerDTO = customerDTO;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public CustomerDTO getCustomerDTO() {
		return customerDTO;
	}

	public void setCustomerDTO(CustomerDTO customerDTO) {
		this.customerDTO = customerDTO;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", catagory=" + catagory + ", customerDTO=" + customerDTO + "]";
	}

}
