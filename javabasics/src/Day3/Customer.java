//program to demonstrate the customer entity class
package Day3;

public class Customer {
	private int cid;
	private String cname;
	private String caddress;
	
	//explicit default constructor
	public Customer () {
		this.cid=100;
		this.cname="unknown";
		this.caddress="canada";
		}
   //parameterized constructor
	public Customer(int cid ,String cname,String caddress) {
		this.cid=cid;
		this.cname=cname;
		this.caddress=caddress;
	}
	
	//Getter and Setter
	public int getCid() {
		return cid;
	}
	public void setCid(int cid){
       this.cid=cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + "]";
	}
	
	
}
