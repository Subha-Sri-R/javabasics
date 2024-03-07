//program to demonstrate the customer entity class
package Day3;

public class Customer {
	private int cid;
	private String cname;
	private String caddress;
	
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
	
}
