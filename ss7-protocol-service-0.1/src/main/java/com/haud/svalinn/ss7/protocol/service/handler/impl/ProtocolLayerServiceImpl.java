package com.haud.svalinn.ss7.protocol.service.handler.impl;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.haud.svalinn.ss7.protocol.service.common.Constants;
import com.haud.svalinn.ss7.protocol.service.dto.MapCodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.dto.Mtp3CodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.dto.SccpCodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.dto.TcapCodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.entities.ProtocolLayer;
import com.haud.svalinn.ss7.protocol.service.handler.IProtocolLayerService;
import com.haud.svalinn.ss7.protocol.service.query.QueryMapper;
import com.haud.svalinn.ss7.protocol.service.repos.IProtocolLayerRepository;

@Service
public class ProtocolLayerServiceImpl implements IProtocolLayerService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	IProtocolLayerRepository protocolLayerRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public Page<Mtp3CodeLayerDTO> findAllMtp3Codes(Pageable pageable, String name, String description, long id,
			long code, String uuid, String createdBy, Date createdDate, String lastModifiedBy, Date lastModifiedDate,
			Integer deleted) throws Exception {
		logger.info("ProtocolLayerServiceImpl : findAllProtocolLayers Called");

		try {

			Specification<ProtocolLayer> protocolLayerSpecification = QueryMapper.protocolLayerByKeyword(name,
					description, createdBy, id, createdDate, lastModifiedBy, lastModifiedDate, deleted,null,0l);

			Page<ProtocolLayer> protocolLayerPage = protocolLayerRepository.findAll(protocolLayerSpecification,
					pageable);

			Page<Mtp3CodeLayerDTO> Mtp3CodeLayerDTOPage = (Page<Mtp3CodeLayerDTO>) modelMapper.map(protocolLayerPage,
					Page.class);

			logger.info(Constants.LOG_RETURNING_RESPONSE, uuid);

			return Mtp3CodeLayerDTOPage;

		} catch (Exception ex) {

			logger.error("Request UUID : [{}] ERROR [{}]", uuid, ex);
			// throw new RestApiException(Constants.ERR_INTERNAL_SERVER_ERROR,
			// HttpStatus.INTERNAL_SERVER_ERROR);
			throw new Exception(Constants.ERR_INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public Page<SccpCodeLayerDTO> findAllSccpCodes(Pageable pageable, String name, String description, long id,
			long code, String uuid, String createdBy, Date createdDate, String lastModifiedBy, Date lastModifiedDate,
			Integer deleted) throws Exception {

		logger.info("ProtocolLayerServiceImpl : findAllProtocolLayers Called");

		try {

			Specification<ProtocolLayer> protocolLayerSpecification = QueryMapper.protocolLayerByKeyword(name,
					description, createdBy, id, createdDate, lastModifiedBy, lastModifiedDate, deleted,null,0l);

			Page<ProtocolLayer> protocolLayerPage = protocolLayerRepository.findAll(protocolLayerSpecification,
					pageable);

			Page<SccpCodeLayerDTO> SccpCodeLayerDTOPage = (Page<SccpCodeLayerDTO>) modelMapper.map(protocolLayerPage,
					Page.class);

			logger.info(Constants.LOG_RETURNING_RESPONSE, uuid);

			return SccpCodeLayerDTOPage;

		} catch (Exception ex) {

			logger.error("Request UUID : [{}] ERROR [{}]", uuid, ex);
			// throw new RestApiException(Constants.ERR_INTERNAL_SERVER_ERROR,
			// HttpStatus.INTERNAL_SERVER_ERROR);
			throw new Exception(Constants.ERR_INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public Page<TcapCodeLayerDTO> findAllTcapCodes(Pageable pageable, String name, String description, long id,
			long code, String uuid, String createdBy, Date createdDate, String lastModifiedBy, Date lastModifiedDate,
			Integer deleted) throws Exception {
		
		logger.info("ProtocolLayerServiceImpl : findAllTcapCodes Called");

		try {

			Specification<ProtocolLayer> protocolLayerSpecification = QueryMapper.protocolLayerByKeyword(name,
					description, createdBy, id, createdDate, lastModifiedBy, lastModifiedDate, deleted,null,0l);

			Page<ProtocolLayer> protocolLayerPage = protocolLayerRepository.findAll(protocolLayerSpecification,
					pageable);

			Page<TcapCodeLayerDTO> TcapCodeLayerDTOPage = (Page<TcapCodeLayerDTO>) modelMapper.map(protocolLayerPage,
					Page.class);

			logger.info(Constants.LOG_RETURNING_RESPONSE, uuid);

			return TcapCodeLayerDTOPage;

		} catch (Exception ex) {

			logger.error("Request UUID : [{}] ERROR [{}]", uuid, ex);
			// throw new RestApiException(Constants.ERR_INTERNAL_SERVER_ERROR,
			// HttpStatus.INTERNAL_SERVER_ERROR);
			throw new Exception(Constants.ERR_INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public Page<MapCodeLayerDTO> findAllMapCodes(Pageable pageable, String name, String description, long id, long code,
			String uuid, String createdBy, Date createdDate, String lastModifiedBy, Date lastModifiedDate,
			Integer deleted, String familyName, long category) throws Exception {
		logger.info("ProtocolLayerServiceImpl : findAllMapCodes Called");

		try {

			Specification<ProtocolLayer> protocolLayerSpecification = QueryMapper.protocolLayerByKeyword(name,
					description, createdBy, id, createdDate, lastModifiedBy, lastModifiedDate, deleted,familyName,category);
			
			

			Page<ProtocolLayer> protocolLayerPage = protocolLayerRepository.findAll(protocolLayerSpecification,
					pageable);

			Page<MapCodeLayerDTO> MapCodeLayerDTOPage = (Page<MapCodeLayerDTO>) modelMapper.map(protocolLayerPage,
					Page.class);

			logger.info(Constants.LOG_RETURNING_RESPONSE, uuid);

			return MapCodeLayerDTOPage;

		} catch (Exception ex) {

			logger.error("Request UUID : [{}] ERROR [{}]", uuid, ex);
			// throw new RestApiException(Constants.ERR_INTERNAL_SERVER_ERROR,
			// HttpStatus.INTERNAL_SERVER_ERROR);
			throw new Exception(Constants.ERR_INTERNAL_SERVER_ERROR);
		}
	}
}

/*
 * @Override public Page<ProtocolLayerDTO> findAllProtocolLayers(Pageable
 * pageable, String name, long id, String uuid, String createdBy, Date
 * createdDate, String lastModifiedBy, Date lastModifiedDate, Integer deleted) {
 * 
 * logger.info("ProtocolLayerServiceImpl : findAllProtocolLayers Called");
 * 
 * try {
 * 
 * Specification<ProtocolLayer> protocolLayerSpecification =
 * QueryMapper.protocolLayerByKeyword(name, null, createdBy, id, createdDate,
 * lastModifiedBy, lastModifiedDate, deleted,null,0l);
 * 
 * Page<ProtocolLayer> protocolLayerPage =
 * protocolLayerRepository.findAll(protocolLayerSpecification, pageable);
 * 
 * Page<ProtocolLayerDTO> protocolLayerDTOPage = (Page<ProtocolLayerDTO>)
 * modelMapper.map(protocolLayerPage, Page.class);
 * 
 * logger.info(Constants.LOG_RETURNING_RESPONSE, uuid);
 * 
 * return protocolLayerDTOPage;
 * 
 * } catch (Exception ex) {
 * 
 * logger.error("Request UUID : [{}] ERROR [{}]", uuid, ex); throw new
 * RestApiException(Constants.ERR_INTERNAL_SERVER_ERROR,
 * HttpStatus.INTERNAL_SERVER_ERROR); } }
 * 
 * }
 */
