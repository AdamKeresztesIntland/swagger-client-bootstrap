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
 * Reference container of a choice option field
 */
@ApiModel(description = "Reference container of a choice option field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-13T13:40:39.450514+01:00[Europe/Budapest]")
public class ChoiceFieldValue extends AbstractFieldValue {
  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<AbstractReference> values = null;


  public ChoiceFieldValue values(List<AbstractReference> values) {
    
    this.values = values;
    return this;
  }

  public ChoiceFieldValue addValuesItem(AbstractReference valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<AbstractReference>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Values of the choice option field
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Values of the choice option field")

  public List<AbstractReference> getValues() {
    return values;
  }


  public void setValues(List<AbstractReference> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChoiceFieldValue choiceFieldValue = (ChoiceFieldValue) o;
    return Objects.equals(this.values, choiceFieldValue.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChoiceFieldValue {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

