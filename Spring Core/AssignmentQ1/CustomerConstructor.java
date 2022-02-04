package core_assignment;

public class CustomerConstructor {
	
	private int customerId;
	private String customerName;
	private String customerContact;
	private AddressConstructor customerAddress;
	
	public CustomerConstructor(int customerId, String customerName, String customerContact,
			AddressConstructor customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerContact() {
		return customerContact;
	}
	
	public AddressConstructor getCustomerAddress() {
		return customerAddress;
	}

	public void customer() {
		System.out.println("CustomerID: "+ getCustomerId() + "\n" + "CustomerName: "+ getCustomerName() + "\n" + "CustomerContact: " + getCustomerContact() + "\n"  
		+ "Address: " + "Street: " + getCustomerAddress().getStreet() + "\n" + "City: " + getCustomerAddress().getCity() + "\n" +
		   "State:"+getCustomerAddress().getState()+"\n"
	    + "Country:" + getCustomerAddress().getCountry() + "\n" + "Zip:" + getCustomerAddress().getZip() + "\n");
	}
}
