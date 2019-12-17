package com.haud.svalinn.ss7.protocol.service.handler;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.haud.svalinn.ss7.protocol.service.dto.MapCodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.dto.Mtp3CodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.dto.SccpCodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.dto.TcapCodeLayerDTO;

public interface IProtocolLayerService {

	Page<Mtp3CodeLayerDTO> findAllMtp3Codes(Pageable pageable, String name, String description, long id, long code,
			String uuid, String createdBy, Date createdDate, String lastModifiedBy, Date lastModifiedDate,
			Integer deleted) throws Exception;

	Page<SccpCodeLayerDTO> findAllSccpCodes(Pageable pageable, String name, String description, long id, long code,
			String uuid, String createdBy, Date createdDate, String lastModifiedBy, Date lastModifiedDate,
			Integer deleted) throws Exception;

	Page<TcapCodeLayerDTO> findAllTcapCodes(Pageable pageable, String name, String description, long id, long code,
			String uuid, String createdBy, Date createdDate, String lastModifiedBy, Date lastModifiedDate,
			Integer deleted) throws Exception;

	Page<MapCodeLayerDTO> findAllMapCodes(Pageable pageable, String name, String description, long id, long code,
			String uuid, String createdBy, Date createdDate, String lastModifiedBy, Date lastModifiedDate,
			Integer deleted, String familyName, long category) throws Exception;

	/*
	 * Page<ProtocolLayerDTO> findAllProtocolLayers(Pageable pageable, String name,
	 * long id, String uuid, String createdBy, Date createdDate, String
	 * lastModifiedBy, Date lastModifiedDate, Integer deleted);
	 */

}
