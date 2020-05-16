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
import com.smartrecruiters.api.posting.model.JobAdSection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * JobAdSections
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-16T21:38:45.050245+01:00[Europe/London]")
public class JobAdSections {
  public static final String SERIALIZED_NAME_COMPANY_DESCRIPTION = "companyDescription";
  @SerializedName(SERIALIZED_NAME_COMPANY_DESCRIPTION)
  private JobAdSection companyDescription;

  public static final String SERIALIZED_NAME_JOB_DESCRIPTION = "jobDescription";
  @SerializedName(SERIALIZED_NAME_JOB_DESCRIPTION)
  private JobAdSection jobDescription;

  public static final String SERIALIZED_NAME_QUALIFICATIONS = "qualifications";
  @SerializedName(SERIALIZED_NAME_QUALIFICATIONS)
  private JobAdSection qualifications;

  public static final String SERIALIZED_NAME_ADDITIONAL_INFORMATION = "additionalInformation";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFORMATION)
  private JobAdSection additionalInformation;


  public JobAdSections companyDescription(JobAdSection companyDescription) {
    
    this.companyDescription = companyDescription;
    return this;
  }

   /**
   * Get companyDescription
   * @return companyDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobAdSection getCompanyDescription() {
    return companyDescription;
  }



  public void setCompanyDescription(JobAdSection companyDescription) {
    this.companyDescription = companyDescription;
  }


  public JobAdSections jobDescription(JobAdSection jobDescription) {
    
    this.jobDescription = jobDescription;
    return this;
  }

   /**
   * Get jobDescription
   * @return jobDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobAdSection getJobDescription() {
    return jobDescription;
  }



  public void setJobDescription(JobAdSection jobDescription) {
    this.jobDescription = jobDescription;
  }


  public JobAdSections qualifications(JobAdSection qualifications) {
    
    this.qualifications = qualifications;
    return this;
  }

   /**
   * Get qualifications
   * @return qualifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobAdSection getQualifications() {
    return qualifications;
  }



  public void setQualifications(JobAdSection qualifications) {
    this.qualifications = qualifications;
  }


  public JobAdSections additionalInformation(JobAdSection additionalInformation) {
    
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobAdSection getAdditionalInformation() {
    return additionalInformation;
  }



  public void setAdditionalInformation(JobAdSection additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobAdSections jobAdSections = (JobAdSections) o;
    return Objects.equals(this.companyDescription, jobAdSections.companyDescription) &&
        Objects.equals(this.jobDescription, jobAdSections.jobDescription) &&
        Objects.equals(this.qualifications, jobAdSections.qualifications) &&
        Objects.equals(this.additionalInformation, jobAdSections.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyDescription, jobDescription, qualifications, additionalInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobAdSections {\n");
    sb.append("    companyDescription: ").append(toIndentedString(companyDescription)).append("\n");
    sb.append("    jobDescription: ").append(toIndentedString(jobDescription)).append("\n");
    sb.append("    qualifications: ").append(toIndentedString(qualifications)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

