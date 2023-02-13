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
 * TrackerItemFieldAccessibilityList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:40:39.450514+01:00[Europe/Budapest]")
public class TrackerItemFieldAccessibilityList {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<TrackerItemFieldAccessibility> fields = null;


  public TrackerItemFieldAccessibilityList fields(List<TrackerItemFieldAccessibility> fields) {
    
    this.fields = fields;
    return this;
  }

  public TrackerItemFieldAccessibilityList addFieldsItem(TrackerItemFieldAccessibility fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<TrackerItemFieldAccessibility>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Accessibilities of fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accessibilities of fields")

  public List<TrackerItemFieldAccessibility> getFields() {
    return fields;
  }


  public void setFields(List<TrackerItemFieldAccessibility> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemFieldAccessibilityList trackerItemFieldAccessibilityList = (TrackerItemFieldAccessibilityList) o;
    return Objects.equals(this.fields, trackerItemFieldAccessibilityList.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemFieldAccessibilityList {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

