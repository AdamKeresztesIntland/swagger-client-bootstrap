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
 * Request model to fetch Tracker Item Reviews for multiple Tracker Items.
 */
@ApiModel(description = "Request model to fetch Tracker Item Reviews for multiple Tracker Items.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T15:42:25.542+02:00[Europe/Budapest]")
public class BatchGetTrackerItemReviewsRequest {
  public static final String SERIALIZED_NAME_ITEM_IDS = "itemIds";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<Integer> itemIds = new ArrayList<Integer>();

  public static final String SERIALIZED_NAME_BASELINE_ID = "baselineId";
  @SerializedName(SERIALIZED_NAME_BASELINE_ID)
  private Integer baselineId;

  public BatchGetTrackerItemReviewsRequest itemIds(List<Integer> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public BatchGetTrackerItemReviewsRequest addItemIdsItem(Integer itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<Integer>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * List of Tracker Item IDs
   * @return itemIds
  **/
  @ApiModelProperty(value = "List of Tracker Item IDs")
  public List<Integer> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<Integer> itemIds) {
    this.itemIds = itemIds;
  }

  public BatchGetTrackerItemReviewsRequest baselineId(Integer baselineId) {
    this.baselineId = baselineId;
    return this;
  }

   /**
   * Optional Baseline ID
   * @return baselineId
  **/
  @ApiModelProperty(value = "Optional Baseline ID")
  public Integer getBaselineId() {
    return baselineId;
  }

  public void setBaselineId(Integer baselineId) {
    this.baselineId = baselineId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchGetTrackerItemReviewsRequest batchGetTrackerItemReviewsRequest = (BatchGetTrackerItemReviewsRequest) o;
    return Objects.equals(this.itemIds, batchGetTrackerItemReviewsRequest.itemIds) &&
        Objects.equals(this.baselineId, batchGetTrackerItemReviewsRequest.baselineId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemIds, baselineId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchGetTrackerItemReviewsRequest {\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
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

