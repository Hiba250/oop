package MODULE_1;

public class Product {
	String pname,pcode;
	int price;
	public Product() {}
	public Product(String pname, String pcode, int price) {
		this.pname = pname;
		this.pcode = pcode;
		this.price = price;
	}
	public void setPname(String pname) {
		this.pname = pname;}
	public String getPcode() {
		return pcode;}
	public String getPname() {
		return pname;}
	public void setPcode(String pcode) {
		this.pcode = pcode;}
	public int getPrice() {
		return price;}
	public void setPrice(int price) {
		this.price = price;}
	public void display() {
		System.out.println("pcode:" + this.pcode);
		System.out.println("pname:" + this.pname);
		System.out.println("price:" + this.price+"\n");
	}

}


package MODULE_1;

public class Cars {
	public static void main(String[]args) {
		Product p1=new Product();
		p1.pcode = "car123";
		p1.pname="Benz";
		p1.price=10000;
		System.out.println("Display p1:");
		p1.display();
		Product p2=new Product("jaguar","car456",25000);
		System.out.println("Display p2:");
		p2.display();
		Product p3=new Product("maruthi","car800",50000);
		System.out.println("display p3:");
		p3.display();
		Product p=p3.getPrice()<(p1.price<p2.price? p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\ndisplay product with lowest price:");
		p.display();
	}

}

ouput

  Display p1:
pcode:car123
pname:Benz
price:10000

Display p2:
pcode:car456
pname:jaguar
price:25000

display p3:
pcode:car800
pname:maruthi
price:50000


display product with lowest price:
pcode:car123
pname:Benz
price:10000
