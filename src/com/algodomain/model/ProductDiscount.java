package com.algodomain.model;


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
	
	
}

	

