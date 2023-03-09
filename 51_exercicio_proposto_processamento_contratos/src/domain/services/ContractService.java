package domain.services;

import java.time.LocalDate;

import domain.entities.Contract;
import domain.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {

		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {

		double valueInstallment = contract.getTotalValue() / months;

		LocalDate date = contract.getDate();

		for (int i = 0; i < months; i++) {
			date = date.plusMonths(1);

			double fees = onlinePaymentService.paymentFee(valueInstallment * (i + 1)) + valueInstallment;
			double taxMonth = onlinePaymentService.interest(fees, (i + 1));

			double totalTax = fees + taxMonth;

			Installment installment = new Installment(date, totalTax);
			contract.getInstallment().add(installment);
		}

	}
}
