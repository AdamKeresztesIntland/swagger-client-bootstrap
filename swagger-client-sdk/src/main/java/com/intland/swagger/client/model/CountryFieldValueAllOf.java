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

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * CountryFieldValueAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T12:12:17.856+02:00[Europe/Budapest]")
public class CountryFieldValueAllOf {
  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private Set<String> values = null;


  public CountryFieldValueAllOf values(Set<String> values) {
    
    this.values = values;
    return this;
  }

  public CountryFieldValueAllOf addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new LinkedHashSet<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Country codes
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country codes")

  public Set<String> getValues() {
    return values;
  }


  public void setValues(Set<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryFieldValueAllOf countryFieldValueAllOf = (CountryFieldValueAllOf) o;
    return Objects.equals(this.values, countryFieldValueAllOf.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryFieldValueAllOf {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

