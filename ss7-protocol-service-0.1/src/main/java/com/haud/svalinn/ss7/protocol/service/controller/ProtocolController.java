package com.haud.svalinn.ss7.protocol.service.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.haud.svalinn.ss7.protocol.service.dto.ProtocolDTO;
import com.haud.svalinn.ss7.protocol.service.entities.ProtocolGroup;
import com.haud.svalinn.ss7.protocol.service.repos.IProtocolGroupRepository;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/protocol")
@Validated
public class ProtocolController {
	
	@Autowired
	private IProtocolGroupRepository protocolGroupRepository;
	
    @PostMapping()
    public ProtocolDTO save(@Valid @RequestBody  HttpServletRequest request, HttpServletResponse response) {

        return null;
    }

    @GetMapping()
    public Page<ProtocolDTO> find(
            @PageableDefault(page = 0, size = 20) @SortDefault.SortDefaults({
                    @SortDefault(sort = "id", direction = Sort.Direction.DESC) }) Pageable pageable,
            @RequestParam(name = "name", required = false) String name,
            @RequestParam(name = "description", required = false) String description,
            @RequestParam(name = "createdBy", required = false) String createdBy,
            @RequestParam(name = "lastModifiedBy", required = false) String lastModifiedBy,
            @RequestParam(name = "createdDate", required = false, defaultValue = "0") long createdDate,
            @RequestParam(name = "lastModifiedDate", required = false, defaultValue = "0") long lastModifiedDate,
            @RequestParam(name = "id", defaultValue = "0", required = false) long id,
            @RequestParam(name = "deleted", required = false) Integer deleted, HttpServletRequest request, HttpServletResponse response) {

        return null;
    }

    @GetMapping("/{id}")
    public ProtocolDTO getProtocolByID(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) {

        return null;
    }

    @PutMapping("/{id}")
    public ProtocolDTO update(@PathVariable int id, @Valid @RequestBody ProtocolDTO protocolDTO, HttpServletRequest request,
                              HttpServletResponse response) {

        return null;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long[] id, HttpServletRequest request, HttpServletResponse response) {

    }

    @PostMapping("/{id}/protocolgroup/{protocolGroupId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
        public void saveProtocolChild(@PathVariable Long id, @PathVariable Long[] protocolGroupId, HttpServletRequest request,
                                     HttpServletResponse response) {

    	
    }

    @GetMapping("/{id}/protocolgroup")
    public Set<ProtocolGroup> findGroupsByProtocolId(@PathVariable long id, HttpServletRequest request,
                                                        HttpServletResponse response) {
    	return protocolGroupRepository.findAllById(id);
    }

    @DeleteMapping("/{id}/protocolgroup/{protocolGroupId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiResponses(value = { @ApiResponse(code = 404, message = "Not found") })
    public void deleteProtocolMapping(@PathVariable long id, @PathVariable Long[] protocolGroupId, HttpServletRequest request,
                                      HttpServletResponse response) {

    }

    }
