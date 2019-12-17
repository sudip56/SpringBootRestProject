package com.haud.svalinn.ss7.protocol.service.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class MapFamily extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = "BIGINT")
    private long id;

    @NotNull(message = "Name can not be null")
    @Size(min = 3, max = 100, message = "Name should be between {min} and {max} chars")
    @Column(nullable = false, unique = true)
    private String name;
    
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "mapFamily")
    public Set<MapCodeLayer> mapCodeLayerSet = new HashSet<MapCodeLayer>();

}
