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


package com.intland.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.intland.swagger.client.model.ProjectReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeployProject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T15:42:25.542+02:00[Europe/Budapest]")
public class DeployProject {
  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private ProjectReference project = null;

  public static final String SERIALIZED_NAME_CONFIGURATION_FILE_ID = "configurationFileId";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_FILE_ID)
  private Integer configurationFileId;

  public static final String SERIALIZED_NAME_PROJECT_FILE_ID = "projectFileId";
  @SerializedName(SERIALIZED_NAME_PROJECT_FILE_ID)
  private Integer projectFileId;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public DeployProject project(ProjectReference project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public ProjectReference getProject() {
    return project;
  }

  public void setProject(ProjectReference project) {
    this.project = project;
  }

  public DeployProject configurationFileId(Integer configurationFileId) {
    this.configurationFileId = configurationFileId;
    return this;
  }

   /**
   * Id of a codeBeamer document
   * @return configurationFileId
  **/
  @ApiModelProperty(value = "Id of a codeBeamer document")
  public Integer getConfigurationFileId() {
    return configurationFileId;
  }

  public void setConfigurationFileId(Integer configurationFileId) {
    this.configurationFileId = configurationFileId;
  }

  public DeployProject projectFileId(Integer projectFileId) {
    this.projectFileId = projectFileId;
    return this;
  }

   /**
   * Id of a codeBeamer document
   * @return projectFileId
  **/
  @ApiModelProperty(value = "Id of a codeBeamer document")
  public Integer getProjectFileId() {
    return projectFileId;
  }

  public void setProjectFileId(Integer projectFileId) {
    this.projectFileId = projectFileId;
  }

  public DeployProject password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password to decrypt the uploaded configuration file
   * @return password
  **/
  @ApiModelProperty(value = "The password to decrypt the uploaded configuration file")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployProject deployProject = (DeployProject) o;
    return Objects.equals(this.project, deployProject.project) &&
        Objects.equals(this.configurationFileId, deployProject.configurationFileId) &&
        Objects.equals(this.projectFileId, deployProject.projectFileId) &&
        Objects.equals(this.password, deployProject.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, configurationFileId, projectFileId, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployProject {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    configurationFileId: ").append(toIndentedString(configurationFileId)).append("\n");
    sb.append("    projectFileId: ").append(toIndentedString(projectFileId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

