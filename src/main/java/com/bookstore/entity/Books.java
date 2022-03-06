package com.bookstore.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_table")
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer book_id;
	private String title;
	private String author;
	private String description;
	private String isbn;
	private byte[] image;
	private double price;
	private Date publish_date;
	private Date last_update;
	//Many to One
    private Catagory catagory_id;
    //One to Many
    private Set <Review>reveiw =new HashSet<Review>();
   private  Set<OrderDetails> orderDetails=new HashSet<OrderDetails>();
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}
	public Date getLast_update() {
		return last_update;
	}
	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	public Catagory getCatagory_id() {
		return catagory_id;
	}
	public void setCatagory_id(Catagory catagory_id) {
		this.catagory_id = catagory_id;
	}
	public Set<Review> getReveiw() {
		return reveiw;
	}
	public void setReveiw(Set<Review> reveiw) {
		this.reveiw = reveiw;
	}
	public Set<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(Set<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
    
    
    
}
