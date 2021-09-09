package com.jassuncao.docmap.domain.attribute;


import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author jonathas.assuncao - jaa020399@gmail.com
 * 09/09/2021
 */

@Service
public class AttributeUseCase {

    private final AttributeEntityRepository attributeEntityRepository;
    private final AttributeRelationshipRepository attributeRelationshipRepository;

    public AttributeUseCase(AttributeEntityRepository attributeEntityRepository, AttributeRelationshipRepository attributeRelationshipRepository) {
        this.attributeEntityRepository = attributeEntityRepository;
        this.attributeRelationshipRepository = attributeRelationshipRepository;
    }

    public Attribute create(AttributeData data) {
        return null;
    }

    public Attribute update(UUID id, AttributeData data) {
        return null;
    }

    public Attribute delete(UUID id) {
        return null;
    }
}
