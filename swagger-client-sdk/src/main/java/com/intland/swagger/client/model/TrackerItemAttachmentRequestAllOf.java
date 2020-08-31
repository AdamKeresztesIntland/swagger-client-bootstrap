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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TrackerItemAttachmentRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T15:42:25.542+02:00[Europe/Budapest]")
public class TrackerItemAttachmentRequestAllOf {
  public static final String SERIALIZED_NAME_BASELINE_ID = "baselineId";
  @SerializedName(SERIALIZED_NAME_BASELINE_ID)
  private Integer baselineId;

  public static final String SERIALIZED_NAME_EXCLUDE_FILTER = "excludeFilter";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_FILTER)
  private Boolean excludeFilter;

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private List<String> extensions = new ArrayList<String>();

  public static final String SERIALIZED_NAME_MIME_TYPES = "mimeTypes";
  @SerializedName(SERIALIZED_NAME_MIME_TYPES)
  private List<String> mimeTypes = new ArrayList<String>();

  public TrackerItemAttachmentRequestAllOf baselineId(Integer baselineId) {
    this.baselineId = baselineId;
    return this;
  }

   /**
   * Baseline id to specify the versions of the tracker items.
   * @return baselineId
  **/
  @ApiModelProperty(example = "1203", value = "Baseline id to specify the versions of the tracker items.")
  public Integer getBaselineId() {
    return baselineId;
  }

  public void setBaselineId(Integer baselineId) {
    this.baselineId = baselineId;
  }

  public TrackerItemAttachmentRequestAllOf excludeFilter(Boolean excludeFilter) {
    this.excludeFilter = excludeFilter;
    return this;
  }

   /**
   * Indicator if the attachments matching the filters need to be excluded or not
   * @return excludeFilter
  **/
  @ApiModelProperty(example = "false", value = "Indicator if the attachments matching the filters need to be excluded or not")
  public Boolean getExcludeFilter() {
    return excludeFilter;
  }

  public void setExcludeFilter(Boolean excludeFilter) {
    this.excludeFilter = excludeFilter;
  }

  public TrackerItemAttachmentRequestAllOf extensions(List<String> extensions) {
    this.extensions = extensions;
    return this;
  }

  public TrackerItemAttachmentRequestAllOf addExtensionsItem(String extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<String>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * File extension filters.
   * @return extensions
  **/
  @ApiModelProperty(example = "[\"docx\",\"xlsx\"]", value = "File extension filters.")
  public List<String> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<String> extensions) {
    this.extensions = extensions;
  }

  public TrackerItemAttachmentRequestAllOf mimeTypes(List<String> mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  public TrackerItemAttachmentRequestAllOf addMimeTypesItem(String mimeTypesItem) {
    if (this.mimeTypes == null) {
      this.mimeTypes = new ArrayList<String>();
    }
    this.mimeTypes.add(mimeTypesItem);
    return this;
  }

   /**
   * File mime type filters.
   * @return mimeTypes
  **/
  @ApiModelProperty(example = "[\"image/png\",\"application/zip\"]", value = "File mime type filters.")
  public List<String> getMimeTypes() {
    return mimeTypes;
  }

  public void setMimeTypes(List<String> mimeTypes) {
    this.mimeTypes = mimeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackerItemAttachmentRequestAllOf trackerItemAttachmentRequestAllOf = (TrackerItemAttachmentRequestAllOf) o;
    return Objects.equals(this.baselineId, trackerItemAttachmentRequestAllOf.baselineId) &&
        Objects.equals(this.excludeFilter, trackerItemAttachmentRequestAllOf.excludeFilter) &&
        Objects.equals(this.extensions, trackerItemAttachmentRequestAllOf.extensions) &&
        Objects.equals(this.mimeTypes, trackerItemAttachmentRequestAllOf.mimeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baselineId, excludeFilter, extensions, mimeTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackerItemAttachmentRequestAllOf {\n");
    sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
    sb.append("    excludeFilter: ").append(toIndentedString(excludeFilter)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
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

