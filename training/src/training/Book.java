package training;


public class Book  {
	String name;
	double price;
	int qtyInStock;
	public Book(String name,Author auther,double price,int qtyInStock) {
		super();
		//this.Author=auther;
	    this.name=name;
	    
	    this.price=price;
	    this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", qtyInStock=" + qtyInStock + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + ", getQtyInStock()=" + getQtyInStock() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	}


