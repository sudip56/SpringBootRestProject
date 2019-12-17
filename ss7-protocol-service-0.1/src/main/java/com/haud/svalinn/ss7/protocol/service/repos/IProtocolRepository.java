package com.haud.svalinn.ss7.protocol.service.repos;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haud.svalinn.ss7.protocol.service.entities.Protocol;

@Repository
@Transactional
public interface IProtocolRepository extends JpaRepository<Protocol, Long> {

}
