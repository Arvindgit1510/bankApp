package code.microsystem.utils;

import java.util.HashMap;
import java.util.Map;

import code.microsystem.exception.InsuficientAmounrException;

public class PaymentInfoUtil {

	private static Map<String,Double> paymentMap=new HashMap<String,Double>();
	static {
		paymentMap.put("acc1", 12000.00);
		paymentMap.put("acc2", 11000.00);
		paymentMap.put("acc3", 10000.00);
		paymentMap.put("acc4", 8000.00);
	}
	public static boolean validateCreditLimits(String accno,double paidAmmount) throws InsuficientAmounrException {
		if(paidAmmount>paymentMap.get(accno)) {
			throw new InsuficientAmounrException("Insuficient Amount...");
		}else {
			return true;
		}
	}

	
}
