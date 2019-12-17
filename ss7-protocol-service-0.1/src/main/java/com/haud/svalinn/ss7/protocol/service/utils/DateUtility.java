package com.haud.svalinn.ss7.protocol.service.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ResponseStatusException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {

    private static final Logger logger = LoggerFactory.getLogger(DateUtility.class);

    private static String format = "yyyy-MM-dd HH:mm:ss";

    private DateUtility() {
        super();
    }

    public static Date stringToDate(String date, String uuid) {

        SimpleDateFormat formatter = new SimpleDateFormat(format);

        if (StringUtils.hasText(date)) {

            try {

                logger.info("Request UUID : [{}] parsing string to date [{}]", uuid, date);
                return formatter.parse(date);

            } catch (ParseException e) {

                logger.error("Request UUID : [{}] got parse exception message [{}]", uuid, e);
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return null;
    }

    public static Date getStartDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date getEndDate(Date date) {


        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date);
        cal2.add(Calendar.DATE, 1);

        cal2.set(Calendar.HOUR_OF_DAY, 0);
        cal2.set(Calendar.MINUTE, 0);
        cal2.set(Calendar.SECOND, 0);
        cal2.set(Calendar.MILLISECOND, 0);
        return cal2.getTime();
    }



}
