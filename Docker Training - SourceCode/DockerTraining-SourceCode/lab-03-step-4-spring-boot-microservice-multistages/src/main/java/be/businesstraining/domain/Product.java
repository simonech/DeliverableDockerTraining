package be.businesstraining.domain;

import java.math.BigDecimal;

public class Product {
	
	private String id;
	private String name;
	private BigDecimal unitPrice;
	
	public Product() {
	}

	public Product(String id, String name, BigDecimal unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	

}
