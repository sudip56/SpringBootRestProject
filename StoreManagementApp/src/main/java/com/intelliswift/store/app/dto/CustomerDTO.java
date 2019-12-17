package com.intelliswift.store.app.dto;

import java.io.Serializable;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.intelliswift.store.app.model.Product;

public class CustomerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8890251708107830769L;

	private long customerId;

	@NotNull(message = "First Name can not be null")
	@Size(min = 3, max = 50, message = "FName should be between {min} and {max} chars")
	private String fName;

	@NotNull(message = "Last Name can not be null")
	@Size(min = 3, max = 50, message = "LName should be between {min} and {max} chars")
	private String lName;

	@NotNull(message = "Email Name can not be null")
	@Size(min = 3, max = 50, message = "Email should be between {min} and {max} chars")
	private String emailId;

	@JsonProperty("products")
	private Set<Product> products;

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(long customerId,
			@NotNull(message = "First Name can not be null") @Size(min = 3, max = 50, message = "FName should be between {min} and {max} chars") String fName,
			@NotNull(message = "Last Name can not be null") @Size(min = 3, max = 50, message = "LName should be between {min} and {max} chars") String lName,
			@NotNull(message = "Email Name can not be null") @Size(min = 3, max = 50, message = "Email should be between {min} and {max} chars") String emailId,
			Set<Product> products) {
		super();
		this.customerId = customerId;
		this.fName = fName;
		this.lName = lName;
		this.emailId = emailId;
		this.products = products;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", fName=" + fName + ", lName=" + lName + ", emailId="
				+ emailId + ", products=" + products + "]";
	}

}
