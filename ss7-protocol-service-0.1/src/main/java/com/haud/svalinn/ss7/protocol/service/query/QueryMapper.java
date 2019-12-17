package com.haud.svalinn.ss7.protocol.service.query;

import com.haud.svalinn.ss7.protocol.service.entities.ProtocolLayer;
import com.haud.svalinn.ss7.protocol.service.utils.DateUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.data.jpa.domain.Specification.where;

public class QueryMapper {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private QueryMapper() {
        super();
    }

    public static Specification<ProtocolLayer> protocolLayerByKeyword(String name, String description,String createdBy, long id, Date createdDate, String lastModifiedBy,
                                                                      Date lastModifiedDate, Integer deleted,String family,long category) {

        return where(protocolLayer(name, description, createdBy, id, createdDate, lastModifiedBy, lastModifiedDate, deleted,family,category));

    }

    public static Specification<ProtocolLayer> protocolLayer(String name, String description, String createdBy,long id, Date createdDate, String lastModifiedBy,
                                                             Date lastModifiedDate, Integer deleted,String family,long category) {

        return (Root<ProtocolLayer> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {

            List<Predicate> predicateList = new ArrayList<>();

            if (StringUtils.hasText(name)) {
                predicateList.add(cb.and(cb.like(root.get("name"), "%" + name + "%")));
            }

            if (StringUtils.hasText(description)) {
                predicateList.add(cb.and(cb.like(root.get("description"), "%" + description + "%")));
            }
            if (StringUtils.hasText(family)) {
                predicateList.add(cb.and(cb.like(root.get("family"), "%" + family + "%")));
            }
            if (category > 0) {
                predicateList.add(cb.and(cb.equal(root.get("category"), category)));
            }

            predicateList = basePredicate(root, createdDate, lastModifiedBy, lastModifiedDate, createdBy, deleted, predicateList, cb, id);

            return cb.and(predicateList.toArray(new Predicate[predicateList.size()]));
        };
    }

    public static List<Predicate> basePredicate(Root<?> root, Date createdDate, String lastModifiedBy, Date lastModifiedDate, String createdBy, Integer deleted,
                                                List<Predicate> predicateList, CriteriaBuilder cb, long id) {

        if (StringUtils.hasText(lastModifiedBy)) {
            predicateList.add(cb.and(cb.like(root.get("lastModifiedBy"), "%" + lastModifiedBy + "%")));
        }

        if (lastModifiedDate != null) {
            predicateList.add(cb.and(cb.between(root.get("lastModifiedDate"),  DateUtility.getStartDate(lastModifiedDate), DateUtility.getEndDate(lastModifiedDate))));
        }

        if (createdDate != null) {
            predicateList.add(cb.and(cb.between(root.get("createdDate"),  DateUtility.getStartDate(createdDate), DateUtility.getEndDate(createdDate))));
        }

        if (StringUtils.hasText(createdBy)) {
            predicateList.add(cb.and(cb.like(root.get("createdBy"), "%" + createdBy + "%")));
        }

        if (id > 0) {
            predicateList.add(cb.and(cb.equal(root.get("id"), id)));
        }

        if (deleted != null)
            predicateList.add(cb.and(cb.equal(root.get("deleted"), deleted)));

        return predicateList;
    }

}
