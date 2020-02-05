package com.oneTomany.app;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Product implements Serializable 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long prod_Id;
	private String prod_name;
	private int prod_price;
	@OneToMany(mappedBy="product",fetch=FetchType.EAGER)
	List<Review> listOfreview;
	public long getProd_Id() {
		return prod_Id;
	}
	public void setProd_Id(long prod_Id) {
		this.prod_Id = prod_Id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Review> getListOfreview() {
		return listOfreview;
	}
	public void setListOfreview(List<Review> listOfreview) {
		this.listOfreview = listOfreview;
	}
	@Override
	public String toString() {
		return "Product [prod_Id=" + prod_Id + ", prod_name=" + prod_name + ", prod_price=" + prod_price
				+ ", listOfreview=" + listOfreview + "]";
	}
	
	

}
