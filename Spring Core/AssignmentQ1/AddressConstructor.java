package core_assignment;

public class AddressConstructor {
	
	private String street;
	private String city;
	private String state;
	private String country;
	private String zip;
	public AddressConstructor(String street, String city, String state, String country, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getZip() {
		return zip;
	}
}
