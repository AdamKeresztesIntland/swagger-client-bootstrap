/*
 * codebeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.intland.swagger.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Holds the response of a bulk operation
 */
@ApiModel(description = "Holds the response of a bulk operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:40:39.450514+01:00[Europe/Budapest]")
public class BulkOperationResponse {
  public static final String SERIALIZED_NAME_SUCCESSFUL_OPERATIONS_COUNT = "successfulOperationsCount";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_OPERATIONS_COUNT)
  private Integer successfulOperationsCount;

  public static final String SERIALIZED_NAME_FAILED_OPERATIONS = "failedOperations";
  @SerializedName(SERIALIZED_NAME_FAILED_OPERATIONS)
  private List<FailedOperation> failedOperations = null;


  public BulkOperationResponse successfulOperationsCount(Integer successfulOperationsCount) {
    
    this.successfulOperationsCount = successfulOperationsCount;
    return this;
  }

   /**
   * Count of successful operations
   * @return successfulOperationsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of successful operations")

  public Integer getSuccessfulOperationsCount() {
    return successfulOperationsCount;
  }


  public void setSuccessfulOperationsCount(Integer successfulOperationsCount) {
    this.successfulOperationsCount = successfulOperationsCount;
  }


  public BulkOperationResponse failedOperations(List<FailedOperation> failedOperations) {
    
    this.failedOperations = failedOperations;
    return this;
  }

  public BulkOperationResponse addFailedOperationsItem(FailedOperation failedOperationsItem) {
    if (this.failedOperations == null) {
      this.failedOperations = new ArrayList<FailedOperation>();
    }
    this.failedOperations.add(failedOperationsItem);
    return this;
  }

   /**
   * List of failed operations
   * @return failedOperations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of failed operations")

  public List<FailedOperation> getFailedOperations() {
    return failedOperations;
  }


  public void setFailedOperations(List<FailedOperation> failedOperations) {
    this.failedOperations = failedOperations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperationResponse bulkOperationResponse = (BulkOperationResponse) o;
    return Objects.equals(this.successfulOperationsCount, bulkOperationResponse.successfulOperationsCount) &&
        Objects.equals(this.failedOperations, bulkOperationResponse.failedOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successfulOperationsCount, failedOperations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperationResponse {\n");
    sb.append("    successfulOperationsCount: ").append(toIndentedString(successfulOperationsCount)).append("\n");
    sb.append("    failedOperations: ").append(toIndentedString(failedOperations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

