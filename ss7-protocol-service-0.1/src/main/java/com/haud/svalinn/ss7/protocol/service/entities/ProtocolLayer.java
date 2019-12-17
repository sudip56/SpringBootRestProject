package com.haud.svalinn.ss7.protocol.service.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ProtocolLayer extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = "BIGINT")
    private long id;

    @NotNull(message = "Layer name can not be null")
    @Size(min = 3, max = 100, message = "Layer name should be between {min} and {max} chars")
    @Column(nullable = false, unique = true)
    private String name;

}
