package com.capt.capteurs.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class MeasurementDTO {
    private String id;
    private LocalDateTime timestamp;
    private double value;
    private String deviceId;
    private String deviceName;
}
