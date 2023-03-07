package model.entities;

public class Product {

	private String name;
	private Double value;
	private Integer quantity;

	public Product() {
	}

	public Product(String name, Double value, Integer amount) {
		this.name = name;
		this.value = value;
		this.quantity = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getAmount() {
		return quantity;
	}

	public void setAmount(Integer amount) {
		this.quantity = amount;
	}

	public double totalAmount() {
		return value * quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", value=" + value + ", amount=" + quantity + "]";
	}

}
