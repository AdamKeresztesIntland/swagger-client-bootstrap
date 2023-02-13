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
 * Wiki text field
 */
@ApiModel(description = "Wiki text field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T14:02:21.403654+01:00[Europe/Budapest]")
public class WikiTextField extends AbstractField {
  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private Integer max;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private Integer min;

  public WikiTextField() {
    this.type = this.getClass().getSimpleName();
  }

  public WikiTextField max(Integer max) {
    
    this.max = max;
    return this;
  }

   /**
   * Max length of value of a field
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Max length of value of a field")

  public Integer getMax() {
    return max;
  }


  public void setMax(Integer max) {
    this.max = max;
  }


  public WikiTextField min(Integer min) {
    
    this.min = min;
    return this;
  }

   /**
   * Minimum length of value of a field
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum length of value of a field")

  public Integer getMin() {
    return min;
  }


  public void setMin(Integer min) {
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
    WikiTextField wikiTextField = (WikiTextField) o;
    return Objects.equals(this.max, wikiTextField.max) &&
        Objects.equals(this.min, wikiTextField.min) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiTextField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

