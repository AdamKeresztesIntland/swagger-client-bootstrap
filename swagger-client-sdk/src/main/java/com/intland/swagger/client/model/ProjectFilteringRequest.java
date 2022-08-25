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

import io.swagger.annotations.ApiModelProperty;

/**
 * ProjectFilteringRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T12:12:17.856+02:00[Europe/Budapest]")
public class ProjectFilteringRequest {
  public static final String SERIALIZED_NAME_KEY_NAME = "keyName";
  @SerializedName(SERIALIZED_NAME_KEY_NAME)
  private String keyName;


  public ProjectFilteringRequest keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * Key name of the project
   * @return keyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Key name of the project")

  public String getKeyName() {
    return keyName;
  }


  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectFilteringRequest projectFilteringRequest = (ProjectFilteringRequest) o;
    return Objects.equals(this.keyName, projectFilteringRequest.keyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectFilteringRequest {\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

