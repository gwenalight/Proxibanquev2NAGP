package model;

public class CompteBancaire {

	private Long idCompte;
	private double sold;
	private String openDate;
	
	public CompteBancaire() {
		super();
	}
	public CompteBancaire(Long idCompte, double sold, String openDate) {
		super();
		this.idCompte = idCompte;
		this.sold = sold;
		this.openDate = openDate;
	}
	public Long getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}
	public double getSold() {
		return sold;
	}
	public void setSold(double sold) {
		this.sold = sold;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	@Override
	public String toString() {
		return "CompteBancaire [idCompte=" + idCompte + ", sold=" + sold + ", openDate=" + openDate + "]";
	}

}
