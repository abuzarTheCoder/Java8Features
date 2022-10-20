package test;

public class Customer {
	
	int id; 
	String name;
	

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
 
		Customer customer1 = new Customer( 101, "abc");
	//	System.out.println(customer1);
		Customer customer2 = new Customer( 102, null);
   //  System.out.println(customer2.getName());
        
                   String name = customer2.getName() ; 
                   System.out.println(name.toUpperCase());
		
		
		
	}

}
