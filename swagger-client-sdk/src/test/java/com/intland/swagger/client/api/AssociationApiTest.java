/*
 * codeBeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.intland.swagger.client.api;

import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.model.ArtifactRevisionSearchResult;
import com.intland.swagger.client.model.Association;
import com.intland.swagger.client.model.AssociationType;
import com.intland.swagger.client.model.ResourceForbiddenException;
import com.intland.swagger.client.model.ResourceNotFoundException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssociationApi
 */
@Ignore
public class AssociationApiTest {

    private final AssociationApi api = new AssociationApi();

    
    /**
     * Create a new association
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAssociationTest() throws ApiException {
        Association association = null;
        Association response = api.createAssociation(association);

        // TODO: test validations
    }
    
    /**
     * Delete association
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAssociationTest() throws ApiException {
        Integer associationId = null;
        api.deleteAssociation(associationId);

        // TODO: test validations
    }
    
    /**
     * Get an association by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAssociationTest() throws ApiException {
        Integer associationId = null;
        Association response = api.getAssociation(associationId);

        // TODO: test validations
    }
    
    /**
     * Returns the change history of the specified association
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAssociationHistoryTest() throws ApiException {
        Integer associationId = null;
        Integer page = null;
        Integer pageSize = null;
        ArtifactRevisionSearchResult response = api.getAssociationHistory(associationId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Get association type by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAssociationTypeTest() throws ApiException {
        Integer associationTypeId = null;
        AssociationType response = api.getAssociationType(associationTypeId);

        // TODO: test validations
    }
    
    /**
     * Get available association types
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAvailableAssociationTypesTest() throws ApiException {
        List<AssociationType> response = api.getAvailableAssociationTypes();

        // TODO: test validations
    }
    
    /**
     * Update association settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAssociationTest() throws ApiException {
        Integer associationId = null;
        Association association = null;
        Association response = api.updateAssociation(associationId, association);

        // TODO: test validations
    }
    
}
