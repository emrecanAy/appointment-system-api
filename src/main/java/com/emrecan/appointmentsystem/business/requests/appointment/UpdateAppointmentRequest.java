package com.emrecan.appointmentsystem.business.requests.appointment;

import java.time.LocalDateTime;
import java.util.List;

import com.emrecan.appointmentsystem.entities.CareService;
import com.emrecan.appointmentsystem.entities.enums.Status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAppointmentRequest {

	private String appointmentId;
	private String customerId;
	private String staffId;
	private LocalDateTime appointmentDate;
	private Status status;
	private List<CareService> careServices;
	private String note;
}
