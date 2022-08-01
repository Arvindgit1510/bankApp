package code.microsystem.dto;

import code.microsystem.entity.PassangerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAcknowledgement {

	private String status;
	private double totalFare;
	private String pnrNo;
	private PassangerInfo passangerInfo;
}
