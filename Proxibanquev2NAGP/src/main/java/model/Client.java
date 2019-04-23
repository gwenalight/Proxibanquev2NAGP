package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;
	
	private String name;
	private String firstName;
	private String email;
	private String adress;
	private String postalCode;
	private String city;
	private String number;

	public Client() {
		super();
	}



	public Client(String name, String firstName) {
		super();
		this.name = name;
		this.firstName = firstName;
	}



	public Client(Long idClient, String name, String firstName, String email, String adress, String postalCode,
			String city, String number) {
		super();
		this.idClient = idClient;
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.adress = adress;
		this.postalCode = postalCode;
		this.city = city;
		this.number = number;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", name=" + name + ", firstName=" + firstName + ", email=" + email
				+ ", adress=" + adress + ", postalCode=" + postalCode + ", city=" + city + ", number=" + number + "]";
	}

}
