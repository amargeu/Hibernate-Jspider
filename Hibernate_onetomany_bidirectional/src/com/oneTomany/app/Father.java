package com.oneTomany.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.mapping.List;

@Entity
public class Father  implements Serializable
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.List<Children> getListOfChildren() {
		return listOfChildren;
	}
	public void setListOfChildren(java.util.List<Children> listOfChildren) {
		this.listOfChildren = listOfChildren;
	}
	private String name;
	@OneToMany(mappedBy="father",fetch=FetchType.EAGER)//BY Default one to many are lazy loading
	private java.util.List<Children>listOfChildren;
	
	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Father [id=" + id + ", name=" + name + "]";
	}
}
