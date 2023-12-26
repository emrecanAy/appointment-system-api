package com.emrecan.appointmentsystem.business.requests.staffConfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

/**
 * @author Emrecan
 * @created 26/12/2023 - 23:48
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateStaffConfigRequest {

    private String staffConfigId;
    private String staffId;
    private LocalTime startShiftHour;
    private LocalTime endShiftHour;
    private LocalTime breakHour;
    private int breakTime; //minutes
    private int slotSpacing; //minutes
}
