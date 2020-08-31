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
import com.intland.swagger.client.model.AbstractReference;
import com.intland.swagger.client.model.FieldReferenceAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Reference to a field of a specific tracker
 */
@ApiModel(description = "Reference to a field of a specific tracker")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T15:42:25.542+02:00[Europe/Budapest]")
public class FieldReference extends AbstractReference {
  public static final String SERIALIZED_NAME_TRACKER_ID = "trackerId";
  @SerializedName(SERIALIZED_NAME_TRACKER_ID)
  private Integer trackerId;

  public FieldReference trackerId(Integer trackerId) {
    this.trackerId = trackerId;
    return this;
  }

   /**
   * Id of the tracker
   * @return trackerId
  **/
  @ApiModelProperty(example = "1000", value = "Id of the tracker")
  public Integer getTrackerId() {
    return trackerId;
  }

  public void setTrackerId(Integer trackerId) {
    this.trackerId = trackerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldReference fieldReference = (FieldReference) o;
    return Objects.equals(this.trackerId, fieldReference.trackerId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackerId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldReference {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
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

