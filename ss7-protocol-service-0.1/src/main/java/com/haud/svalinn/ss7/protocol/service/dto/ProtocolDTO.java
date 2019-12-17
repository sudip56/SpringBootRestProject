package com.haud.svalinn.ss7.protocol.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProtocolDTO extends BaseDTO {

    private long id;

    @NotNull(message = "Protocol name can not be null")
    @Size(min = 3, max = 100, message = "Protocol name should be between {min} and {max} chars")
    private String name;

    @NotNull(message = "Protocol description can not be null")
    @Size(min = 3, max = 1000, message = "Protocol description should be between {min} and {max} chars")
    private String description;

    @JsonProperty("properties")
    @NotNull(message = "Protocol Property can not be null")
    private List<ProtocolPropertyDTO> protocolPropertyDTO;
}
