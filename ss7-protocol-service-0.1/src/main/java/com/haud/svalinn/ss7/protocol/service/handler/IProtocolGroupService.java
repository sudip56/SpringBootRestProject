package com.haud.svalinn.ss7.protocol.service.handler;

import com.haud.svalinn.ss7.protocol.service.dto.ProtocolGroupDTO;

public interface IProtocolGroupService {

    ProtocolGroupDTO saveProtocolGroup(ProtocolGroupDTO protocolGroupDTO, String uuid);

    ProtocolGroupDTO findProtocolGroupById(long id, String uuid);

}
