//Driver program for the customer entity class
package Day3;

public class CustomerExecutor {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(112);
		c1.setCname("subha");
		c1.setCaddress("pondicherry");
		System.out.println("Customer id:"+c1.getCid());
	    System.out.println("Customer name:"+c1.getCname());
	    System.out.println("Customer Address:"+c1.getCaddress());

	}

}
