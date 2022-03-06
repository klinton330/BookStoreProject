package com.bookstore.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Review {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int review_id;
	private Books book_id;
	private Customer customer_id;
	private int rating;
	private String headline;
	private String comment;
	private Date review_time;
	public int getReview_id() {
		return review_id;
	}
	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}
	public Books getBook_id() {
		return book_id;
	}
	public void setBook_id(Books book_id) {
		this.book_id = book_id;
	}
	public Customer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Customer customer_id) {
		this.customer_id = customer_id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getReview_time() {
		return review_time;
	}
	public void setReview_time(Date review_time) {
		this.review_time = review_time;
	}
	
	

}
