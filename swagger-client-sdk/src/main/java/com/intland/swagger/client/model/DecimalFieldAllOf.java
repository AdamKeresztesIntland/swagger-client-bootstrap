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

import io.swagger.annotations.ApiModelProperty;

/**
 * DecimalFieldAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class DecimalFieldAllOf {
  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Double max;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Double min;


  public DecimalFieldAllOf max(Double max) {
    
    this.max = max;
    return this;
  }

   /**
   * Maximum value of a field
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum value of a field")

  public Double getMax() {
    return max;
  }


  public void setMax(Double max) {
    this.max = max;
  }


  public DecimalFieldAllOf min(Double min) {
    
    this.min = min;
    return this;
  }

   /**
   * Minimum value of a field
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum value of a field")

  public Double getMin() {
    return min;
  }


  public void setMin(Double min) {
    this.min = min;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecimalFieldAllOf decimalFieldAllOf = (DecimalFieldAllOf) o;
    return Objects.equals(this.max, decimalFieldAllOf.max) &&
        Objects.equals(this.min, decimalFieldAllOf.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecimalFieldAllOf {\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

