package app.demo.test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity// 1.this provides meta data to hibernate pls perform ORM on this class 

//2nd
public class Food implements Serializable
{
	
	//3rd will tell hibernate that is taken for pk
	@Id
	//auto generat primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int foodId;
	public Food() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodForm=" + foodForm + ", name=" + name + ", famousFor=" + famousFor
				+ "]";
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodForm() {
		return foodForm;
	}
	public void setFoodForm(String foodForm) {
		this.foodForm = foodForm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamousFor() {
		return famousFor;
	}
	public void setFamousFor(String famousFor)
	{
		this.famousFor = famousFor;
	}
	private String foodForm;
	private String name;
    private String famousFor; 
	
	

}
