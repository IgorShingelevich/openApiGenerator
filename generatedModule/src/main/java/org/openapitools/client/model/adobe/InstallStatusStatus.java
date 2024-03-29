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

/**
 * InstallStatusStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-10T12:02:36.334870200+03:00[Europe/Moscow]")
public class InstallStatusStatus {
  public static final String SERIALIZED_NAME_FINISHED = "finished";
  @SerializedName(SERIALIZED_NAME_FINISHED)
  private Boolean finished;

  public static final String SERIALIZED_NAME_ITEM_COUNT = "itemCount";
  @SerializedName(SERIALIZED_NAME_ITEM_COUNT)
  private Integer itemCount;

  public InstallStatusStatus() {
  }

  public InstallStatusStatus finished(Boolean finished) {
    
    this.finished = finished;
    return this;
  }

   /**
   * Get finished
   * @return finished
  **/
  @javax.annotation.Nullable

  public Boolean getFinished() {
    return finished;
  }


  public void setFinished(Boolean finished) {
    this.finished = finished;
  }


  public InstallStatusStatus itemCount(Integer itemCount) {
    
    this.itemCount = itemCount;
    return this;
  }

   /**
   * Get itemCount
   * @return itemCount
  **/
  @javax.annotation.Nullable

  public Integer getItemCount() {
    return itemCount;
  }


  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallStatusStatus installStatusStatus = (InstallStatusStatus) o;
    return Objects.equals(this.finished, installStatusStatus.finished) &&
        Objects.equals(this.itemCount, installStatusStatus.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finished, itemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallStatusStatus {\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
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

