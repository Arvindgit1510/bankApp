package code.microsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import code.microsystem.dto.FlightBookingAcknowledgement;
import code.microsystem.dto.FlightBookingRequest;
import code.microsystem.exception.InsuficientAmounrException;
import code.microsystem.services.FlightBookingServices;

@RestController
public class FlightBookingController {
	@Autowired
	private FlightBookingServices service;

	@PostMapping("/booking")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request)
			throws InsuficientAmounrException {
		return service.bookFlightTicket(request);
	}
}
