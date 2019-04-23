package model;

public class Conseiller {

	// attribut
	private Long idConseiller;
	private String login;
	private String password;
	private String name;
	private String firstName;

	// getter&setter
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// constructor

	public Conseiller() {
		super();
	}

	public Conseiller(Long idConseiller, String name, String firstName) {
		super();
		this.idConseiller = idConseiller;
		this.name = name;
		this.firstName = firstName;
	}

	public Conseiller(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", name=" + name + ", firstName=" + firstName + "]";
	}

}
