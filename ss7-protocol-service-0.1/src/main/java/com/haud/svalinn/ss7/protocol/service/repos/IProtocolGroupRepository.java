package com.haud.svalinn.ss7.protocol.service.repos;

import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haud.svalinn.ss7.protocol.service.entities.ProtocolGroup;

@Repository
@Transactional
public interface IProtocolGroupRepository extends JpaRepository<ProtocolGroup, Long> {

    Boolean existsByName(String name);

    Optional<ProtocolGroup> findByIdAndDeleted(long id, int deleted);
    
   
    Set<ProtocolGroup> findAllById(long id);

}
