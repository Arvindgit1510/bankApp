package code.microsystem.dto;

import code.microsystem.entity.PassangerInfo;
import code.microsystem.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {

	private PassangerInfo passangerInfo;
	private PaymentInfo paymentInfo;
}
