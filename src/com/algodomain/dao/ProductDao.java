package com.algodomain.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.algodomain.model.ProductDiscount;
import com.algodomain.model.ProductPrice;



public class ProductDao
{
	
	private static final String dbUrl= "jdbc:mysql://localhost:3306/assignment";
	private static final String dbUsername= "root";
	private static final String dbPassword= "root";
	
	private static Connection con = null;
	private static Statement s = null;
	private static PreparedStatement ps=null;
	private static ResultSet rs = null; 
	
	
	
		public static void inserting(String Product_Name, String Product_Type, String product_Category, int Product_Price) 
		{
			 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				 con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
					ps=	 con.prepareStatement("insert into Products(Product_Name, Product_Type, product_Category, Product_Price) values(?,?,?,?)");
					ps.setString(1, Product_Name);
					ps.setString(2, Product_Type);
					ps.setString(3, product_Category);
					ps.setInt(4, Product_Price);
					
					ps.executeUpdate();
					
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			 finally {
				 try {
					 if(ps !=null) {
						 ps.close();
					 }
					 if(con !=null)
					 {
						 con.close();
					 }
				 }
					 catch (SQLException e) 
					 {
						e.printStackTrace();
					 }
				 
			 }
		
		
		}
		
		public static void updating(int Product_ID, String Product_Name, String Product_Type, String product_Category, int Product_Price) 

		{
			
			 try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
					ps=	 con.prepareStatement("update products set Product_Name=?, Product_Type=?, product_Category=?, Product_Price=? where Product_ID=?");
					ps.setString(1, Product_Name);
					ps.setString(2, Product_Type);
					ps.setString(3, product_Category);
					ps.setInt(4, Product_Price);
					ps.setInt(5, Product_ID);
					
					ps.executeUpdate();
				    } 
				 
				 catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				 
			finally 
			{
				try 
				{
					if(ps !=null)
					{
						ps.close();
					}
					if(con !=null)
					{
						con.close();
					}
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}

	
		
		}
		
		public static void deleting(int Product_ID) 
		{
			 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
				ps=	 con.prepareStatement("delete from products where Product_Id=?");
				ps.setInt(1, Product_ID);
				ps.executeUpdate();
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			 
		
			 finally
				{
					try {
						if(ps !=null)
						{
						ps.close();
						}
						if(con !=null)
						{
							con.close();
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
		} 
		
		
	     public static void read()
		   {
	    	 try 
	  	   {
	  		Class.forName("com.mysql.cj.jdbc.Driver");
	  		con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	  		   
	  		   String qry="select * from products";
	  		  s= con.createStatement();
	  		  
	  		   rs =s.executeQuery(qry);
	  		   
	  		  while(rs.next())
	  		  {
	  			  System.out.println(rs.getInt("Product_ID"));
	  			  System.out.println(rs.getString("Product_Name"));
	  			  System.out.println(rs.getString("Product_Type"));
	  			  System.out.println(rs.getString("product_Category"));
	  			  System.out.println(rs.getInt("Product_Price"));
	  			  
	  			  System.out.println("------------------------");
	  		  }
	  		  
	  	    } 
	  	   catch (ClassNotFoundException e)
	  	   {
	  		
	  		e.printStackTrace();
	  	   } catch (SQLException e) 
	  	   {
	  		e.printStackTrace();
	  	   }
	  	   
	  	   finally {
	  		   try {
	  			   if(rs != null)
	  			   {
	  		         rs.close();
	  			   }
	  			   if(s != null)
	  			   {
	  		         s.close();
	  			   }
	  			   if(con != null)
	  			   {
	  		         con.close();
	  			   }
	  		        
	  	           } 
	  		   catch (SQLException e) 
	  		      {
	  		          e.printStackTrace();
	  	          }
	  	   }
		   }


		 public static ProductPrice getOneProductData(int id)
     {
	    	 ProductPrice p = null;
	    	 try 
	    	 {	    
	
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	    		
	    		ps  = con.prepareStatement("select * from products where Product_ID=?");
	    		ps.setInt(1, id);
	    		
	    		rs = ps.executeQuery();
	    		
	    		while (rs.next())
	    		{
	    			int i= rs.getInt("Product_ID");
	    			String n= rs.getString("Product_Name");
	    			String l= rs.getString("Product_Type");
	    			String m= rs.getString("product_Category");
	    			int e= rs.getInt("Product_Price");
	    			
	    			p = new ProductPrice(i, n, l, m, e);
	    			
	    		}
	    		
	    	 } 
	    	 catch (ClassNotFoundException e) 
	    	 {
	    		e.printStackTrace();
	    	 } 
	    	 catch (SQLException e) 
	    	 {
	    		e.printStackTrace();
	    	 }
	         finally
	         {
	        	 try
	        	 {
	        		 if(rs !=null)
	        		 {
	        			 rs.close();
	        		 }
	        		 if(ps !=null)
	        		 {
	        			 ps.close();
	        		 }
	        		 if(con !=null)
	        		 {
	        			 con.close();
	        		 }
	        	 }
	        	 catch (SQLException e)
	        	 {
	        		 e.printStackTrace();
	        	 }
	    		 
	    	 }
	    	 
	    	 return p;
	    	 
	   }
	     
	  public static ProductDiscount getProductDiscount(String p) 
	  {
		  ProductDiscount pd = null;
	    	 try 
	    	 {
	    		Class.forName("com.mysql.cj.jdbc.Driver");
	    		con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	    		
	    		ps  = con.prepareStatement("select * from charges where Product_Category=?");
	    		ps.setString(1, p);
	    		
	    		rs = ps.executeQuery();
	    		
	    		while (rs.next())
	    		{
	    			String c= rs.getString("Product_Category");
	    			double d= rs.getDouble("Discount");
	    			double g= rs.getDouble("GST");
	    			int dc= rs.getInt("Delivery_Charges");
	    			
	    			pd = new ProductDiscount(c, d, g, dc);
	    			
	    		}
	    		
	    	 } 
	    	 catch (ClassNotFoundException e) 
	    	 {
	    		e.printStackTrace();
	    	 } 
	    	 catch (SQLException e) 
	    	 {
	    		e.printStackTrace();
	    	 }
	         finally
	         {
	        	 try
	        	 {
	        		 if(rs !=null)
	        		 {
	        			 rs.close();
	        		 }
	        		 if(ps !=null)
	        		 {
	        			 ps.close();
	        		 }
	        		 if(con !=null)
	        		 {
	        			 con.close();
	        		 }
	        	 }
	        	 catch (SQLException e)
	        	 {
	        		 e.printStackTrace();
	        	 }
	    		 
	    	 }
	    	 
	    	 return pd;
	    }
}
	  	  
	  	  
		   


