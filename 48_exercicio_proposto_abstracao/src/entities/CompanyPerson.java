package entities;

public class CompanyPerson extends Person {

	private Integer numberEmployees;

	public CompanyPerson() {
		super();
	}

	public CompanyPerson(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double tax() {
		
		double taxIncome = 0.0;

		if (getNumberEmployees() > 10) {
			taxIncome = getAnnualIncome() * 0.14;
		}
		else {
			taxIncome = getAnnualIncome() * 0.16;
		}
		return taxIncome;
	}

}
