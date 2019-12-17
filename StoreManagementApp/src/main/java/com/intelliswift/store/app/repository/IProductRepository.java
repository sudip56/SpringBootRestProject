/**
 * 
 */
package com.intelliswift.store.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intelliswift.store.app.model.Product;

/**
 * @author sudip banerjee
 *
 */
@Repository
@Transactional
public interface IProductRepository extends JpaRepository<Product, Long> {

	

}
