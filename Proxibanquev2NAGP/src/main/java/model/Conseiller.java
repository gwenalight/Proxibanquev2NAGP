package model;

public class Conseiller {

	// attribut
	private Long idConseiller;
	private String name;
	private String firstName;

	//getter&setter
	public Long getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(Long idConseiller) {
		this.idConseiller = idConseiller;
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

	// constructor
	
	public Conseiller(Long idConseiller, String name, String firstName) {
		super();
		this.idConseiller = idConseiller;
		this.name = name;
		this.firstName = firstName;
	}

	public Conseiller() {
		super();
	}

	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", name=" + name + ", firstName=" + firstName + "]";
	}
	

}
