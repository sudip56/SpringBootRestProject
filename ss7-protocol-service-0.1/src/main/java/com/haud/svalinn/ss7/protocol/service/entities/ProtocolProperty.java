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
public class ProtocolProperty extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = "BIGINT")
    private long id;

    @NotNull(message = "Name can not be null")
    @Size(min = 3, max = 100, message = "Name should be between {min} and {max} chars")
    @Column(nullable = false, unique = true)
    private String name;

    @NotNull(message = "Value can not be null")
    @Size(min = 3, max = 45, message = "Value should be between {min} and {max} chars")
    @Column(nullable = false, unique = true)
    private String value;

    @ManyToOne
    @JoinColumn(name = "protocol_id")
    private Protocol protocol;

    @ManyToOne
    @JoinColumn(name = "tcap_id")
    private TcapCodeLayer tcapCodeLayer;

    @ManyToOne
    @JoinColumn(name = "sccp_id")
    private SccpCodeLayer sccpCodeLayer;

    @ManyToOne
    @JoinColumn(name = "mtp3_id")
    private Mtp3CodeLayer mtp3CodeLayer;

    @ManyToOne
    @JoinColumn(name = "map_id")
    private MapCodeLayer mapCodeLayer;




}
