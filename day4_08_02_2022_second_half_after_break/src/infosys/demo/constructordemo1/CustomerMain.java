package infosys.demo.constructordemo1;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer=new Customer();
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getAddress());
        Customer customer2=new Customer(2,"John","Chennai");
        System.out.println(customer2.getId());
		System.out.println(customer2.getName());
		System.out.println(customer2.getAddress());
	}

}
