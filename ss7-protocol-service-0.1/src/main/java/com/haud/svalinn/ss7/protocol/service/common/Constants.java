package com.haud.svalinn.ss7.protocol.service.common;

public class Constants {

    private Constants() {
        super();
    }

    public static final String ERR_MSG_NOT_FOUND = " Not Found";
    public static final String ERR_MSG_NAME_EXISTS = " name is not allowed";
    public static final String ERR_MSG_ELEMENT_IP_ADDRESS_MISSING = "Element Ip address can not be null";
    public static final String ERR_MSG_ELEMENT_IP_PORT_MISSING = "Element Ip port can not be null";

    public static final String ERR_MSG_DELETE = " cannot be deleted as mapping exist with ";

    public static final String ERR_INTERNAL_SERVER_ERROR = "Something went wrong";
    public static final String ERR_DELETE = "Ids not found ";
    public static final String LOG_ASSOCIATION = "association";
    public static final String LOG_ASSOCIATIONGROUP = "associationgroup";
    public static final String LOG_ELEMENT = "element";
    public static final String LOG_ELEMENTGROUP = "elementgroup";
    public static final String LOG_ELEMENTIP = "elementip";
    public static final String LOG_ELEMENTTYPE = "elementtype";
    public static final String LOG_MSG_UUID = "UUID [{}] recevied request on [{}] from remote IP [{}] To Create Application ID [{}]";
    public static final String LOG_MSG_UID = "UUID [{}] recevied request on [{}] from remote IP [{}] ";
    public static final String LOG_RETURNING_RESPONSE = "Request UUID :[{}] returning response ";
    public static final String LOG_INPUT_SIZE ="Request UUID : [{}] input size exceeds {}  changing to default {}";
    public static final String LOG_INPUT_PAGE="Request UUID : [{}] input pageno exceeds {}  changing to default {}";
    public static final String LOG_ENTITY_SAVED="Request UUID : [{}] entity saved ";
    public static final String LOG_ENTITY_NAME_EXISTS="Request UUID : [{}] entity name already exists {}  returning error: {}";
    public static final String LOG_RECORD_NOT_EXISTS="Request UUID : [{}] entity does not exist {}  returning error: {}";
    public static final String LOG_SERVER_ERROR="Request UUID : [{}] SERVER ERROR : {}";

}
