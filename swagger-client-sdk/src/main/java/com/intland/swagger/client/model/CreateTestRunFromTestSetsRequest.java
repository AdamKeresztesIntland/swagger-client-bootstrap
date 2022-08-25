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
 * Request model to create a test run from multiple test sets
 */
@ApiModel(description = "Request model to create a test run from multiple test sets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-25T12:12:17.856+02:00[Europe/Budapest]")
public class CreateTestRunFromTestSetsRequest {
  public static final String SERIALIZED_NAME_TEST_RUN_MODEL = "testRunModel";
  @SerializedName(SERIALIZED_NAME_TEST_RUN_MODEL)
  private TrackerItem testRunModel;

  public static final String SERIALIZED_NAME_TEST_SET_REFS = "testSetRefs";
  @SerializedName(SERIALIZED_NAME_TEST_SET_REFS)
  private List<TrackerItemReference> testSetRefs = null;


  public CreateTestRunFromTestSetsRequest testRunModel(TrackerItem testRunModel) {
    
    this.testRunModel = testRunModel;
    return this;
  }

   /**
   * Get testRunModel
   * @return testRunModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrackerItem getTestRunModel() {
    return testRunModel;
  }


  public void setTestRunModel(TrackerItem testRunModel) {
    this.testRunModel = testRunModel;
  }


  public CreateTestRunFromTestSetsRequest testSetRefs(List<TrackerItemReference> testSetRefs) {
    
    this.testSetRefs = testSetRefs;
    return this;
  }

  public CreateTestRunFromTestSetsRequest addTestSetRefsItem(TrackerItemReference testSetRefsItem) {
    if (this.testSetRefs == null) {
      this.testSetRefs = new ArrayList<TrackerItemReference>();
    }
    this.testSetRefs.add(testSetRefsItem);
    return this;
  }

   /**
   * Test set ids to include into the test run. Only the first test set will be considered.
   * @return testSetRefs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Test set ids to include into the test run. Only the first test set will be considered.")

  public List<TrackerItemReference> getTestSetRefs() {
    return testSetRefs;
  }


  public void setTestSetRefs(List<TrackerItemReference> testSetRefs) {
    this.testSetRefs = testSetRefs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTestRunFromTestSetsRequest createTestRunFromTestSetsRequest = (CreateTestRunFromTestSetsRequest) o;
    return Objects.equals(this.testRunModel, createTestRunFromTestSetsRequest.testRunModel) &&
        Objects.equals(this.testSetRefs, createTestRunFromTestSetsRequest.testSetRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testRunModel, testSetRefs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTestRunFromTestSetsRequest {\n");
    sb.append("    testRunModel: ").append(toIndentedString(testRunModel)).append("\n");
    sb.append("    testSetRefs: ").append(toIndentedString(testSetRefs)).append("\n");
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

