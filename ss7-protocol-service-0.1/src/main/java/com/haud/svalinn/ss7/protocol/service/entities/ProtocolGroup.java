package com.haud.svalinn.ss7.protocol.service.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ProtocolGroup extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = "BIGINT")
    private long id;

    @NotNull(message = "ProtocolGroup name can not be null")
    @Size(min = 3, max = 100, message = "ProtocolGroup name should be between {min} and {max} chars")
    @Column(nullable = false, unique = true)
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "protocolGroupSet",cascade = CascadeType.ALL)
    private Set<Protocol> protocolSet = new HashSet<Protocol>();


    public long getId() {
        return id;
    }

    public ProtocolGroup setId(long id) {
        this.id = id;
        return this;
    }
}
