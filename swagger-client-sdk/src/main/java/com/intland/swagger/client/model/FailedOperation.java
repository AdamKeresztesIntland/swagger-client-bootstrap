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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Holds the details of a failed operation
 */
@ApiModel(description = "Holds the details of a failed operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:40:39.450514+01:00[Europe/Budapest]")
public class FailedOperation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_EXCEPTION_MESSAGE = "exceptionMessage";
  @SerializedName(SERIALIZED_NAME_EXCEPTION_MESSAGE)
  private String exceptionMessage;


  public FailedOperation id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Entity id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Entity id")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public FailedOperation exceptionMessage(String exceptionMessage) {
    
    this.exceptionMessage = exceptionMessage;
    return this;
  }

   /**
   * Exception message
   * @return exceptionMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exception message")

  public String getExceptionMessage() {
    return exceptionMessage;
  }


  public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedOperation failedOperation = (FailedOperation) o;
    return Objects.equals(this.id, failedOperation.id) &&
        Objects.equals(this.exceptionMessage, failedOperation.exceptionMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, exceptionMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedOperation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
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

