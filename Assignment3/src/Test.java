
public class Test {

	public static void main(String[] args) {
		
		CashRegister r1 = new CashRegister();
		CashRegister r2 = new CashRegister();
		
		System.out.println("Number of Registers:");
		System.out.println(r1.registerCount());
		
		// test r1 register
		System.out.println("r1 initial total is :" + r1.total());
		r1.addTransaction(34.2);
		r1.addTransaction(72.1);
		System.out.println("After add 2 transactions($34.2 and $72.1), the total is :" + r1.total());
		System.out.println("r1 number of transactions is :" + r1.transactionCount());
		
		// test r2 register
		System.out.println("r2 initial total is :" + r2.total());
		r2.addTransaction(11.2);
		r2.addTransaction(22.3);
		System.out.println("After add 2 transactions($11.2 and $22.3), the total is :" + r2.total());
		System.out.println("r2 number of transactions is :" + r2.transactionCount());
		
		//reset r1 register
		r1.resetTransactions();
		System.out.println("After r1 reset:");
		System.out.println("r1 number of transactions is :" + r1.transactionCount());
		System.out.println("r1 total is :" + r1.total());
		
	}

}
