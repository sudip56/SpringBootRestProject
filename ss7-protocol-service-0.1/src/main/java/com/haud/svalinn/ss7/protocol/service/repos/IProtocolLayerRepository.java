package com.haud.svalinn.ss7.protocol.service.repos;

import com.haud.svalinn.ss7.protocol.service.entities.ProtocolLayer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IProtocolLayerRepository extends JpaRepository<ProtocolLayer, Long> {

    Page<ProtocolLayer> findAll(Specification<ProtocolLayer> protocolLayerSpecification, Pageable pageable);

}
