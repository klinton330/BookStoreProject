package com.bookstore.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetails {

	private OrderDetailsId id = new OrderDetailsId();
    private BookOrders order_id;
	private Books book_id;
	private int quantity;
	private float subtotal;
	@EmbeddedId
	public OrderDetailsId getId() {
		return id;
	}

	public void setId(OrderDetailsId id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name = "order_id")
	public BookOrders getOrder_id() {
		return order_id;
	}

	public void setOrder_id(BookOrders order_id) {
		this.order_id = order_id;
	}
	@ManyToOne
	@JoinColumn(name = "book_id")
	public Books getBook_id() {
		return book_id;
	}

	public void setBook_id(Books book_id) {
		this.book_id = book_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

}
