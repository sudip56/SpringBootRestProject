package com.haud.svalinn.ss7.protocol.service.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.haud.svalinn.ss7.protocol.service.dto.MapCodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.dto.Mtp3CodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.dto.SccpCodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.dto.TcapCodeLayerDTO;
import com.haud.svalinn.ss7.protocol.service.handler.IProtocolLayerService;
import com.haud.svalinn.ss7.protocol.service.utils.HeaderDetails;
import com.haud.svalinn.ss7.protocol.service.utils.RequestHeaderMetadata;

@RestController
@RequestMapping(value = "/layers")
@Validated
public class ProtocolLayerController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	IProtocolLayerService protocolLayerService;

	@Autowired
	private HeaderDetails headerDetails;

	@RequestMapping(value = "/healthCheck")
	public String healthCheck() {

		logger.info("APP-API : Server is Working fine");

		return "APP-API : Server is working fine";
	}

	/**
	 * This API is used to retrieve all the Protocol Layers & can be used for
	 * Sorting, Filtering & Pagination.
	 * 
	 * @param pageable
	 * @param name
	 * @param createdBy
	 * @param lastModifiedBy
	 * @param createdDate
	 * @param lastModifiedDate
	 * @param id
	 * @param deleted
	 * @return
	 */
	/*
	 * @GetMapping() public Page<ProtocolLayerDTO> getAllProtocolLayers(
	 * 
	 * @PageableDefault(page = 0, size = 20) @SortDefault.SortDefaults({
	 * 
	 * @SortDefault(sort = "id", direction = Sort.Direction.DESC) }) Pageable
	 * pageable,
	 * 
	 * @RequestParam(name = "name", required = false) String name,
	 * 
	 * @RequestParam(name = "createdBy", required = false) String createdBy,
	 * 
	 * @RequestParam(name = "lastModifiedBy", required = false) String
	 * lastModifiedBy,
	 * 
	 * @RequestParam(name = "createdDate", required = false, defaultValue = "0")
	 * long createdDate,
	 * 
	 * @RequestParam(name = "lastModifiedDate", required = false, defaultValue =
	 * "0") long lastModifiedDate,
	 * 
	 * @RequestParam(name = "id", defaultValue = "0", required = false) long id,
	 * 
	 * @RequestParam(name = "deleted", required = false) Integer deleted) {
	 * 
	 * logger.info("ProtocolLayerController : getAllProtocolLayers Called - GET");
	 * 
	 * try {
	 * 
	 * RequestHeaderMetadata requestHeaderMetadata = headerDetails.getDetails();
	 * 
	 * logger.info(ProtocolLogFormatter.PROTO_GET_ALL_LAYER_GET,
	 * requestHeaderMetadata.getUUID(), RECEIVED, requestHeaderMetadata.getURI(),
	 * requestHeaderMetadata.getRemoteAddress());
	 * 
	 * Page<ProtocolLayerDTO> layerDTOPage =
	 * protocolLayerService.findAllProtocolLayers(pageable, name, id,
	 * requestHeaderMetadata.getUUID(), createdBy, createdDate != 0 ? new
	 * Date(createdDate) : null, lastModifiedBy, lastModifiedDate != 0 ? new
	 * Date(lastModifiedDate) : null, deleted);
	 * 
	 * logger.info(ProtocolLogFormatter.PROTO_GET_ALL_LAYER_GET,
	 * requestHeaderMetadata.getUUID(), COMPLETED, requestHeaderMetadata.getURI(),
	 * requestHeaderMetadata.getRemoteAddress());
	 * 
	 * return layerDTOPage;
	 * 
	 * } catch (RestApiException e) {
	 * 
	 * try { throw new ResponseStatusException(e.getHttpStatus(), e.getMessage());
	 * 
	 * } catch (Exception ex) { throw new RestApiException(e.getErrorMessage(),
	 * e.getHttpStatus()); } } }
	 */

	
	/**
	 * This API is used to retrieve all the Mtp3Codes & can be used for
	 * Sorting, Filtering & Pagination.
	 * 
	 * @param pageable
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param lastModifiedBy
	 * @param createdDate
	 * @param lastModifiedDate
	 * @param id
	 * @param code
	 * @param deleted
	 * @return Page<Mtp3CodeLayerDTO>
	 * @throws Exception 
	 */
	
	@GetMapping("/mtp3codes")
	public Page<Mtp3CodeLayerDTO> getMtp3Codes(
			@PageableDefault(page = 0, size = 20) @SortDefault.SortDefaults({
					@SortDefault(sort = "id", direction = Sort.Direction.DESC) }) Pageable pageable,
			@RequestParam(name = "name", required = false) String name,
			@RequestParam(name = "description", required = false) String description,
			@RequestParam(name = "createdBy", required = false) String createdBy,
			@RequestParam(name = "lastModifiedBy", required = false) String lastModifiedBy,
			@RequestParam(name = "createdDate", required = false, defaultValue = "0") long createdDate,
			@RequestParam(name = "lastModifiedDate", required = false, defaultValue = "0") long lastModifiedDate,
			@RequestParam(name = "id", defaultValue = "0", required = false) long id,
			@RequestParam(name = "code", defaultValue = "0", required = false) long code,
			@RequestParam(name = "deleted", required = false) Integer deleted, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		logger.info("ProtocolLayerController : getMtp3Codes Called - GET");

		try {

			RequestHeaderMetadata requestHeaderMetadata = headerDetails.getDetails();

			/*
			 * logger.info(ProtocolLogFormatter.PROTO_GET_ALL_LAYER_GET,
			 * requestHeaderMetadata.getUUID(), RECEIVED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 */

			Page<Mtp3CodeLayerDTO> Mtp3CodeLayerDTOPage = protocolLayerService.findAllMtp3Codes(pageable, name,description,id,code,
					requestHeaderMetadata.getUUID(), createdBy, createdDate != 0 ? new Date(createdDate) : null,
					lastModifiedBy, lastModifiedDate != 0 ? new Date(lastModifiedDate) : null, deleted);

			/*
			 * logger.info(ProtocolLogFormatter.PROTO_GET_ALL_LAYER_GET,
			 * requestHeaderMetadata.getUUID(), COMPLETED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 */

			return Mtp3CodeLayerDTOPage;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
		/*catch (RestApiException e) {

			try {
				throw new ResponseStatusException(e.getHttpStatus(), e.getMessage());

			} catch (Exception ex) {
				throw new RestApiException(e.getErrorMessage(), e.getHttpStatus());
			}
		}*/
		
		
		
	}
	
	/**
	 * This API is used to retrieve all the SccpCodes & can be used for
	 * Sorting, Filtering & Pagination.
	 * 
	 * @param pageable
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param lastModifiedBy
	 * @param createdDate
	 * @param lastModifiedDate
	 * @param id
	 * @param code
	 * @param deleted
	 * @return Page<SccpCodeLayerDTO>
	 * @throws Exception 
	 */
	@GetMapping("/sccpcodes")
	public Page<SccpCodeLayerDTO> getSccpCodes(
			@PageableDefault(page = 0, size = 20) @SortDefault.SortDefaults({
					@SortDefault(sort = "id", direction = Sort.Direction.DESC) }) Pageable pageable,
			@RequestParam(name = "name", required = false) String name,
			@RequestParam(name = "description", required = false) String description,
			@RequestParam(name = "createdBy", required = false) String createdBy,
			@RequestParam(name = "lastModifiedBy", required = false) String lastModifiedBy,
			@RequestParam(name = "createdDate", required = false, defaultValue = "0") long createdDate,
			@RequestParam(name = "lastModifiedDate", required = false, defaultValue = "0") long lastModifiedDate,
			@RequestParam(name = "id", defaultValue = "0", required = false) long id,
			@RequestParam(name = "code", defaultValue = "0", required = false) long code,
			@RequestParam(name = "deleted", required = false) Integer deleted, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		logger.info("ProtocolLayerController : getSccpCodes Called - GET");

		try {

			RequestHeaderMetadata requestHeaderMetadata = headerDetails.getDetails();

			/*
			 * logger.info(ProtocolLogFormatter.PROTO_GET_ALL_LAYER_GET,
			 * requestHeaderMetadata.getUUID(), RECEIVED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 */

			Page<SccpCodeLayerDTO> SccpCodeLayerDTOPage = protocolLayerService.findAllSccpCodes(pageable, name,description,id,code,
					requestHeaderMetadata.getUUID(), createdBy, createdDate != 0 ? new Date(createdDate) : null,
					lastModifiedBy, lastModifiedDate != 0 ? new Date(lastModifiedDate) : null, deleted);

			/*
			 * logger.info(ProtocolLogFormatter.PROTO_GET_ALL_LAYER_GET,
			 * requestHeaderMetadata.getUUID(), COMPLETED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 */

			return SccpCodeLayerDTOPage;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
		/*catch (RestApiException e) {

			try {
				throw new ResponseStatusException(e.getHttpStatus(), e.getMessage());

			} catch (Exception ex) {
				throw new RestApiException(e.getErrorMessage(), e.getHttpStatus());
			}
		}*/
	}
	
	/**
	 * This API is used to retrieve all the TcapCodes & can be used for
	 * Sorting, Filtering & Pagination.
	 * 
	 * @param pageable
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param lastModifiedBy
	 * @param createdDate
	 * @param lastModifiedDate
	 * @param id
	 * @param code
	 * @param deleted
	 * @return Page<TcapCodeLayerDTO>
	 * @throws Exception 
	 */
	@GetMapping("/tcapcodes")
	public Page<TcapCodeLayerDTO> getTcapCodes(
			@PageableDefault(page = 0, size = 20) @SortDefault.SortDefaults({
					@SortDefault(sort = "id", direction = Sort.Direction.DESC) }) Pageable pageable,
			@RequestParam(name = "name", required = false) String name,
			@RequestParam(name = "description", required = false) String description,
			@RequestParam(name = "createdBy", required = false) String createdBy,
			@RequestParam(name = "lastModifiedBy", required = false) String lastModifiedBy,
			@RequestParam(name = "createdDate", required = false, defaultValue = "0") long createdDate,
			@RequestParam(name = "lastModifiedDate", required = false, defaultValue = "0") long lastModifiedDate,
			@RequestParam(name = "id", defaultValue = "0", required = false) long id,
			@RequestParam(name = "code", defaultValue = "0", required = false) long code,
			@RequestParam(name = "deleted", required = false) Integer deleted, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		logger.info("ProtocolLayerController : getTcapCodes Called - GET");

		try {

			RequestHeaderMetadata requestHeaderMetadata = headerDetails.getDetails();

			/*
			 * logger.info(ProtocolLogFormatter.PROTO_GET_ALL_LAYER_GET,
			 * requestHeaderMetadata.getUUID(), RECEIVED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 */

			Page<TcapCodeLayerDTO> TcapCodeLayerDTOPage = protocolLayerService.findAllTcapCodes(pageable, name,description,id,code,
					requestHeaderMetadata.getUUID(), createdBy, createdDate != 0 ? new Date(createdDate) : null,
					lastModifiedBy, lastModifiedDate != 0 ? new Date(lastModifiedDate) : null, deleted);

			/*
			 * logger.info(ProtocolLogFormatter.PROTO_GET_ALL_LAYER_GET,
			 * requestHeaderMetadata.getUUID(), COMPLETED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 */

			return TcapCodeLayerDTOPage;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
		/*catch (RestApiException e) {

			try {
				throw new ResponseStatusException(e.getHttpStatus(), e.getMessage());

			} catch (Exception ex) {
				throw new RestApiException(e.getErrorMessage(), e.getHttpStatus());
			}
		}*/
	}
	
	/**
	 * This API is used to retrieve all the MapCodes & can be used for
	 * Sorting, Filtering & Pagination.
	 * 
	 * @param pageable
	 * @param name
	 * @param description
	 * @param createdBy
	 * @param lastModifiedBy
	 * @param createdDate
	 * @param lastModifiedDate
	 * @param id
	 * @param code
	 * @param familyName
	 * @param category
	 * @param deleted
	 * @return Page<MapCodeLayerDTO>
	 * @throws Exception 
	 */
	@GetMapping("/mapcodes")
	public Page<MapCodeLayerDTO> getMapCodes(
			@PageableDefault(page = 0, size = 20) @SortDefault.SortDefaults({
					@SortDefault(sort = "id", direction = Sort.Direction.DESC) }) Pageable pageable,
			@RequestParam(name = "name", required = false) String name,
			@RequestParam(name = "description", required = false) String description,
			@RequestParam(name = "createdBy", required = false) String createdBy,
			@RequestParam(name = "lastModifiedBy", required = false) String lastModifiedBy,
			@RequestParam(name = "createdDate", required = false, defaultValue = "0") long createdDate,
			@RequestParam(name = "lastModifiedDate", required = false, defaultValue = "0") long lastModifiedDate,
			@RequestParam(name = "id", defaultValue = "0", required = false) long id,
			@RequestParam(name = "code", defaultValue = "0", required = false) long code,
			@RequestParam(name = "familyName", defaultValue = "0", required = false) String familyName,
			@RequestParam(name = "category", defaultValue = "0", required = false) long category,
			@RequestParam(name = "deleted", required = false) Integer deleted, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		logger.info("ProtocolLayerController : getMapCodes Called - GET");

		try {

			RequestHeaderMetadata requestHeaderMetadata = headerDetails.getDetails();

			/*
			 * logger.info(ProtocolLogFormatter.PROTO_GET_ALL_LAYER_GET,
			 * requestHeaderMetadata.getUUID(), RECEIVED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 */

			Page<MapCodeLayerDTO> MapCodeLayerDTOPage = protocolLayerService.findAllMapCodes(pageable, name,description,id,code,
					requestHeaderMetadata.getUUID(), createdBy, createdDate != 0 ? new Date(createdDate) : null,
					lastModifiedBy, lastModifiedDate != 0 ? new Date(lastModifiedDate) : null, deleted,familyName,category);

			/*
			 * logger.info(ProtocolLogFormatter.PROTO_GET_ALL_LAYER_GET,
			 * requestHeaderMetadata.getUUID(), COMPLETED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 */

			return MapCodeLayerDTOPage;

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
		/*catch (RestApiException e) {

			try {
				throw new ResponseStatusException(e.getHttpStatus(), e.getMessage());

			} catch (Exception ex) {
				throw new RestApiException(e.getErrorMessage(), e.getHttpStatus());
			}
		}*/
	}
}
