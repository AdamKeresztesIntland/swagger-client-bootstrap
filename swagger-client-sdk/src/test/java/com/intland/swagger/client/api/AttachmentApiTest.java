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
import com.intland.swagger.client.model.Attachment;
import com.intland.swagger.client.model.BadRequestException;
import java.io.File;
import com.intland.swagger.client.model.ModelAndView;
import com.intland.swagger.client.model.ResourceForbiddenException;
import com.intland.swagger.client.model.ResourceNotFoundException;
import com.intland.swagger.client.model.ResourceUnauthorizedException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AttachmentApi
 */
@Ignore
public class AttachmentApiTest {

    private final AttachmentApi api = new AttachmentApi();

    
    /**
     * Deletes an attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAttachmentTest() throws ApiException {
        Integer attachmentId = null;
        api.deleteAttachment(attachmentId);

        // TODO: test validations
    }
    
    /**
     * Get attachment by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttachmentTest() throws ApiException {
        Integer attachmentId = null;
        Integer version = null;
        Attachment response = api.getAttachment(attachmentId, version);

        // TODO: test validations
    }
    
    /**
     * Get content of an attachment by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttachmentContentTest() throws ApiException {
        Integer attachmentId = null;
        Integer version = null;
        File response = api.getAttachmentContent(attachmentId, version);

        // TODO: test validations
    }
    
    /**
     * Returns the change history of the specified attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttachmentHistoryTest() throws ApiException {
        Integer attachmentId = null;
        Integer page = null;
        Integer pageSize = null;
        ArtifactRevisionSearchResult response = api.getAttachmentHistory(attachmentId, page, pageSize);

        // TODO: test validations
    }
    
    /**
     * Restore attachment to previous version
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void restoreAttachmentTest() throws ApiException {
        Integer attachmentId = null;
        Integer version = null;
        Attachment response = api.restoreAttachment(attachmentId, version);

        // TODO: test validations
    }
    
    /**
     * Update attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAttachmentTest() throws ApiException {
        Integer attachmentId = null;
        String description = null;
        String descriptionFormat = null;
        File content = null;
        Attachment response = api.updateAttachment(attachmentId, description, descriptionFormat, content);

        // TODO: test validations
    }
    
}
