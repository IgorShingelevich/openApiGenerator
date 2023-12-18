/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.7.1-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model.adobe;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.client.model.adobe.SamlConfigurationProperties;

/**
 * SamlConfigurationInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-14T17:32:45.038644100+03:00[Europe/Moscow]")
public class SamlConfigurationInfo {
  public static final String SERIALIZED_NAME_BUNDLE_LOCATION = "bundle_location";
  @SerializedName(SERIALIZED_NAME_BUNDLE_LOCATION)
  private String bundleLocation;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private SamlConfigurationProperties properties;

  public static final String SERIALIZED_NAME_SERVICE_LOCATION = "service_location";
  @SerializedName(SERIALIZED_NAME_SERVICE_LOCATION)
  private String serviceLocation;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public SamlConfigurationInfo() {
  }

  public SamlConfigurationInfo bundleLocation(String bundleLocation) {
    
    this.bundleLocation = bundleLocation;
    return this;
  }

   /**
   * needed for configuration binding
   * @return bundleLocation
  **/
  @javax.annotation.Nullable

  public String getBundleLocation() {
    return bundleLocation;
  }


  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }


  public SamlConfigurationInfo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Title
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SamlConfigurationInfo pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * Persistent Identity (PID)
   * @return pid
  **/
  @javax.annotation.Nullable

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public SamlConfigurationInfo properties(SamlConfigurationProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable

  public SamlConfigurationProperties getProperties() {
    return properties;
  }


  public void setProperties(SamlConfigurationProperties properties) {
    this.properties = properties;
  }


  public SamlConfigurationInfo serviceLocation(String serviceLocation) {
    
    this.serviceLocation = serviceLocation;
    return this;
  }

   /**
   * needed for configuraiton binding
   * @return serviceLocation
  **/
  @javax.annotation.Nullable

  public String getServiceLocation() {
    return serviceLocation;
  }


  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }


  public SamlConfigurationInfo title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SamlConfigurationInfo samlConfigurationInfo = (SamlConfigurationInfo) o;
    return Objects.equals(this.bundleLocation, samlConfigurationInfo.bundleLocation) &&
        Objects.equals(this.description, samlConfigurationInfo.description) &&
        Objects.equals(this.pid, samlConfigurationInfo.pid) &&
        Objects.equals(this.properties, samlConfigurationInfo.properties) &&
        Objects.equals(this.serviceLocation, samlConfigurationInfo.serviceLocation) &&
        Objects.equals(this.title, samlConfigurationInfo.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleLocation, description, pid, properties, serviceLocation, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlConfigurationInfo {\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
