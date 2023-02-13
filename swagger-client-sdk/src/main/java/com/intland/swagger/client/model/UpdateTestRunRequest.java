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
 * Model to contain Test Case run update request models
 */
@ApiModel(description = "Model to contain Test Case run update request models")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:40:39.450514+01:00[Europe/Budapest]")
public class UpdateTestRunRequest {
  public static final String SERIALIZED_NAME_UPDATE_REQUEST_MODELS = "updateRequestModels";
  @SerializedName(SERIALIZED_NAME_UPDATE_REQUEST_MODELS)
  private List<UpdateTestCaseRunRequest> updateRequestModels = new ArrayList<UpdateTestCaseRunRequest>();

  public static final String SERIALIZED_NAME_PARENT_RESULT_PROPAGATION = "parentResultPropagation";
  @SerializedName(SERIALIZED_NAME_PARENT_RESULT_PROPAGATION)
  private Boolean parentResultPropagation = true;


  public UpdateTestRunRequest updateRequestModels(List<UpdateTestCaseRunRequest> updateRequestModels) {
    
    this.updateRequestModels = updateRequestModels;
    return this;
  }

  public UpdateTestRunRequest addUpdateRequestModelsItem(UpdateTestCaseRunRequest updateRequestModelsItem) {
    this.updateRequestModels.add(updateRequestModelsItem);
    return this;
  }

   /**
   * List of update Test Case run request models
   * @return updateRequestModels
  **/
  @ApiModelProperty(required = true, value = "List of update Test Case run request models")

  public List<UpdateTestCaseRunRequest> getUpdateRequestModels() {
    return updateRequestModels;
  }


  public void setUpdateRequestModels(List<UpdateTestCaseRunRequest> updateRequestModels) {
    this.updateRequestModels = updateRequestModels;
  }


  public UpdateTestRunRequest parentResultPropagation(Boolean parentResultPropagation) {
    
    this.parentResultPropagation = parentResultPropagation;
    return this;
  }

   /**
   * The propagation of the result is enabled for parent Test Run or not
   * @return parentResultPropagation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The propagation of the result is enabled for parent Test Run or not")

  public Boolean getParentResultPropagation() {
    return parentResultPropagation;
  }


  public void setParentResultPropagation(Boolean parentResultPropagation) {
    this.parentResultPropagation = parentResultPropagation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTestRunRequest updateTestRunRequest = (UpdateTestRunRequest) o;
    return Objects.equals(this.updateRequestModels, updateTestRunRequest.updateRequestModels) &&
        Objects.equals(this.parentResultPropagation, updateTestRunRequest.parentResultPropagation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateRequestModels, parentResultPropagation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTestRunRequest {\n");
    sb.append("    updateRequestModels: ").append(toIndentedString(updateRequestModels)).append("\n");
    sb.append("    parentResultPropagation: ").append(toIndentedString(parentResultPropagation)).append("\n");
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

