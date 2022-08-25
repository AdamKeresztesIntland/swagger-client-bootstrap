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
 * An item of the report.
 */
@ApiModel(description = "An item of the report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T12:12:17.856+02:00[Europe/Budapest]")
public class ReportItem {
  public static final String SERIALIZED_NAME_IS_REAL_RESULT = "isRealResult";
  @SerializedName(SERIALIZED_NAME_IS_REAL_RESULT)
  private Boolean isRealResult;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private TrackerItem item;

  public static final String SERIALIZED_NAME_OUTLINE_LEVEL = "outlineLevel";
  @SerializedName(SERIALIZED_NAME_OUTLINE_LEVEL)
  private Integer outlineLevel;


  public ReportItem isRealResult(Boolean isRealResult) {
    
    this.isRealResult = isRealResult;
    return this;
  }

   /**
   * Indicator if the item is a real query result (e.g. not an ancestor item).
   * @return isRealResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicator if the item is a real query result (e.g. not an ancestor item).")

  public Boolean getIsRealResult() {
    return isRealResult;
  }


  public void setIsRealResult(Boolean isRealResult) {
    this.isRealResult = isRealResult;
  }


  public ReportItem item(TrackerItem item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItem getItem() {
    return item;
  }


  public void setItem(TrackerItem item) {
    this.item = item;
  }


  public ReportItem outlineLevel(Integer outlineLevel) {
    
    this.outlineLevel = outlineLevel;
    return this;
  }

   /**
   * Item&#39;s level in the tracker outline.
   * @return outlineLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item's level in the tracker outline.")

  public Integer getOutlineLevel() {
    return outlineLevel;
  }


  public void setOutlineLevel(Integer outlineLevel) {
    this.outlineLevel = outlineLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportItem reportItem = (ReportItem) o;
    return Objects.equals(this.isRealResult, reportItem.isRealResult) &&
        Objects.equals(this.item, reportItem.item) &&
        Objects.equals(this.outlineLevel, reportItem.outlineLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isRealResult, item, outlineLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportItem {\n");
    sb.append("    isRealResult: ").append(toIndentedString(isRealResult)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    outlineLevel: ").append(toIndentedString(outlineLevel)).append("\n");
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

