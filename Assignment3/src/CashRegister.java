
public class CashRegister {
	
	private int numTransactions;
	private double total;
	private static int numRegister = 0;
	
	public CashRegister() {
		numTransactions = 0;
		total = 0;
		numRegister += 1;
	}
	
	public void addTransaction(double amount) {
		numTransactions += 1;
		total += amount;
	}
	
	public int transactionCount() {
		return numTransactions;
	}
	
	public double total() {
		return total;
	}
	
	public void resetTransactions() {
		numTransactions = 0;
		total = 0;
	}
	
	public int registerCount() {
		return numRegister;
	}
	
	protected void finalize() { 
		numRegister -= 1;
    }
}
