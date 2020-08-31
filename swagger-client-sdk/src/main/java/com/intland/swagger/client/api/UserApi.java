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


import com.intland.swagger.client.model.User;
import com.intland.swagger.client.model.UserFilteringRequest;
import com.intland.swagger.client.model.UserReferenceSearchResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserApi {
    private ApiClient localVarApiClient;

    public UserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getUser
     * @param userId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getUserCall(Integer userId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v3/users/{userId}"
            .replaceAll("\\{" + "userId" + "\\}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserValidateBeforeCall(Integer userId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUser(Async)");
        }
        

        okhttp3.Call localVarCall = getUserCall(userId, _callback);
        return localVarCall;

    }

    /**
     * Get user
     * 
     * @param userId  (required)
     * @return User
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public User getUser(Integer userId) throws ApiException {
        ApiResponse<User> localVarResp = getUserWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Get user
     * 
     * @param userId  (required)
     * @return ApiResponse&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<User> getUserWithHttpInfo(Integer userId) throws ApiException {
        okhttp3.Call localVarCall = getUserValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get user (asynchronously)
     * 
     * @param userId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getUserAsync(Integer userId, final ApiCallback<User> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserByEmail
     * @param email  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getUserByEmailCall(String email, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v3/users/findByEmail";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (email != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("email", email));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserByEmailValidateBeforeCall(String email, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling getUserByEmail(Async)");
        }
        

        okhttp3.Call localVarCall = getUserByEmailCall(email, _callback);
        return localVarCall;

    }

    /**
     * Get user by email address
     * 
     * @param email  (required)
     * @return User
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public User getUserByEmail(String email) throws ApiException {
        ApiResponse<User> localVarResp = getUserByEmailWithHttpInfo(email);
        return localVarResp.getData();
    }

    /**
     * Get user by email address
     * 
     * @param email  (required)
     * @return ApiResponse&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<User> getUserByEmailWithHttpInfo(String email) throws ApiException {
        okhttp3.Call localVarCall = getUserByEmailValidateBeforeCall(email, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get user by email address (asynchronously)
     * 
     * @param email  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getUserByEmailAsync(String email, final ApiCallback<User> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserByEmailValidateBeforeCall(email, _callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUserByName
     * @param name  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getUserByNameCall(String name, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v3/users/findByName";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserByNameValidateBeforeCall(String name, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getUserByName(Async)");
        }
        

        okhttp3.Call localVarCall = getUserByNameCall(name, _callback);
        return localVarCall;

    }

    /**
     * Get user by name
     * 
     * @param name  (required)
     * @return User
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public User getUserByName(String name) throws ApiException {
        ApiResponse<User> localVarResp = getUserByNameWithHttpInfo(name);
        return localVarResp.getData();
    }

    /**
     * Get user by name
     * 
     * @param name  (required)
     * @return ApiResponse&lt;User&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<User> getUserByNameWithHttpInfo(String name) throws ApiException {
        okhttp3.Call localVarCall = getUserByNameValidateBeforeCall(name, null);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get user by name (asynchronously)
     * 
     * @param name  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getUserByNameAsync(String name, final ApiCallback<User> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserByNameValidateBeforeCall(name, _callback);
        Type localVarReturnType = new TypeToken<User>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUsers
     * @param page Index of the result page starting from 1. (optional, default to 1)
     * @param pageSize Number of items in a result page. Max value: 500 (optional, default to 25)
     * @param groupId  (optional)
     * @param queryString  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getUsersCall(Integer page, Integer pageSize, Integer groupId, String queryString, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/v3/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (groupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("groupId", groupId));
        }

        if (queryString != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("queryString", queryString));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUsersValidateBeforeCall(Integer page, Integer pageSize, Integer groupId, String queryString, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getUsersCall(page, pageSize, groupId, queryString, _callback);
        return localVarCall;

    }

    /**
     * Get users
     * 
     * @param page Index of the result page starting from 1. (optional, default to 1)
     * @param pageSize Number of items in a result page. Max value: 500 (optional, default to 25)
     * @param groupId  (optional)
     * @param queryString  (optional)
     * @return UserReferenceSearchResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserReferenceSearchResult getUsers(Integer page, Integer pageSize, Integer groupId, String queryString) throws ApiException {
        ApiResponse<UserReferenceSearchResult> localVarResp = getUsersWithHttpInfo(page, pageSize, groupId, queryString);
        return localVarResp.getData();
    }

    /**
     * Get users
     * 
     * @param page Index of the result page starting from 1. (optional, default to 1)
     * @param pageSize Number of items in a result page. Max value: 500 (optional, default to 25)
     * @param groupId  (optional)
     * @param queryString  (optional)
     * @return ApiResponse&lt;UserReferenceSearchResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserReferenceSearchResult> getUsersWithHttpInfo(Integer page, Integer pageSize, Integer groupId, String queryString) throws ApiException {
        okhttp3.Call localVarCall = getUsersValidateBeforeCall(page, pageSize, groupId, queryString, null);
        Type localVarReturnType = new TypeToken<UserReferenceSearchResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get users (asynchronously)
     * 
     * @param page Index of the result page starting from 1. (optional, default to 1)
     * @param pageSize Number of items in a result page. Max value: 500 (optional, default to 25)
     * @param groupId  (optional)
     * @param queryString  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getUsersAsync(Integer page, Integer pageSize, Integer groupId, String queryString, final ApiCallback<UserReferenceSearchResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUsersValidateBeforeCall(page, pageSize, groupId, queryString, _callback);
        Type localVarReturnType = new TypeToken<UserReferenceSearchResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for searchUsers
     * @param page Index of the result page starting from 1. (optional, default to 1)
     * @param pageSize Number of items in a result page. Max value: 500 (optional, default to 25)
     * @param userFilteringRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call searchUsersCall(Integer page, Integer pageSize, UserFilteringRequest userFilteringRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = userFilteringRequest;

        // create path and map variables
        String localVarPath = "/v3/users/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call searchUsersValidateBeforeCall(Integer page, Integer pageSize, UserFilteringRequest userFilteringRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = searchUsersCall(page, pageSize, userFilteringRequest, _callback);
        return localVarCall;

    }

    /**
     * Search users
     * 
     * @param page Index of the result page starting from 1. (optional, default to 1)
     * @param pageSize Number of items in a result page. Max value: 500 (optional, default to 25)
     * @param userFilteringRequest  (optional)
     * @return UserReferenceSearchResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserReferenceSearchResult searchUsers(Integer page, Integer pageSize, UserFilteringRequest userFilteringRequest) throws ApiException {
        ApiResponse<UserReferenceSearchResult> localVarResp = searchUsersWithHttpInfo(page, pageSize, userFilteringRequest);
        return localVarResp.getData();
    }

    /**
     * Search users
     * 
     * @param page Index of the result page starting from 1. (optional, default to 1)
     * @param pageSize Number of items in a result page. Max value: 500 (optional, default to 25)
     * @param userFilteringRequest  (optional)
     * @return ApiResponse&lt;UserReferenceSearchResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserReferenceSearchResult> searchUsersWithHttpInfo(Integer page, Integer pageSize, UserFilteringRequest userFilteringRequest) throws ApiException {
        okhttp3.Call localVarCall = searchUsersValidateBeforeCall(page, pageSize, userFilteringRequest, null);
        Type localVarReturnType = new TypeToken<UserReferenceSearchResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search users (asynchronously)
     * 
     * @param page Index of the result page starting from 1. (optional, default to 1)
     * @param pageSize Number of items in a result page. Max value: 500 (optional, default to 25)
     * @param userFilteringRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call searchUsersAsync(Integer page, Integer pageSize, UserFilteringRequest userFilteringRequest, final ApiCallback<UserReferenceSearchResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchUsersValidateBeforeCall(page, pageSize, userFilteringRequest, _callback);
        Type localVarReturnType = new TypeToken<UserReferenceSearchResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
