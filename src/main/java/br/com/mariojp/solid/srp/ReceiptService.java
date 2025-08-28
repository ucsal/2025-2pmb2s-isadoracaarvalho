package br.com.mariojp.solid.srp;

public class ReceiptService {

	private TaxCalculator taxCalculator = new TaxCalculator();
	private ReceiptFormatter receiptFormatter = new ReceiptFormatter();

	public String generate(Order order) {
		double subtotal = order.getItems().stream()
				.mapToDouble(i -> i.getUnitPrice() * i.getQuantity())
				.sum();
		double tax = taxCalculator.calculaTaxa(subtotal);
		double total = subtotal + tax;

		return receiptFormatter.receiptFormatter(order, subtotal, tax, total);
	}
}
