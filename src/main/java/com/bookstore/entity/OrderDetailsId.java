package com.bookstore.entity;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class OrderDetailsId {
	
  //Have to modify this classs
	private BookOrders order_id;
	private Books book_id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id", insertable = false, updatable = false, nullable = false)
	public BookOrders getOrder_id() {
		return order_id;
	}
	public void setOrder_id(BookOrders order_id) {
		this.order_id = order_id;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id", insertable = false, updatable = false, nullable = false)
	public Books getBook_id() {
		return book_id;
	}
	public void setBook_id(Books book_id) {
		this.book_id = book_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book_id == null) ? 0 : book_id.hashCode());
		result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDetailsId other = (OrderDetailsId) obj;
		if (book_id == null) {
			if (other.book_id != null)
				return false;
		} else if (!book_id.equals(other.book_id))
			return false;
		if (order_id == null) {
			if (other.order_id != null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		return true;
	}
	
	

}
