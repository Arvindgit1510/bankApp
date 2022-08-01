package code.microsystem.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PassangerInfo")
public class PassangerInfo {
	@Id
	@GeneratedValue
	private Long pId;
	private String name;
	private String email;
	private String source;
	private String destination;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM-dd-yyyy")
	private Date travelDate;
	private String pickupTime;
	private String arrivalTime;
	private double fare;

}
