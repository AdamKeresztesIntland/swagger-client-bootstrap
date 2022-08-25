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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request model to update Test Run&#39;s result for a Test Case
 */
@ApiModel(description = "Request model to update Test Run's result for a Test Case")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T12:12:17.856+02:00[Europe/Budapest]")
public class UpdateTestCaseRunRequest {
  public static final String SERIALIZED_NAME_CONCLUSION = "conclusion";
  @SerializedName(SERIALIZED_NAME_CONCLUSION)
  private String conclusion;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private List<AbstractFieldValue> customFields = null;

  public static final String SERIALIZED_NAME_REPORTED_BUG_REFERENCES = "reportedBugReferences";
  @SerializedName(SERIALIZED_NAME_REPORTED_BUG_REFERENCES)
  private List<TrackerItemReference> reportedBugReferences = null;

  /**
   * Result of the test case
   */
  @JsonAdapter(ResultEnum.Adapter.class)
  public enum ResultEnum {
    PASSED("PASSED"),
    
    FAILED("FAILED"),
    
    BLOCKED("BLOCKED"),
    
    NOT_APPLICABLE("NOT_APPLICABLE");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ResultEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ResultEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private ResultEnum result;

  public static final String SERIALIZED_NAME_RUN_TIME = "runTime";
  @SerializedName(SERIALIZED_NAME_RUN_TIME)
  private Integer runTime;

  public static final String SERIALIZED_NAME_TEST_CASE_REFERENCE = "testCaseReference";
  @SerializedName(SERIALIZED_NAME_TEST_CASE_REFERENCE)
  private TrackerItemReference testCaseReference;


  public UpdateTestCaseRunRequest conclusion(String conclusion) {
    
    this.conclusion = conclusion;
    return this;
  }

   /**
   * Optional conclusion text
   * @return conclusion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional conclusion text")

  public String getConclusion() {
    return conclusion;
  }


  public void setConclusion(String conclusion) {
    this.conclusion = conclusion;
  }


  public UpdateTestCaseRunRequest customFields(List<AbstractFieldValue> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public UpdateTestCaseRunRequest addCustomFieldsItem(AbstractFieldValue customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<AbstractFieldValue>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Optional field values to set on the Test Run
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional field values to set on the Test Run")

  public List<AbstractFieldValue> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(List<AbstractFieldValue> customFields) {
    this.customFields = customFields;
  }


  public UpdateTestCaseRunRequest reportedBugReferences(List<TrackerItemReference> reportedBugReferences) {
    
    this.reportedBugReferences = reportedBugReferences;
    return this;
  }

  public UpdateTestCaseRunRequest addReportedBugReferencesItem(TrackerItemReference reportedBugReferencesItem) {
    if (this.reportedBugReferences == null) {
      this.reportedBugReferences = new ArrayList<TrackerItemReference>();
    }
    this.reportedBugReferences.add(reportedBugReferencesItem);
    return this;
  }

   /**
   * Optional reference list of Bugs attached to the Test result
   * @return reportedBugReferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional reference list of Bugs attached to the Test result")

  public List<TrackerItemReference> getReportedBugReferences() {
    return reportedBugReferences;
  }


  public void setReportedBugReferences(List<TrackerItemReference> reportedBugReferences) {
    this.reportedBugReferences = reportedBugReferences;
  }


  public UpdateTestCaseRunRequest result(ResultEnum result) {
    
    this.result = result;
    return this;
  }

   /**
   * Result of the test case
   * @return result
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Result of the test case")

  public ResultEnum getResult() {
    return result;
  }


  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public UpdateTestCaseRunRequest runTime(Integer runTime) {
    
    this.runTime = runTime;
    return this;
  }

   /**
   * Optional runtime in seconds
   * @return runTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional runtime in seconds")

  public Integer getRunTime() {
    return runTime;
  }


  public void setRunTime(Integer runTime) {
    this.runTime = runTime;
  }


  public UpdateTestCaseRunRequest testCaseReference(TrackerItemReference testCaseReference) {
    
    this.testCaseReference = testCaseReference;
    return this;
  }

   /**
   * Get testCaseReference
   * @return testCaseReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TrackerItemReference getTestCaseReference() {
    return testCaseReference;
  }


  public void setTestCaseReference(TrackerItemReference testCaseReference) {
    this.testCaseReference = testCaseReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTestCaseRunRequest updateTestCaseRunRequest = (UpdateTestCaseRunRequest) o;
    return Objects.equals(this.conclusion, updateTestCaseRunRequest.conclusion) &&
        Objects.equals(this.customFields, updateTestCaseRunRequest.customFields) &&
        Objects.equals(this.reportedBugReferences, updateTestCaseRunRequest.reportedBugReferences) &&
        Objects.equals(this.result, updateTestCaseRunRequest.result) &&
        Objects.equals(this.runTime, updateTestCaseRunRequest.runTime) &&
        Objects.equals(this.testCaseReference, updateTestCaseRunRequest.testCaseReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conclusion, customFields, reportedBugReferences, result, runTime, testCaseReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTestCaseRunRequest {\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    reportedBugReferences: ").append(toIndentedString(reportedBugReferences)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    runTime: ").append(toIndentedString(runTime)).append("\n");
    sb.append("    testCaseReference: ").append(toIndentedString(testCaseReference)).append("\n");
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

