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
import com.smartrecruiters.api.posting.model.Company;
import com.smartrecruiters.api.posting.model.Creator;
import com.smartrecruiters.api.posting.model.CustomField;
import com.smartrecruiters.api.posting.model.Department;
import com.smartrecruiters.api.posting.model.ExperienceLevel;
import com.smartrecruiters.api.posting.model.Function;
import com.smartrecruiters.api.posting.model.Industry;
import com.smartrecruiters.api.posting.model.JobAd;
import com.smartrecruiters.api.posting.model.Language;
import com.smartrecruiters.api.posting.model.PostingLocation;
import com.smartrecruiters.api.posting.model.TypeOfEmployment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Posting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-16T21:38:45.050245+01:00[Europe/London]")
public class Posting {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_APPLY_URL = "applyUrl";
  @SerializedName(SERIALIZED_NAME_APPLY_URL)
  private String applyUrl;

  public static final String SERIALIZED_NAME_POSTING_URL = "postingUrl";
  @SerializedName(SERIALIZED_NAME_POSTING_URL)
  private String postingUrl;

  public static final String SERIALIZED_NAME_REF_NUMBER = "refNumber";
  @SerializedName(SERIALIZED_NAME_REF_NUMBER)
  private String refNumber;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private Company company;

  public static final String SERIALIZED_NAME_RELEASE_DATE = "releaseDate";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE)
  private OffsetDateTime releaseDate;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private PostingLocation location;

  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private Industry industry;

  public static final String SERIALIZED_NAME_DEPARTMENT = "department";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT)
  private Department department;

  public static final String SERIALIZED_NAME_FUNCTION = "function";
  @SerializedName(SERIALIZED_NAME_FUNCTION)
  private Function function;

  public static final String SERIALIZED_NAME_TYPE_OF_EMPLOYMENT = "typeOfEmployment";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_EMPLOYMENT)
  private TypeOfEmployment typeOfEmployment;

  public static final String SERIALIZED_NAME_EXPERIENCE_LEVEL = "experienceLevel";
  @SerializedName(SERIALIZED_NAME_EXPERIENCE_LEVEL)
  private ExperienceLevel experienceLevel;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD = "customField";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD)
  private List<CustomField> customField = null;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private Creator creator;

  public static final String SERIALIZED_NAME_JOB_AD = "jobAd";
  @SerializedName(SERIALIZED_NAME_JOB_AD)
  private JobAd jobAd;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private Language language;


  public Posting id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public Posting uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUuid() {
    return uuid;
  }



  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public Posting name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }



  public void setName(String name) {
    this.name = name;
  }


  public Posting applyUrl(String applyUrl) {
    
    this.applyUrl = applyUrl;
    return this;
  }

   /**
   * Get applyUrl
   * @return applyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApplyUrl() {
    return applyUrl;
  }



  public void setApplyUrl(String applyUrl) {
    this.applyUrl = applyUrl;
  }


  public Posting postingUrl(String postingUrl) {
    
    this.postingUrl = postingUrl;
    return this;
  }

   /**
   * Get postingUrl
   * @return postingUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostingUrl() {
    return postingUrl;
  }



  public void setPostingUrl(String postingUrl) {
    this.postingUrl = postingUrl;
  }


  public Posting refNumber(String refNumber) {
    
    this.refNumber = refNumber;
    return this;
  }

   /**
   * Get refNumber
   * @return refNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefNumber() {
    return refNumber;
  }



  public void setRefNumber(String refNumber) {
    this.refNumber = refNumber;
  }


  public Posting company(Company company) {
    
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Company getCompany() {
    return company;
  }



  public void setCompany(Company company) {
    this.company = company;
  }


  public Posting releaseDate(OffsetDateTime releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * Get releaseDate
   * @return releaseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getReleaseDate() {
    return releaseDate;
  }



  public void setReleaseDate(OffsetDateTime releaseDate) {
    this.releaseDate = releaseDate;
  }


  public Posting location(PostingLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PostingLocation getLocation() {
    return location;
  }



  public void setLocation(PostingLocation location) {
    this.location = location;
  }


  public Posting industry(Industry industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Industry getIndustry() {
    return industry;
  }



  public void setIndustry(Industry industry) {
    this.industry = industry;
  }


  public Posting department(Department department) {
    
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Department getDepartment() {
    return department;
  }



  public void setDepartment(Department department) {
    this.department = department;
  }


  public Posting function(Function function) {
    
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Function getFunction() {
    return function;
  }



  public void setFunction(Function function) {
    this.function = function;
  }


  public Posting typeOfEmployment(TypeOfEmployment typeOfEmployment) {
    
    this.typeOfEmployment = typeOfEmployment;
    return this;
  }

   /**
   * Get typeOfEmployment
   * @return typeOfEmployment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeOfEmployment getTypeOfEmployment() {
    return typeOfEmployment;
  }



  public void setTypeOfEmployment(TypeOfEmployment typeOfEmployment) {
    this.typeOfEmployment = typeOfEmployment;
  }


  public Posting experienceLevel(ExperienceLevel experienceLevel) {
    
    this.experienceLevel = experienceLevel;
    return this;
  }

   /**
   * Get experienceLevel
   * @return experienceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExperienceLevel getExperienceLevel() {
    return experienceLevel;
  }



  public void setExperienceLevel(ExperienceLevel experienceLevel) {
    this.experienceLevel = experienceLevel;
  }


  public Posting customField(List<CustomField> customField) {
    
    this.customField = customField;
    return this;
  }

  public Posting addCustomFieldItem(CustomField customFieldItem) {
    if (this.customField == null) {
      this.customField = new ArrayList<CustomField>();
    }
    this.customField.add(customFieldItem);
    return this;
  }

   /**
   * Get customField
   * @return customField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomField> getCustomField() {
    return customField;
  }



  public void setCustomField(List<CustomField> customField) {
    this.customField = customField;
  }


  public Posting ref(String ref) {
    
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRef() {
    return ref;
  }



  public void setRef(String ref) {
    this.ref = ref;
  }


  public Posting creator(Creator creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Creator getCreator() {
    return creator;
  }



  public void setCreator(Creator creator) {
    this.creator = creator;
  }


  public Posting jobAd(JobAd jobAd) {
    
    this.jobAd = jobAd;
    return this;
  }

   /**
   * Get jobAd
   * @return jobAd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobAd getJobAd() {
    return jobAd;
  }



  public void setJobAd(JobAd jobAd) {
    this.jobAd = jobAd;
  }


  public Posting language(Language language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Language getLanguage() {
    return language;
  }



  public void setLanguage(Language language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Posting posting = (Posting) o;
    return Objects.equals(this.id, posting.id) &&
        Objects.equals(this.uuid, posting.uuid) &&
        Objects.equals(this.name, posting.name) &&
        Objects.equals(this.applyUrl, posting.applyUrl) &&
        Objects.equals(this.postingUrl, posting.postingUrl) &&
        Objects.equals(this.refNumber, posting.refNumber) &&
        Objects.equals(this.company, posting.company) &&
        Objects.equals(this.releaseDate, posting.releaseDate) &&
        Objects.equals(this.location, posting.location) &&
        Objects.equals(this.industry, posting.industry) &&
        Objects.equals(this.department, posting.department) &&
        Objects.equals(this.function, posting.function) &&
        Objects.equals(this.typeOfEmployment, posting.typeOfEmployment) &&
        Objects.equals(this.experienceLevel, posting.experienceLevel) &&
        Objects.equals(this.customField, posting.customField) &&
        Objects.equals(this.ref, posting.ref) &&
        Objects.equals(this.creator, posting.creator) &&
        Objects.equals(this.jobAd, posting.jobAd) &&
        Objects.equals(this.language, posting.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uuid, name, applyUrl, postingUrl, refNumber, company, releaseDate, location, industry, department, function, typeOfEmployment, experienceLevel, customField, ref, creator, jobAd, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Posting {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    applyUrl: ").append(toIndentedString(applyUrl)).append("\n");
    sb.append("    postingUrl: ").append(toIndentedString(postingUrl)).append("\n");
    sb.append("    refNumber: ").append(toIndentedString(refNumber)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    typeOfEmployment: ").append(toIndentedString(typeOfEmployment)).append("\n");
    sb.append("    experienceLevel: ").append(toIndentedString(experienceLevel)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    jobAd: ").append(toIndentedString(jobAd)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

