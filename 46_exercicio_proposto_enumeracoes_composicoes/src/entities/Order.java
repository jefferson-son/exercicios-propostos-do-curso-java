package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total(double valueOrder) {
		
		double sum = 0;
		
		for(OrderItem order : items) {
			double valueTotalOrder = order.getPrice();
			sum += valueTotalOrder;
		}
		
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order moment: ");
		builder.append(dtfm.format(moment) + "\n");
		builder.append("Order status: ");
		builder.append(status + "\n");
		builder.append("Client: ");
		builder.append(client.getName() + " ");
		builder.append(dtf.format(client.getBirthDate()) + " - ");
		builder.append(client.getEmail() + "\n");
		builder.append("Order items: \n");
		
		
		double sumTotalOrder = 0;
		
		for(OrderItem ordIt : items) {
			double value = ordIt.getPrice();
			int quantity = ordIt.getQuantity();
			double subTotal = ordIt.subTotal(value, quantity);
			sumTotalOrder += subTotal;
			
			builder.append(ordIt.getProduct().getName()+ ", ");
			builder.append("$ " + String.format("%.2f", value) + ", ");
			builder.append(quantity + ", ");
			builder.append("Subtotal : $" + String.format("%.2f", subTotal) + "\n");
		}

		
		builder.append("Total Price: $" + String.format("%.2f", sumTotalOrder));
		
		return builder.toString();
	}
	
	
}
