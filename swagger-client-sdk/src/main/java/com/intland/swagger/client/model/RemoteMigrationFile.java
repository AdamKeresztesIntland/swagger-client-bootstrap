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

/**
 * A file to migrate from a remote directory.
 */
@ApiModel(description = "A file to migrate from a remote directory.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-31T15:42:25.542+02:00[Europe/Budapest]")
public class RemoteMigrationFile {
  public static final String SERIALIZED_NAME_SHA512SUM = "sha512sum";
  @SerializedName(SERIALIZED_NAME_SHA512SUM)
  private String sha512sum;

  public static final String SERIALIZED_NAME_MD5SUM = "md5sum";
  @SerializedName(SERIALIZED_NAME_MD5SUM)
  private String md5sum;

  public static final String SERIALIZED_NAME_FILE_PATH = "filePath";
  @SerializedName(SERIALIZED_NAME_FILE_PATH)
  private String filePath;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public RemoteMigrationFile sha512sum(String sha512sum) {
    this.sha512sum = sha512sum;
    return this;
  }

   /**
   * Precomputed SHA512 checksum of the file.
   * @return sha512sum
  **/
  @ApiModelProperty(example = "2e74ed4b0741e1fbe22d61e165c7c0dc4383a1aa5aa708291e32fff4cb189b9a5dfea7ffca2a22dcca258751cf4ad947c1c34abdf3fa2994219be394fbe40370", value = "Precomputed SHA512 checksum of the file.")
  public String getSha512sum() {
    return sha512sum;
  }

  public void setSha512sum(String sha512sum) {
    this.sha512sum = sha512sum;
  }

  public RemoteMigrationFile md5sum(String md5sum) {
    this.md5sum = md5sum;
    return this;
  }

   /**
   * Precomputed MD5 checksum of the file.
   * @return md5sum
  **/
  @ApiModelProperty(example = "f6967f92c24a8f3c4849d30c9f17e321", value = "Precomputed MD5 checksum of the file.")
  public String getMd5sum() {
    return md5sum;
  }

  public void setMd5sum(String md5sum) {
    this.md5sum = md5sum;
  }

  public RemoteMigrationFile filePath(String filePath) {
    this.filePath = filePath;
    return this;
  }

   /**
   * The path of the file relative to the configured migration home directory.
   * @return filePath
  **/
  @ApiModelProperty(example = "folder/file.txt", value = "The path of the file relative to the configured migration home directory.")
  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public RemoteMigrationFile fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * File name of the newly created attachment.
   * @return fileName
  **/
  @ApiModelProperty(example = "newFile.txt", value = "File name of the newly created attachment.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteMigrationFile remoteMigrationFile = (RemoteMigrationFile) o;
    return Objects.equals(this.sha512sum, remoteMigrationFile.sha512sum) &&
        Objects.equals(this.md5sum, remoteMigrationFile.md5sum) &&
        Objects.equals(this.filePath, remoteMigrationFile.filePath) &&
        Objects.equals(this.fileName, remoteMigrationFile.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha512sum, md5sum, filePath, fileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteMigrationFile {\n");
    sb.append("    sha512sum: ").append(toIndentedString(sha512sum)).append("\n");
    sb.append("    md5sum: ").append(toIndentedString(md5sum)).append("\n");
    sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

