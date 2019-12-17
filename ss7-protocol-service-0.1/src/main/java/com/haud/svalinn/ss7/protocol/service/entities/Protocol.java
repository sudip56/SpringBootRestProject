package com.haud.svalinn.ss7.protocol.service.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Protocol extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false, columnDefinition = "BIGINT")
    private long id;

    @NotNull(message = "Protocol name can not be null")
    @Size(min = 3, max = 100, message = "Protocol name should be between {min} and {max} chars")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "Protocol description can not be null")
    @Size(min = 3, max = 1000, message = "Protocol description should be between {min} and {max} chars")
    @Column(nullable = false)
    private String description;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "protocol_group_list", joinColumns = @JoinColumn(name = "protocol_id"), inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<ProtocolGroup> protocolGroupSet = new HashSet<ProtocolGroup>();

    @JsonIgnore
    @Transient
    List<Long> protocolGroupIds;


    @PostLoad
    private void postLoad() {
        protocolGroupIds = protocolGroupSet.stream().map(ProtocolGroup::getId).collect(Collectors.toList());
    }

    public static Map<String, String> getAllFields() {

        Map<String, String> validSort = new HashMap<String, String>();
        validSort.put("name", "name");
        validSort.put("id", "id");
        validSort.put("description", "description");
        validSort.put("deleted", "deleted");
        validSort.put("createdBy", "createdBy");
        validSort.put("lastModifiedBy", "lastModifiedBy");
        validSort.put("createdDate", "createdDate");
        validSort.put("lastModifiedDate", "lastModifiedDate");

        return validSort;

    }




}
