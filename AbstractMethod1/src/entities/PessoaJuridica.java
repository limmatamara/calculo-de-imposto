package entities;

public class PessoaJuridica extends Pessoa {
	Integer numberOfEmployees;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double taxCalculation() {
		double taxValue;
		taxValue = anualIncome * 0.1;
		if (numberOfEmployees > 10) {
			taxValue = anualIncome * 0.14;
		}
		return taxValue;
	}
	
}
