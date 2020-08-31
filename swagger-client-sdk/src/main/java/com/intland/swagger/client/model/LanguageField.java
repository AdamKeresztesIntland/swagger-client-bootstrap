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
import com.intland.swagger.client.model.AbstractField;
import com.intland.swagger.client.model.ChoiceOptionReference;
import com.intland.swagger.client.model.CountryFieldAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Language field
 */
@ApiModel(description = "Language field")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T15:42:25.542+02:00[Europe/Budapest]")
public class LanguageField extends AbstractField {
  public static final String SERIALIZED_NAME_FORMULA = "formula";
  @SerializedName(SERIALIZED_NAME_FORMULA)
  private String formula;

  public static final String SERIALIZED_NAME_AVAILABLE_OPTIONS = "availableOptions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_OPTIONS)
  private List<String> availableOptions = new ArrayList<String>();

  public LanguageField formula(String formula) {
    this.formula = formula;
    return this;
  }

   /**
   * Formula value of a field
   * @return formula
  **/
  @ApiModelProperty(value = "Formula value of a field")
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public LanguageField availableOptions(List<String> availableOptions) {
    this.availableOptions = availableOptions;
    return this;
  }

  public LanguageField addAvailableOptionsItem(String availableOptionsItem) {
    if (this.availableOptions == null) {
      this.availableOptions = new ArrayList<String>();
    }
    this.availableOptions.add(availableOptionsItem);
    return this;
  }

   /**
   * Get availableOptions
   * @return availableOptions
  **/
  @ApiModelProperty(value = "")
  public List<String> getAvailableOptions() {
    return availableOptions;
  }

  public void setAvailableOptions(List<String> availableOptions) {
    this.availableOptions = availableOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageField languageField = (LanguageField) o;
    return Objects.equals(this.formula, languageField.formula) &&
        Objects.equals(this.availableOptions, languageField.availableOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formula, availableOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageField {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    availableOptions: ").append(toIndentedString(availableOptions)).append("\n");
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

