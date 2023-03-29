package com.algodomain.model;

import com.algodomain.dao.ProductDao;




public class ProductDiscount {
	private String productCategory;
	private double discount;
	private double gst;
	private int deliveryCharge;
	
	public ProductDiscount(String productCategory, double discount, double gst, int deliveryCharge) {
		super();
		this.productCategory = productCategory;
		this.discount = discount;
		this.gst = gst;
		this.deliveryCharge = deliveryCharge;
	}

	public String getProductCategory() 
	{
		return productCategory;
	}

	public void setProductCategory(String productCategory) 
	{
		this.productCategory = productCategory;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public int getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(int deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	
	
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

	

