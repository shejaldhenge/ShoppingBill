package com.algodomain.controller;

import com.algodomain.dao.ProductDao;
import com.algodomain.model.ProductDiscount;
import com.algodomain.model.ProductPrice;

public class Calculations 
{
	
	private static double basePrice;
		private static double Gst;
		private static double disc;
		private static int delCharges;
		private static double finalPrice;
		private static double totalDisc;
		private static double totalGst;
		
		
		

		
		public static double doFinalCalculation(int id, String productCategory) 
		{
			ProductPrice pc = ProductDao.getOneProductData(id);
			ProductDiscount pd = ProductDao.getProductDiscount(productCategory);
			basePrice = pc.getProduct_Price();
			Gst = pd.getGst();
			disc = pd.getDiscount();
			delCharges = pd.getDeliveryCharge();
			
			finalPrice = basePrice - (basePrice * disc) + (basePrice * Gst) + delCharges;
			return finalPrice;
		}
		
		public static void getFinalDisc(int id, String productCategory)
		{
			ProductPrice pc = ProductDao.getOneProductData(id);
			ProductDiscount pd = ProductDao.getProductDiscount(productCategory);
			basePrice = pc.getProduct_Price();
			disc = pd.getDiscount();
			totalDisc = basePrice*disc;
			System.out.println("discount:" +totalDisc);
			
		}
		public static void getFinalGST(int id, String productCategory)
		{
			ProductPrice pc = ProductDao.getOneProductData(id);
			ProductDiscount pd = ProductDao.getProductDiscount(productCategory);
			basePrice = pc.getProduct_Price();
			Gst = pd.getGst();
			totalGst = basePrice*Gst;
			System.out.println("GST:" +totalGst);
			
		}
}
