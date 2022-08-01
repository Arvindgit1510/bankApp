package code.microsystem.services;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import code.microsystem.dto.FlightBookingAcknowledgement;
import code.microsystem.dto.FlightBookingRequest;
import code.microsystem.entity.PassangerInfo;
import code.microsystem.entity.PaymentInfo;
import code.microsystem.exception.InsuficientAmounrException;
import code.microsystem.repositroy.PassenegerInforepositroy;
import code.microsystem.repositroy.PaymentInfoRepositroy;
import code.microsystem.utils.PaymentInfoUtil;

@Service
public class FlightBookingServices {

	@Autowired
	 private PassenegerInforepositroy passenegerInforepositroy;
	 
	@Autowired
	private PaymentInfoRepositroy paymentInfoRepositroy;
	
	@Transactional
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) throws InsuficientAmounrException {
		PassangerInfo passangerInfo=request.getPassangerInfo();
		passangerInfo=passenegerInforepositroy.save(passangerInfo);
		
		PaymentInfo paymentInfo=request.getPaymentInfo();
		
		PaymentInfoUtil.validateCreditLimits(paymentInfo.getAccountNo(), passangerInfo.getFare());
		paymentInfo.setPassengerId(passangerInfo.getPId());
		paymentInfo.setAmount(passangerInfo.getFare());
		paymentInfoRepositroy.save(paymentInfo);
		
		return new FlightBookingAcknowledgement("SUCCESS",passangerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passangerInfo);
		
	}
}
