package com.model.dao;
import java.util.List;

import com.model.beans.Product;
public interface ProductDao {
	List<Product> lister();
	List<Product> listerParCategorie(String idp);
	Product getProductById(String idp);
}
