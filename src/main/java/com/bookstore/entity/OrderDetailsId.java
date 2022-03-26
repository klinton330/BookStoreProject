package com.bookstore.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class OrderDetailsId implements Serializable {
	private Books book;
	private BookOrders bookOrder;

	@ManyToOne
	@JoinColumn(name = "book_id")
	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	@ManyToOne
	@JoinColumn(name = "order_id")
	public BookOrders getBookOrder() {
		return bookOrder;
	}

	public void setBookOrder(BookOrders bookOrder) {
		this.bookOrder = bookOrder;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((bookOrder == null) ? 0 : bookOrder.hashCode());
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
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (bookOrder == null) {
			if (other.bookOrder != null)
				return false;
		} else if (!bookOrder.equals(other.bookOrder))
			return false;
		return true;
	}

	
	
}
