package com.intelliswift.store.app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUSTOMER_ID", nullable = false, columnDefinition = "BIGINT")
	private long customerId;

	@Column(name = "FIRST_NAME")
	private String fName;

	@Column(name = "LAST_NAME")
	private String lName;

	@Column(name = "EMAIL")
	private String emailId;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Product> products;

	public Customer() {
		super();
	}

	public Customer(long customerId, String fName, String lName, String emailId, Set<Product> products) {
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

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fName=" + fName + ", lName=" + lName + ", emailId=" + emailId
				+ ", products=" + products + "]";
	}

}