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
 * Accessibilities of fields
 */
@ApiModel(description = "Accessibilities of fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:40:39.450514+01:00[Europe/Budapest]")
public class TrackerItemFieldAccessibility {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private FieldReference field;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_MANDATORY = "mandatory";
  @SerializedName(SERIALIZED_NAME_MANDATORY)
  private Boolean mandatory;

  public static final String SERIALIZED_NAME_EDITABLE = "editable";
  @SerializedName(SERIALIZED_NAME_EDITABLE)
  private Boolean editable;


  public TrackerItemFieldAccessibility field(FieldReference field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldReference getField() {
    return field;
  }


  public void setField(FieldReference field) {
    this.field = field;
  }


  public TrackerItemFieldAccessibility visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * Field is visible
   * @return visible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field is visible")

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public TrackerItemFieldAccessibility mandatory(Boolean mandatory) {
    
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Field is mandatory
   * @return mandatory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field is mandatory")

  public Boolean getMandatory() {
    return mandatory;
  }


  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  public TrackerItemFieldAccessibility editable(Boolean editable) {
    
    this.editable = editable;
    return this;
  }

   /**
   * Field is editable
   * @return editable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field is editable")

  public Boolean getEditable() {
    return editable;
  }


  public void setEditable(Boolean editable) {
    this.editable = editable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemFieldAccessibility trackerItemFieldAccessibility = (TrackerItemFieldAccessibility) o;
    return Objects.equals(this.field, trackerItemFieldAccessibility.field) &&
        Objects.equals(this.visible, trackerItemFieldAccessibility.visible) &&
        Objects.equals(this.mandatory, trackerItemFieldAccessibility.mandatory) &&
        Objects.equals(this.editable, trackerItemFieldAccessibility.editable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, visible, mandatory, editable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemFieldAccessibility {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
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

