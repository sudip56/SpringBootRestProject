package com.haud.svalinn.ss7.protocol.service.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProtocolGroupDTO extends BaseDTO {

    private long id;

    @NotNull(message = "ProtocolGroup name can not be null")
    @Size(min = 3, max = 100, message = "ProtocolGroup name should be between {min} and {max} chars")
    private String name;


}
