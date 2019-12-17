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
public class MapCodeLayer extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = "BIGINT")
    private long id;

    @NotNull(message = "Name can not be null")
    @Size(min = 3, max = 100, message = "Name should be between {min} and {max} chars")
    @Column(nullable = false, unique = true)
    private String name;

    @NotNull(message = "Description can not be null")
    @Size(min = 3, max = 1000, message = "Description should be between {min} and {max} chars")
    @Column(nullable = false)
    private String description;

    @NotNull(message = "Code can not be null")
    @Column(nullable = false, columnDefinition = "BIGINT")
    private long code;

    @NotNull(message = "Category can not be null")
    @Column(nullable = false, columnDefinition = "BIGINT")
    private long category;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "family_id")
    private MapFamily mapFamily;



}
