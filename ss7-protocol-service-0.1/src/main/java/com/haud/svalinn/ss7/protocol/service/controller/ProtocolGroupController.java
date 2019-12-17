
package com.haud.svalinn.ss7.protocol.service.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "/protocolgroup")

@Validated
public class ProtocolGroupController {

	/*
	 * private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 * 
	 * @Autowired IProtocolGroupService protocolGroupService;
	 * 
	 * @Autowired private HeaderDetails headerDetails;
	 * 
	 *//**
		 * This API is used to Create Protocol Group
		 * 
		 * @param protocolGroupDTO
		 * @return
		 *//*
			 * @PostMapping public ProtocolGroupDTO saveProtocolGroup(@Valid @RequestBody
			 * ProtocolGroupDTO protocolGroupDTO) {
			 * 
			 * logger.info("ProtocolGroupController : saveProtocolGroup Called - POST");
			 * 
			 * try {
			 * 
			 * RequestHeaderMetadata requestHeaderMetadata = headerDetails.getDetails();
			 * 
			 * logger.info(ProtocolLogFormatter.PROTO_SAVE_PROTOCOL_GROUP_POST,
			 * requestHeaderMetadata.getUUID(), RECEIVED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 * 
			 * protocolGroupDTO = protocolGroupService.saveProtocolGroup(protocolGroupDTO,
			 * requestHeaderMetadata.getUUID());
			 * 
			 * logger.info(ProtocolLogFormatter.PROTO_SAVE_PROTOCOL_GROUP_POST,
			 * requestHeaderMetadata.getUUID(), COMPLETED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 * 
			 * return protocolGroupDTO;
			 * 
			 * } catch (RestApiException e) {
			 * 
			 * try { throw new ResponseStatusException(e.getHttpStatus(), e.getMessage());
			 * 
			 * } catch (Exception ex) { throw new RestApiException(e.getErrorMessage(),
			 * e.getHttpStatus()); } } }
			 * 
			 * @GetMapping public Page<ProtocolGroupDTO> findGroup(
			 * 
			 * @PageableDefault(page = 0, size = 20) @SortDefault.SortDefaults({
			 * 
			 * @SortDefault(sort = "id", direction = Sort.Direction.DESC),
			 * 
			 * @SortDefault(sort = "name", direction = Sort.Direction.ASC) }) Pageable
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
			 * @RequestParam(name = "deleted", required = false) Integer deleted,
			 * HttpServletRequest request, HttpServletResponse response) {
			 * 
			 * 
			 * return null; }
			 * 
			 * @GetMapping("/{id}") public ProtocolGroupDTO
			 * findProtocolGroupById(@PathVariable long id) {
			 * 
			 * logger.info("ProtocolGroupController : findProtocolGroupById Called - POST");
			 * 
			 * try {
			 * 
			 * RequestHeaderMetadata requestHeaderMetadata = headerDetails.getDetails();
			 * 
			 * logger.info(ProtocolLogFormatter.PROTO_GET_PROTOCOL_GROUP_BY_ID_GET,
			 * requestHeaderMetadata.getUUID(), RECEIVED, requestHeaderMetadata.getURI(),
			 * requestHeaderMetadata.getRemoteAddress());
			 * 
			 * ProtocolGroupDTO protocolGroupDTO =
			 * protocolGroupService.findProtocolGroupById(id,
			 * requestHeaderMetadata.getUUID());
			 * 
			 * logger.info(ProtocolLogFormatter.PROTO_GET_PROTOCOL_GROUP_BY_ID_GET,
			 * requestHeaderMetadata.getUUID(), COMPLETED,
			 * requestHeaderMetadata.getURI(),requestHeaderMetadata.getRemoteAddress());
			 * 
			 * return protocolGroupDTO;
			 * 
			 * } catch (RestApiException e) {
			 * 
			 * try { throw new ResponseStatusException(e.getHttpStatus(), e.getMessage());
			 * 
			 * } catch (Exception ex) { throw new RestApiException(e.getErrorMessage(),
			 * e.getHttpStatus()); } } }
			 * 
			 * @PutMapping("/{id}") public ProtocolGroupDTO update(@PathVariable Long
			 * id, @Valid @RequestBody ProtocolGroupDTO protocolGroupDTO, HttpServletRequest
			 * request, HttpServletResponse response) {
			 * 
			 * return null; }
			 * 
			 * @DeleteMapping("/{id}")
			 * 
			 * @ApiResponses(value = { @ApiResponse(code = 404, message = "Not found") })
			 * 
			 * @ResponseStatus(HttpStatus.NO_CONTENT) public void delete(@PathVariable
			 * Long[] id, HttpServletRequest request, HttpServletResponse response) {
			 * 
			 * }
			 * 
			 * @PostMapping("/{id}/protocol/{protocolId}")
			 * 
			 * @ResponseStatus(HttpStatus.NO_CONTENT) public void
			 * saveProtocolGroupMapping(@PathVariable Long id, @PathVariable Long[]
			 * protocolId, HttpServletRequest request, HttpServletResponse response) {
			 * 
			 * }
			 * 
			 * @GetMapping("/{id}/protocol") public Set<ProtocolGroupDTO>
			 * findProtocolByProtocolGroupId(@PathVariable long id, HttpServletRequest
			 * request, HttpServletResponse response) {
			 * 
			 * return null; }
			 * 
			 * @DeleteMapping("/{id}/protocol/{protocolId}")
			 * 
			 * @ApiResponses(value = { @ApiResponse(code = 404, message = "Not found") })
			 * 
			 * @ResponseStatus(HttpStatus.NO_CONTENT) public void
			 * deleteProtocolGroupMapping(@PathVariable long id, @PathVariable Long[]
			 * protocolId, HttpServletRequest request, HttpServletResponse response) {
			 * 
			 * }
			 */
	
	
}
