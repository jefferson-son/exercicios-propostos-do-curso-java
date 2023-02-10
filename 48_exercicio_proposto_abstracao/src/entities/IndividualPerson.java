package entities;

public class IndividualPerson extends Person {

	private Double healthExpenses;

	public IndividualPerson() {
		super();
	}

	public IndividualPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double tax() {
		
		double anualTax = 0.0;
		double healthTax = 0.0;
		
		if (getAnnualIncome() < 20000) {
			anualTax = getAnnualIncome() * 0.15;
		}
		else if (getAnnualIncome() > 20000){
			anualTax = getAnnualIncome() * 0.25;
		}
		if (healthExpenses > 0) {
			healthTax = healthExpenses * 0.50;
		}
		return anualTax - healthTax;
	}
}
