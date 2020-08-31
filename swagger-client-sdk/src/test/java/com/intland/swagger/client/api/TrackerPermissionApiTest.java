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
import com.intland.swagger.client.model.PermissionIdsRequest;
import com.intland.swagger.client.model.RoleWithPermissions;
import com.intland.swagger.client.model.TrackerPermission;
import com.intland.swagger.client.model.TrackerPermissionReference;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrackerPermissionApi
 */
@Ignore
public class TrackerPermissionApiTest {

    private final TrackerPermissionApi api = new TrackerPermissionApi();

    
    /**
     * Get the immutable definition of a tracker permission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerPermissionTest() throws ApiException {
        Integer trackerPermissionId = null;
        TrackerPermission response = api.getTrackerPermission(trackerPermissionId);

        // TODO: test validations
    }
    
    /**
     * Get available tracker permissions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerPermissionsTest() throws ApiException {
        List<TrackerPermissionReference> response = api.getTrackerPermissions();

        // TODO: test validations
    }
    
    /**
     * List tracker permissions per role
     *
     * API can be used to list tracker permissions per roles, filtering is possible by user, user and on of the user&#39;s role, or just by role
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTrackerPermissionsWithRolesTest() throws ApiException {
        Integer trackerId = null;
        Integer userId = null;
        Integer roleId = null;
        List<RoleWithPermissions> response = api.getTrackerPermissionsWithRoles(trackerId, userId, roleId);

        // TODO: test validations
    }
    
    /**
     * Removes all tracker permissions from a specific role
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removePermissionsTest() throws ApiException {
        Integer trackerId = null;
        Integer roleId = null;
        api.removePermissions(trackerId, roleId);

        // TODO: test validations
    }
    
    /**
     * Set the tracker permissions for a specific role
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePermissionTest() throws ApiException {
        Integer trackerId = null;
        Integer roleId = null;
        PermissionIdsRequest permissionIdsRequest = null;
        List<RoleWithPermissions> response = api.updatePermission(trackerId, roleId, permissionIdsRequest);

        // TODO: test validations
    }
    
}
