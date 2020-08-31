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
import com.intland.swagger.client.model.ReportColumn;
import com.intland.swagger.client.model.ReportReferencedRow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reference results for an item.
 */
@ApiModel(description = "Reference results for an item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T15:42:25.542+02:00[Europe/Budapest]")
public class ReportReferenceLevel {
  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ReportColumn> columns = new ArrayList<ReportColumn>();

  public static final String SERIALIZED_NAME_UPSTREAM_REFERENCE_ROWS = "upstreamReferenceRows";
  @SerializedName(SERIALIZED_NAME_UPSTREAM_REFERENCE_ROWS)
  private List<ReportReferencedRow> upstreamReferenceRows = new ArrayList<ReportReferencedRow>();

  public static final String SERIALIZED_NAME_DOWNSTREAM_REFERENCE_ROWS = "downstreamReferenceRows";
  @SerializedName(SERIALIZED_NAME_DOWNSTREAM_REFERENCE_ROWS)
  private List<ReportReferencedRow> downstreamReferenceRows = new ArrayList<ReportReferencedRow>();

  public static final String SERIALIZED_NAME_REFERENCE_LEVEL = "referenceLevel";
  @SerializedName(SERIALIZED_NAME_REFERENCE_LEVEL)
  private Integer referenceLevel;

  public ReportReferenceLevel columns(List<ReportColumn> columns) {
    this.columns = columns;
    return this;
  }

  public ReportReferenceLevel addColumnsItem(ReportColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ReportColumn>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns to show on this reference level.
   * @return columns
  **/
  @ApiModelProperty(value = "Columns to show on this reference level.")
  public List<ReportColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ReportColumn> columns) {
    this.columns = columns;
  }

  public ReportReferenceLevel upstreamReferenceRows(List<ReportReferencedRow> upstreamReferenceRows) {
    this.upstreamReferenceRows = upstreamReferenceRows;
    return this;
  }

  public ReportReferenceLevel addUpstreamReferenceRowsItem(ReportReferencedRow upstreamReferenceRowsItem) {
    if (this.upstreamReferenceRows == null) {
      this.upstreamReferenceRows = new ArrayList<ReportReferencedRow>();
    }
    this.upstreamReferenceRows.add(upstreamReferenceRowsItem);
    return this;
  }

   /**
   * Upstream reference results.
   * @return upstreamReferenceRows
  **/
  @ApiModelProperty(value = "Upstream reference results.")
  public List<ReportReferencedRow> getUpstreamReferenceRows() {
    return upstreamReferenceRows;
  }

  public void setUpstreamReferenceRows(List<ReportReferencedRow> upstreamReferenceRows) {
    this.upstreamReferenceRows = upstreamReferenceRows;
  }

  public ReportReferenceLevel downstreamReferenceRows(List<ReportReferencedRow> downstreamReferenceRows) {
    this.downstreamReferenceRows = downstreamReferenceRows;
    return this;
  }

  public ReportReferenceLevel addDownstreamReferenceRowsItem(ReportReferencedRow downstreamReferenceRowsItem) {
    if (this.downstreamReferenceRows == null) {
      this.downstreamReferenceRows = new ArrayList<ReportReferencedRow>();
    }
    this.downstreamReferenceRows.add(downstreamReferenceRowsItem);
    return this;
  }

   /**
   * Downstream reference results.
   * @return downstreamReferenceRows
  **/
  @ApiModelProperty(value = "Downstream reference results.")
  public List<ReportReferencedRow> getDownstreamReferenceRows() {
    return downstreamReferenceRows;
  }

  public void setDownstreamReferenceRows(List<ReportReferencedRow> downstreamReferenceRows) {
    this.downstreamReferenceRows = downstreamReferenceRows;
  }

  public ReportReferenceLevel referenceLevel(Integer referenceLevel) {
    this.referenceLevel = referenceLevel;
    return this;
  }

   /**
   * Reference level.
   * @return referenceLevel
  **/
  @ApiModelProperty(example = "1", value = "Reference level.")
  public Integer getReferenceLevel() {
    return referenceLevel;
  }

  public void setReferenceLevel(Integer referenceLevel) {
    this.referenceLevel = referenceLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportReferenceLevel reportReferenceLevel = (ReportReferenceLevel) o;
    return Objects.equals(this.columns, reportReferenceLevel.columns) &&
        Objects.equals(this.upstreamReferenceRows, reportReferenceLevel.upstreamReferenceRows) &&
        Objects.equals(this.downstreamReferenceRows, reportReferenceLevel.downstreamReferenceRows) &&
        Objects.equals(this.referenceLevel, reportReferenceLevel.referenceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, upstreamReferenceRows, downstreamReferenceRows, referenceLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportReferenceLevel {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    upstreamReferenceRows: ").append(toIndentedString(upstreamReferenceRows)).append("\n");
    sb.append("    downstreamReferenceRows: ").append(toIndentedString(downstreamReferenceRows)).append("\n");
    sb.append("    referenceLevel: ").append(toIndentedString(referenceLevel)).append("\n");
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

