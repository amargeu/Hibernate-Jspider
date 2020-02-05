import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity  //1st  rule
public class Mobile implements Serializable//2nd rule implement serializable
{
@Id//2nd rule 
private int id;
private String brand;
private int ramsize;
private double price;
//rule3 getter and setter
public int getId() 
{
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getRamsize() {
	return ramsize;
}
public void setRamsize(int ramsize) {
	this.ramsize = ramsize;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Mobile()// rule5
{
	super();
}

}

