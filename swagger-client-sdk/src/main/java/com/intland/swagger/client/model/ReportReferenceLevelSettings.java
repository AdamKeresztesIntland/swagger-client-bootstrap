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
 * Reference level settings for Intelligent Table View.
 */
@ApiModel(description = "Reference level settings for Intelligent Table View.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:40:39.450514+01:00[Europe/Budapest]")
public class ReportReferenceLevelSettings {
  public static final String SERIALIZED_NAME_REFERENCE_TRACKERS = "referenceTrackers";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TRACKERS)
  private List<TrackerReference> referenceTrackers = null;

  public static final String SERIALIZED_NAME_REFERENCE_TRACKER_TYPES = "referenceTrackerTypes";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TRACKER_TYPES)
  private List<TrackerTypeReference> referenceTrackerTypes = null;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<ReportColumnSettings> columns = new ArrayList<ReportColumnSettings>();

  public static final String SERIALIZED_NAME_UPSTREAM_REFERENCE = "upstreamReference";
  @SerializedName(SERIALIZED_NAME_UPSTREAM_REFERENCE)
  private Boolean upstreamReference;

  public static final String SERIALIZED_NAME_DOWNSTREAM_REFERENCE = "downstreamReference";
  @SerializedName(SERIALIZED_NAME_DOWNSTREAM_REFERENCE)
  private Boolean downstreamReference;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;


  public ReportReferenceLevelSettings referenceTrackers(List<TrackerReference> referenceTrackers) {
    
    this.referenceTrackers = referenceTrackers;
    return this;
  }

  public ReportReferenceLevelSettings addReferenceTrackersItem(TrackerReference referenceTrackersItem) {
    if (this.referenceTrackers == null) {
      this.referenceTrackers = new ArrayList<TrackerReference>();
    }
    this.referenceTrackers.add(referenceTrackersItem);
    return this;
  }

   /**
   * Trackers to include on this level.
   * @return referenceTrackers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trackers to include on this level.")

  public List<TrackerReference> getReferenceTrackers() {
    return referenceTrackers;
  }


  public void setReferenceTrackers(List<TrackerReference> referenceTrackers) {
    this.referenceTrackers = referenceTrackers;
  }


  public ReportReferenceLevelSettings referenceTrackerTypes(List<TrackerTypeReference> referenceTrackerTypes) {
    
    this.referenceTrackerTypes = referenceTrackerTypes;
    return this;
  }

  public ReportReferenceLevelSettings addReferenceTrackerTypesItem(TrackerTypeReference referenceTrackerTypesItem) {
    if (this.referenceTrackerTypes == null) {
      this.referenceTrackerTypes = new ArrayList<TrackerTypeReference>();
    }
    this.referenceTrackerTypes.add(referenceTrackerTypesItem);
    return this;
  }

   /**
   * Tracker types to include on this level.
   * @return referenceTrackerTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tracker types to include on this level.")

  public List<TrackerTypeReference> getReferenceTrackerTypes() {
    return referenceTrackerTypes;
  }


  public void setReferenceTrackerTypes(List<TrackerTypeReference> referenceTrackerTypes) {
    this.referenceTrackerTypes = referenceTrackerTypes;
  }


  public ReportReferenceLevelSettings columns(List<ReportColumnSettings> columns) {
    
    this.columns = columns;
    return this;
  }

  public ReportReferenceLevelSettings addColumnsItem(ReportColumnSettings columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns to show on this reference level.
   * @return columns
  **/
  @ApiModelProperty(required = true, value = "Columns to show on this reference level.")

  public List<ReportColumnSettings> getColumns() {
    return columns;
  }


  public void setColumns(List<ReportColumnSettings> columns) {
    this.columns = columns;
  }


  public ReportReferenceLevelSettings upstreamReference(Boolean upstreamReference) {
    
    this.upstreamReference = upstreamReference;
    return this;
  }

   /**
   * Include upstream references indicator.
   * @return upstreamReference
  **/
  @ApiModelProperty(example = "true", required = true, value = "Include upstream references indicator.")

  public Boolean getUpstreamReference() {
    return upstreamReference;
  }


  public void setUpstreamReference(Boolean upstreamReference) {
    this.upstreamReference = upstreamReference;
  }


  public ReportReferenceLevelSettings downstreamReference(Boolean downstreamReference) {
    
    this.downstreamReference = downstreamReference;
    return this;
  }

   /**
   * Include downstream references indicator.
   * @return downstreamReference
  **/
  @ApiModelProperty(example = "false", required = true, value = "Include downstream references indicator.")

  public Boolean getDownstreamReference() {
    return downstreamReference;
  }


  public void setDownstreamReference(Boolean downstreamReference) {
    this.downstreamReference = downstreamReference;
  }


  public ReportReferenceLevelSettings level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Level of the reference layer
   * minimum: 1
   * @return level
  **/
  @ApiModelProperty(example = "1", required = true, value = "Level of the reference layer")

  public Integer getLevel() {
    return level;
  }


  public void setLevel(Integer level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportReferenceLevelSettings reportReferenceLevelSettings = (ReportReferenceLevelSettings) o;
    return Objects.equals(this.referenceTrackers, reportReferenceLevelSettings.referenceTrackers) &&
        Objects.equals(this.referenceTrackerTypes, reportReferenceLevelSettings.referenceTrackerTypes) &&
        Objects.equals(this.columns, reportReferenceLevelSettings.columns) &&
        Objects.equals(this.upstreamReference, reportReferenceLevelSettings.upstreamReference) &&
        Objects.equals(this.downstreamReference, reportReferenceLevelSettings.downstreamReference) &&
        Objects.equals(this.level, reportReferenceLevelSettings.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceTrackers, referenceTrackerTypes, columns, upstreamReference, downstreamReference, level);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportReferenceLevelSettings {\n");
    sb.append("    referenceTrackers: ").append(toIndentedString(referenceTrackers)).append("\n");
    sb.append("    referenceTrackerTypes: ").append(toIndentedString(referenceTrackerTypes)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    upstreamReference: ").append(toIndentedString(upstreamReference)).append("\n");
    sb.append("    downstreamReference: ").append(toIndentedString(downstreamReference)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

