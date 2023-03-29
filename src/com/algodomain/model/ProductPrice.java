package com.algodomain.model;

public class ProductPrice {
	private int Product_ID;
	private String Product_Name;
	private String Product_Type;
	private String product_Category;
	private int Product_Price;
	  
	  
	  
	public ProductPrice(int Product_ID, String Product_Name, String Product_Type, String product_Category, int Product_Price) {
		super();
		this.Product_ID = Product_ID;
		this.Product_Name = Product_Name;
		this.Product_Type = Product_Type;
		this.product_Category = product_Category;
		this.Product_Price = Product_Price;
	}
	
	

public int getProduct_ID() 
  {
		return Product_ID;
	}
public void setProduct_ID(int product_ID)
  {
		Product_ID = product_ID;
	}

public String getProduct_Name() 
  {
		return Product_Name;
	}
public void setProduct_Name(String product_Name) 
 {
		Product_Name = product_Name;
	}

public String getProduct_Type() 
  {
		return Product_Type;
	}
public void setProduct_Type(String product_Type) 
  {
		Product_Type = product_Type;
	}

public String getProduct_Category() 
  {
		return product_Category;
	}
public void setProduct_Category(String product_Category) 
  {
		this.product_Category = product_Category;
	}

public int getProduct_Price()
  {
		return Product_Price;
	}
public void setProduct_Price(int product_Price) 
  {
		Product_Price = product_Price;
	}

}
