/*
 * Posting API - version 1
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartrecruiters.api.posting.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartrecruiters.api.posting.model.Department;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Departments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-16T21:38:45.050245+01:00[Europe/London]")
public class Departments {
  public static final String SERIALIZED_NAME_TOTAL_FOUND = "totalFound";
  @SerializedName(SERIALIZED_NAME_TOTAL_FOUND)
  private Integer totalFound;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<Department> content = null;


  public Departments totalFound(Integer totalFound) {
    
    this.totalFound = totalFound;
    return this;
  }

   /**
   * Get totalFound
   * @return totalFound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalFound() {
    return totalFound;
  }



  public void setTotalFound(Integer totalFound) {
    this.totalFound = totalFound;
  }


  public Departments content(List<Department> content) {
    
    this.content = content;
    return this;
  }

  public Departments addContentItem(Department contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<Department>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Department> getContent() {
    return content;
  }



  public void setContent(List<Department> content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Departments departments = (Departments) o;
    return Objects.equals(this.totalFound, departments.totalFound) &&
        Objects.equals(this.content, departments.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalFound, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Departments {\n");
    sb.append("    totalFound: ").append(toIndentedString(totalFound)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

