package oops;

public class O006_EncaptulationDemo {
	public static void main(String[] args) {
		
		Product p = new Product();
		p.setName("Fan");
		p.setPrice(1000);
		p.setQty(10);

		
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getQty());
		
	}
}
