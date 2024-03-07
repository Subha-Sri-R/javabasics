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

	    Customer c2=new Customer();
	    c2.setCid(112);
		c2.setCname("sindhuja");
		c2.setCaddress("bangalore");
	    System.out.println(c2);//calling the toString
	    
	    Customer c3=new Customer();//implicit default  constructor
	    System.out.println(c3);
	    
	    Customer c4=new Customer(153,"sun","UK"); // parameterized constructor
	    System.out.println(c4);
	}

}
