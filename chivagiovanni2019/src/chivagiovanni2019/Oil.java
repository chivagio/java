package chivagiovanni2019;

public class Oil {
	private String name;
	private int quantity;
	private double price;
	
	public Oil() {	}
	public Oil(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oil huile1 = new Oil();
		Oil huile2 = new Oil();
		
		huile1.name = "orange sanguine";
		huile1.quantity = 10;
		huile1.price = 2.20;
		
		huile2.name = "eucalyptus radié";
		huile2.quantity = 30;
		huile2.price = 5.90;
		
		System.out.println(huile1.name+" has "+huile1.quantity+"ml and costs "+huile1.price+"€");
	}

}
