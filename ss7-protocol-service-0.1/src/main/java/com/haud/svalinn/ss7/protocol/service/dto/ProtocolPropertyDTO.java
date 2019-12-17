package com.haud.svalinn.ss7.protocol.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProtocolPropertyDTO extends BaseDTO {

    private long id;

    @NotNull(message = "Name can not be null")
    @Size(min = 3, max = 100, message = "Name should be between {min} and {max} chars")
    private String name;

    @NotNull(message = "Value can not be null")
    @Size(min = 3, max = 45, message = "Value should be between {min} and {max} chars")
    private String value;

    private long protocolId;

    @JsonProperty("sccpLayer")
    private SccpCodeLayerDTO layerSCCPDTO;

    @JsonProperty("mtp3Layer")
    private Mtp3CodeLayerDTO layerMTP3DTO;

    @JsonProperty("tcapLayer")
    private TcapCodeLayerDTO layerTCAPDTO;

    @JsonProperty("mapLayer")
    private MapCodeLayerDTO layerMAPDTO;


}
