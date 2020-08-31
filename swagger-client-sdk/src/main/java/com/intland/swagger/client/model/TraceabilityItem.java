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
import com.intland.swagger.client.model.TrackerItemRevision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Traceability Item
 */
@ApiModel(description = "Traceability Item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T15:42:25.542+02:00[Europe/Budapest]")
public class TraceabilityItem {
  public static final String SERIALIZED_NAME_ITEM_REVISION = "itemRevision";
  @SerializedName(SERIALIZED_NAME_ITEM_REVISION)
  private TrackerItemRevision itemRevision = null;

  public static final String SERIALIZED_NAME_OUTGOING_REFERENCE = "outgoing reference";
  @SerializedName(SERIALIZED_NAME_OUTGOING_REFERENCE)
  private List<TrackerItemRevision> outgoingReference = new ArrayList<TrackerItemRevision>();

  public static final String SERIALIZED_NAME_INCOMING_REFERENCE = "incoming reference";
  @SerializedName(SERIALIZED_NAME_INCOMING_REFERENCE)
  private List<TrackerItemRevision> incomingReference = new ArrayList<TrackerItemRevision>();

  public static final String SERIALIZED_NAME_OUTGOING_ASSOCIATION = "outgoing association";
  @SerializedName(SERIALIZED_NAME_OUTGOING_ASSOCIATION)
  private List<TrackerItemRevision> outgoingAssociation = new ArrayList<TrackerItemRevision>();

  public static final String SERIALIZED_NAME_INCOMING_ASSOCIATION = "incoming association";
  @SerializedName(SERIALIZED_NAME_INCOMING_ASSOCIATION)
  private List<TrackerItemRevision> incomingAssociation = new ArrayList<TrackerItemRevision>();

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<TraceabilityItem> children = new ArrayList<TraceabilityItem>();

  public static final String SERIALIZED_NAME_OUTGOING_REFERENCES = "outgoingReferences";
  @SerializedName(SERIALIZED_NAME_OUTGOING_REFERENCES)
  private List<TrackerItemRevision> outgoingReferences = new ArrayList<TrackerItemRevision>();

  public static final String SERIALIZED_NAME_OUTGOING_ASSOCIATIONS = "outgoingAssociations";
  @SerializedName(SERIALIZED_NAME_OUTGOING_ASSOCIATIONS)
  private List<TrackerItemRevision> outgoingAssociations = new ArrayList<TrackerItemRevision>();

  public static final String SERIALIZED_NAME_INCOMING_REFERENCES = "incomingReferences";
  @SerializedName(SERIALIZED_NAME_INCOMING_REFERENCES)
  private List<TrackerItemRevision> incomingReferences = new ArrayList<TrackerItemRevision>();

  public static final String SERIALIZED_NAME_INCOMING_ASSOCIATIONS = "incomingAssociations";
  @SerializedName(SERIALIZED_NAME_INCOMING_ASSOCIATIONS)
  private List<TrackerItemRevision> incomingAssociations = new ArrayList<TrackerItemRevision>();

  public TraceabilityItem itemRevision(TrackerItemRevision itemRevision) {
    this.itemRevision = itemRevision;
    return this;
  }

   /**
   * Get itemRevision
   * @return itemRevision
  **/
  @ApiModelProperty(value = "")
  public TrackerItemRevision getItemRevision() {
    return itemRevision;
  }

  public void setItemRevision(TrackerItemRevision itemRevision) {
    this.itemRevision = itemRevision;
  }

  public TraceabilityItem outgoingReference(List<TrackerItemRevision> outgoingReference) {
    this.outgoingReference = outgoingReference;
    return this;
  }

  public TraceabilityItem addOutgoingReferenceItem(TrackerItemRevision outgoingReferenceItem) {
    if (this.outgoingReference == null) {
      this.outgoingReference = new ArrayList<TrackerItemRevision>();
    }
    this.outgoingReference.add(outgoingReferenceItem);
    return this;
  }

   /**
   * Get outgoingReference
   * @return outgoingReference
  **/
  @ApiModelProperty(value = "")
  public List<TrackerItemRevision> getOutgoingReference() {
    return outgoingReference;
  }

  public void setOutgoingReference(List<TrackerItemRevision> outgoingReference) {
    this.outgoingReference = outgoingReference;
  }

  public TraceabilityItem incomingReference(List<TrackerItemRevision> incomingReference) {
    this.incomingReference = incomingReference;
    return this;
  }

  public TraceabilityItem addIncomingReferenceItem(TrackerItemRevision incomingReferenceItem) {
    if (this.incomingReference == null) {
      this.incomingReference = new ArrayList<TrackerItemRevision>();
    }
    this.incomingReference.add(incomingReferenceItem);
    return this;
  }

   /**
   * Get incomingReference
   * @return incomingReference
  **/
  @ApiModelProperty(value = "")
  public List<TrackerItemRevision> getIncomingReference() {
    return incomingReference;
  }

  public void setIncomingReference(List<TrackerItemRevision> incomingReference) {
    this.incomingReference = incomingReference;
  }

  public TraceabilityItem outgoingAssociation(List<TrackerItemRevision> outgoingAssociation) {
    this.outgoingAssociation = outgoingAssociation;
    return this;
  }

  public TraceabilityItem addOutgoingAssociationItem(TrackerItemRevision outgoingAssociationItem) {
    if (this.outgoingAssociation == null) {
      this.outgoingAssociation = new ArrayList<TrackerItemRevision>();
    }
    this.outgoingAssociation.add(outgoingAssociationItem);
    return this;
  }

   /**
   * Get outgoingAssociation
   * @return outgoingAssociation
  **/
  @ApiModelProperty(value = "")
  public List<TrackerItemRevision> getOutgoingAssociation() {
    return outgoingAssociation;
  }

  public void setOutgoingAssociation(List<TrackerItemRevision> outgoingAssociation) {
    this.outgoingAssociation = outgoingAssociation;
  }

  public TraceabilityItem incomingAssociation(List<TrackerItemRevision> incomingAssociation) {
    this.incomingAssociation = incomingAssociation;
    return this;
  }

  public TraceabilityItem addIncomingAssociationItem(TrackerItemRevision incomingAssociationItem) {
    if (this.incomingAssociation == null) {
      this.incomingAssociation = new ArrayList<TrackerItemRevision>();
    }
    this.incomingAssociation.add(incomingAssociationItem);
    return this;
  }

   /**
   * Get incomingAssociation
   * @return incomingAssociation
  **/
  @ApiModelProperty(value = "")
  public List<TrackerItemRevision> getIncomingAssociation() {
    return incomingAssociation;
  }

  public void setIncomingAssociation(List<TrackerItemRevision> incomingAssociation) {
    this.incomingAssociation = incomingAssociation;
  }

  public TraceabilityItem children(List<TraceabilityItem> children) {
    this.children = children;
    return this;
  }

  public TraceabilityItem addChildrenItem(TraceabilityItem childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<TraceabilityItem>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * children
   * @return children
  **/
  @ApiModelProperty(value = "children")
  public List<TraceabilityItem> getChildren() {
    return children;
  }

  public void setChildren(List<TraceabilityItem> children) {
    this.children = children;
  }

  public TraceabilityItem outgoingReferences(List<TrackerItemRevision> outgoingReferences) {
    this.outgoingReferences = outgoingReferences;
    return this;
  }

  public TraceabilityItem addOutgoingReferencesItem(TrackerItemRevision outgoingReferencesItem) {
    if (this.outgoingReferences == null) {
      this.outgoingReferences = new ArrayList<TrackerItemRevision>();
    }
    this.outgoingReferences.add(outgoingReferencesItem);
    return this;
  }

   /**
   * outgoing reference
   * @return outgoingReferences
  **/
  @ApiModelProperty(value = "outgoing reference")
  public List<TrackerItemRevision> getOutgoingReferences() {
    return outgoingReferences;
  }

  public void setOutgoingReferences(List<TrackerItemRevision> outgoingReferences) {
    this.outgoingReferences = outgoingReferences;
  }

  public TraceabilityItem outgoingAssociations(List<TrackerItemRevision> outgoingAssociations) {
    this.outgoingAssociations = outgoingAssociations;
    return this;
  }

  public TraceabilityItem addOutgoingAssociationsItem(TrackerItemRevision outgoingAssociationsItem) {
    if (this.outgoingAssociations == null) {
      this.outgoingAssociations = new ArrayList<TrackerItemRevision>();
    }
    this.outgoingAssociations.add(outgoingAssociationsItem);
    return this;
  }

   /**
   * outgoing association
   * @return outgoingAssociations
  **/
  @ApiModelProperty(value = "outgoing association")
  public List<TrackerItemRevision> getOutgoingAssociations() {
    return outgoingAssociations;
  }

  public void setOutgoingAssociations(List<TrackerItemRevision> outgoingAssociations) {
    this.outgoingAssociations = outgoingAssociations;
  }

  public TraceabilityItem incomingReferences(List<TrackerItemRevision> incomingReferences) {
    this.incomingReferences = incomingReferences;
    return this;
  }

  public TraceabilityItem addIncomingReferencesItem(TrackerItemRevision incomingReferencesItem) {
    if (this.incomingReferences == null) {
      this.incomingReferences = new ArrayList<TrackerItemRevision>();
    }
    this.incomingReferences.add(incomingReferencesItem);
    return this;
  }

   /**
   * incoming references
   * @return incomingReferences
  **/
  @ApiModelProperty(value = "incoming references")
  public List<TrackerItemRevision> getIncomingReferences() {
    return incomingReferences;
  }

  public void setIncomingReferences(List<TrackerItemRevision> incomingReferences) {
    this.incomingReferences = incomingReferences;
  }

  public TraceabilityItem incomingAssociations(List<TrackerItemRevision> incomingAssociations) {
    this.incomingAssociations = incomingAssociations;
    return this;
  }

  public TraceabilityItem addIncomingAssociationsItem(TrackerItemRevision incomingAssociationsItem) {
    if (this.incomingAssociations == null) {
      this.incomingAssociations = new ArrayList<TrackerItemRevision>();
    }
    this.incomingAssociations.add(incomingAssociationsItem);
    return this;
  }

   /**
   * incoming associations
   * @return incomingAssociations
  **/
  @ApiModelProperty(value = "incoming associations")
  public List<TrackerItemRevision> getIncomingAssociations() {
    return incomingAssociations;
  }

  public void setIncomingAssociations(List<TrackerItemRevision> incomingAssociations) {
    this.incomingAssociations = incomingAssociations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceabilityItem traceabilityItem = (TraceabilityItem) o;
    return Objects.equals(this.itemRevision, traceabilityItem.itemRevision) &&
        Objects.equals(this.outgoingReference, traceabilityItem.outgoingReference) &&
        Objects.equals(this.incomingReference, traceabilityItem.incomingReference) &&
        Objects.equals(this.outgoingAssociation, traceabilityItem.outgoingAssociation) &&
        Objects.equals(this.incomingAssociation, traceabilityItem.incomingAssociation) &&
        Objects.equals(this.children, traceabilityItem.children) &&
        Objects.equals(this.outgoingReferences, traceabilityItem.outgoingReferences) &&
        Objects.equals(this.outgoingAssociations, traceabilityItem.outgoingAssociations) &&
        Objects.equals(this.incomingReferences, traceabilityItem.incomingReferences) &&
        Objects.equals(this.incomingAssociations, traceabilityItem.incomingAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemRevision, outgoingReference, incomingReference, outgoingAssociation, incomingAssociation, children, outgoingReferences, outgoingAssociations, incomingReferences, incomingAssociations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceabilityItem {\n");
    sb.append("    itemRevision: ").append(toIndentedString(itemRevision)).append("\n");
    sb.append("    outgoingReference: ").append(toIndentedString(outgoingReference)).append("\n");
    sb.append("    incomingReference: ").append(toIndentedString(incomingReference)).append("\n");
    sb.append("    outgoingAssociation: ").append(toIndentedString(outgoingAssociation)).append("\n");
    sb.append("    incomingAssociation: ").append(toIndentedString(incomingAssociation)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    outgoingReferences: ").append(toIndentedString(outgoingReferences)).append("\n");
    sb.append("    outgoingAssociations: ").append(toIndentedString(outgoingAssociations)).append("\n");
    sb.append("    incomingReferences: ").append(toIndentedString(incomingReferences)).append("\n");
    sb.append("    incomingAssociations: ").append(toIndentedString(incomingAssociations)).append("\n");
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

