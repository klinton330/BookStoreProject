package com.bookstore.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "catagory")
public class Catagory {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int catagory_id;
	private String catagory_name;
	@OneToMany
	@JoinColumn(name = "catagory_id")
	private Set <Books>book=new HashSet<Books>();
	public Set<Books> getBook() {
		return book;
	}
	public void setBook(Set<Books> book) {
		this.book = book;
	}
	public int getCatagory_id() {
		return catagory_id;
	}
	public void setCatagory_id(int catagory_id) {
		this.catagory_id = catagory_id;
	}
	public String getCatagory_name() {
		return catagory_name;
	}
	public void setCatagory_name(String catagory_name) {
		this.catagory_name = catagory_name;
	}
	
	
}
