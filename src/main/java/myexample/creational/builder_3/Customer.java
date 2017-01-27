package myexample.creational.builder_3;

/*
public class Customer {
	private long id;
	private String firstname;
	private String lastname;
	private String city;
	private String gender;
	
	public Customer(long id, String firstname, String lastname, String city, String gender){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		String info = String.format("Customer id = %d, firstname = %s, lastname = %s, city = %s, gender = %s", 
				id, firstname, lastname, city, gender);
		return info;
	}
	
	public static void main(String[] args) {
		Customer cust = new Customer(1, "Jack", "Johnson ", "California", "male");
		System.out.println(cust.toString());
	}
}
*/

public class Customer{

	private long id;
	private String firstname;
	private String lastname;
	private String city;
	private String gender;

	public static class CustomerBuilder{
		private long id;
		private String firstname;
		private String lastname;
		private String city;
		private String gender;
		
		public CustomerBuilder(long id){
			this.id = id;
		}
		
		public CustomerBuilder firstName(String firstName){
			this.firstname = firstName;
			return this;
		}
		
		public CustomerBuilder lastName(String lastName){
			this.lastname = lastName;
			return this;
		}
		
		public CustomerBuilder atCity(String city){
			this.city = city;
			return this;
		}
		
		public CustomerBuilder gender(String gender){
			this.gender = gender;
			return this;
		}

		public Customer build(){
			Customer cust = new Customer();
			cust.id = this.id;
			cust.firstname = this.firstname;
			cust.lastname = this.lastname;
			cust.city = this.city;
			cust.gender = this.gender;
			return cust;
		}
		
	}
	
	@Override
	public String toString() {
		String info = String.format("Customer id = %d, firstname = %s, lastname = %s, city = %s, gender = %s", 
				id, firstname, lastname, city, gender);
		return info;
	}
	
	private Customer(){
	}
	
	public static void main(String[] args) {
		Customer cust = new CustomerBuilder(1).firstName("Jack").lastName("Johnson").atCity("Califonia")
															.gender("male").build();
		System.out.println(cust.toString());
	}
}