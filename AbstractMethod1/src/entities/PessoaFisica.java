package entities;

public class PessoaFisica extends Pessoa {
	Double healthCareExpenses;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double anualIncome, Double healthCareExpenses) {
		super(name, anualIncome);
		this.healthCareExpenses = healthCareExpenses;
	}
	
	public Double getHealthCareExpenses() {
		return healthCareExpenses;
	}

	public void setHealthCareExpenses(Double healthCareExpenses) {
		this.healthCareExpenses = healthCareExpenses;
	}

	@Override
	public double taxCalculation() {
		double taxValue = 0;
		if (anualIncome < 20000) {
			taxValue = anualIncome * 0.15;
			if (healthCareExpenses > 0) {
				taxValue = (anualIncome * 0.15) - (healthCareExpenses * 0.5);
			}
		}
		if (anualIncome >= 20000) {
			taxValue = anualIncome * 0.25;
			if (healthCareExpenses > 0) {
				taxValue = (anualIncome * 0.25) - (healthCareExpenses * 0.5);
			}
		}
		return taxValue;
	}
}
