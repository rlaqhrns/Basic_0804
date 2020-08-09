package class0805;

public class BusinessTaxPayer extends TaxPayer {

	private int sales;
	private int expenses;

	public BusinessTaxPayer(String name, int number, int sales, int expenses) {
		super(name, number);
		setSales(sales);
		setExpenses(expenses);

	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getExpenses() {
		return expenses;
	}

	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}

	@Override
	public double computeTax() {

		double taxableAmount = sales - expenses;

		if (taxableAmount <= 0) {
			return 0;
		} else {
			return taxableAmount * 0.2;
		}

	}

	public String toString() {
		return super.toString() + "\n총 매출액 : " + sales + "\n총 비용 : " + expenses;
	}

}
