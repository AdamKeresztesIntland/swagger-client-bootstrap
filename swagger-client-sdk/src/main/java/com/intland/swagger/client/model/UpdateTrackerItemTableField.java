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
 * UpdateTrackerItemTableField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:40:39.450514+01:00[Europe/Budapest]")
public class UpdateTrackerItemTableField {
  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<List<AbstractFieldValue>> rows = null;


  public UpdateTrackerItemTableField rows(List<List<AbstractFieldValue>> rows) {
    
    this.rows = rows;
    return this;
  }

  public UpdateTrackerItemTableField addRowsItem(List<AbstractFieldValue> rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<List<AbstractFieldValue>>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Table rows of a tracker table item
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Table rows of a tracker table item")

  public List<List<AbstractFieldValue>> getRows() {
    return rows;
  }


  public void setRows(List<List<AbstractFieldValue>> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTrackerItemTableField updateTrackerItemTableField = (UpdateTrackerItemTableField) o;
    return Objects.equals(this.rows, updateTrackerItemTableField.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTrackerItemTableField {\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

