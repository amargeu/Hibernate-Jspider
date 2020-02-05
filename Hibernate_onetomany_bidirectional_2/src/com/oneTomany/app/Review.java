package com.oneTomany.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review  implements Serializable
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private long  rev_Id;
  private String name;
  private String comment;
  @ManyToOne
  private Product product;
public long getRev_Id() {
	return rev_Id;
}
public void setRev_Id(long rev_Id) {
	this.rev_Id = rev_Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
@Override
public String toString() {
	return "Review [rev_Id=" + rev_Id + ", name=" + name + ", comment=" + comment + "]";
}
  

}
