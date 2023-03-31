package com.algodomain.controller;

import com.algodomain.dao.ProductDao;
import com.algodomain.model.ProductDiscount;
import com.algodomain.model.ProductPrice;

public class MainTask {

	public static void main(String[] args) 
	{
         
		
		
		//ProductDao.deleting();
		ProductPrice p = ProductDao.getOneProductData(4);
		
		System.out.println("Product_ID:"+ p.getProduct_ID());
		System.out.println("Product_Name:" + p.getProduct_Name());
		System.out.println("Product_Type:" +p.getProduct_Type());
		System.out.println("Category:" + p.getProduct_Category());
		System.out.println("Product_Price:" + p.getProduct_Price());
		
		
		

		ProductDiscount a=ProductDao.getProductDiscount(p.getProduct_Category());
		
		Calculations.getFinalDisc (p.getProduct_ID(), p.getProduct_Category());
		Calculations.getFinalGST (p.getProduct_ID(), p.getProduct_Category());
		System.out.println("Delivery Charges:" + a.getDeliveryCharge());
		
		double totalPrice = Calculations.doFinalCalculation(p.getProduct_ID(),p.getProduct_Category());
		System.out.println("final price:" +totalPrice);
	}

}
