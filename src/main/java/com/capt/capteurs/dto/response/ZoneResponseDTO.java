package com.capt.capteurs.dto.response;

import com.capt.capteurs.dto.DeviceDTO;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import java.util.List;


@Data
@Builder
public class ZoneResponseDTO {

    @NotNull(message = "Zone ID cannot be null")
    private String id;

    @NotNull(message = "Zone name cannot be null")
    private String name;

    @NotNull(message = "Zone type cannot be null")
    private String type;

    @NotNull(message = "Zone location cannot be null")
    private String location;

    private List<DeviceDTO> devices;
}