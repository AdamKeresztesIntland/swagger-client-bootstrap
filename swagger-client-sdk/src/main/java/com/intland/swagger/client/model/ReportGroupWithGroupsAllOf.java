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

import io.swagger.annotations.ApiModelProperty;

/**
 * ReportGroupWithGroupsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:40:39.450514+01:00[Europe/Budapest]")
public class ReportGroupWithGroupsAllOf {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<ReportGroup> groups = null;


  public ReportGroupWithGroupsAllOf groups(List<ReportGroup> groups) {
    
    this.groups = groups;
    return this;
  }

  public ReportGroupWithGroupsAllOf addGroupsItem(ReportGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<ReportGroup>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Subgroups in the group.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subgroups in the group.")

  public List<ReportGroup> getGroups() {
    return groups;
  }


  public void setGroups(List<ReportGroup> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportGroupWithGroupsAllOf reportGroupWithGroupsAllOf = (ReportGroupWithGroupsAllOf) o;
    return Objects.equals(this.groups, reportGroupWithGroupsAllOf.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportGroupWithGroupsAllOf {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

