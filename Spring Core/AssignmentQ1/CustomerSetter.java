package core_assignment;

public class CustomerSetter {
	
	private int customerId;
	private String customerName;
	private String customerContact;
	private AddressSetter customerAddress;
	
	

	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public AddressSetter getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(AddressSetter customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void customer() {
		System.out.println("CustomerID: "+ getCustomerId() + "\n" + "CustomerName: "+ getCustomerName() + "\n" + "CustomerContact: " + getCustomerContact() + "\n"  
		+ "Address: " + "Street: " + getCustomerAddress().getStreet() + "\n" + "City: " + getCustomerAddress().getCity() + "\n" +
		   "State:"+getCustomerAddress().getState()+"\n"
	    + "Country:" + getCustomerAddress().getCountry() + "\n" + "Zip:" + getCustomerAddress().getZip() + "\n");
	}

	
	

}
