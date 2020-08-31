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

import com.intland.swagger.client.ApiCallback;
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.ApiResponse;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.Pair;
import com.intland.swagger.client.ProgressRequestBody;
import com.intland.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.intland.swagger.client.model.AttachmentMigrationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigrationApi {
    private ApiClient localVarApiClient;

    public MigrationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MigrationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for migrateAttachments
     * @param attachmentMigrationRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call migrateAttachmentsCall(AttachmentMigrationRequest attachmentMigrationRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = attachmentMigrationRequest;

        // create path and map variables
        String localVarPath = "/v3/migration/attachment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call migrateAttachmentsValidateBeforeCall(AttachmentMigrationRequest attachmentMigrationRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = migrateAttachmentsCall(attachmentMigrationRequest, _callback);
        return localVarCall;

    }

    /**
     * Migrate attachments
     * An endpoint for migrating attachments from a preconfigured source directory.
     * @param attachmentMigrationRequest  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void migrateAttachments(AttachmentMigrationRequest attachmentMigrationRequest) throws ApiException {
        migrateAttachmentsWithHttpInfo(attachmentMigrationRequest);
    }

    /**
     * Migrate attachments
     * An endpoint for migrating attachments from a preconfigured source directory.
     * @param attachmentMigrationRequest  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> migrateAttachmentsWithHttpInfo(AttachmentMigrationRequest attachmentMigrationRequest) throws ApiException {
        okhttp3.Call localVarCall = migrateAttachmentsValidateBeforeCall(attachmentMigrationRequest, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Migrate attachments (asynchronously)
     * An endpoint for migrating attachments from a preconfigured source directory.
     * @param attachmentMigrationRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call migrateAttachmentsAsync(AttachmentMigrationRequest attachmentMigrationRequest, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = migrateAttachmentsValidateBeforeCall(attachmentMigrationRequest, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
