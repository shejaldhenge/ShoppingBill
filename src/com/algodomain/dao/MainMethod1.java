package com.algodomain.dao;

import com.algodomain.model.ProductDiscount;
import com.algodomain.model.ProductPrice;


public class MainMethod1 {

	public static void main(String[] args) 
	{
		
				ProductPrice p = ProductDao.getOneProductData(1);
				
				System.out.println("Product_ID:"+ p.getProduct_ID());
				System.out.println("Product_Name:" + p.getProduct_Name());
				System.out.println("Product_Type:" +p.getProduct_Type());
				System.out.println("Category:" + p.getProduct_Category());
				System.out.println("Product_Price:" + p.getProduct_Price());
				
				
				

				ProductDiscount a=ProductDao.getProductDiscount(p.getProduct_Category());
				
				ProductDiscount.getFinalDisc (p.getProduct_ID(), p.getProduct_Category());
				ProductDiscount.getFinalGST (p.getProduct_ID(), p.getProduct_Category());
				System.out.println("Delivery Charges:" + a.getDeliveryCharge());
				
				double totalPrice = ProductDiscount.doFinalCalculation(p.getProduct_ID(),p.getProduct_Category());
				System.out.println("final price:" +totalPrice);
				}
}
		

	


