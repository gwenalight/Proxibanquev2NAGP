package model;

public class OperationBancaire {

	private Long idOperation;
	private String operationDate;
	private double montant;

	public OperationBancaire() {
		super();
	}

	public OperationBancaire(Long idOperation, String operationDate, double montant) {
		super();
		this.idOperation = idOperation;
		this.operationDate = operationDate;
		this.montant = montant;
	}

	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}

	public String getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "OperationBancaire [idOperation=" + idOperation + ", operationDate=" + operationDate + ", montant="
				+ montant + "]";
	}

}
