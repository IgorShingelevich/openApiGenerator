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
 * KeystoreChainItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-10T13:32:52.700035300+03:00[Europe/Moscow]")
public class KeystoreChainItems {
  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_NOT_AFTER = "notAfter";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  private String notAfter;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "notBefore";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  private String notBefore;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private Integer serialNumber;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public KeystoreChainItems() {
  }

  public KeystoreChainItems issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * e.g. \&quot;CN&#x3D;Admin\&quot;
   * @return issuer
  **/
  @javax.annotation.Nullable

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public KeystoreChainItems notAfter(String notAfter) {
    
    this.notAfter = notAfter;
    return this;
  }

   /**
   * e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;
   * @return notAfter
  **/
  @javax.annotation.Nullable

  public String getNotAfter() {
    return notAfter;
  }


  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }


  public KeystoreChainItems notBefore(String notBefore) {
    
    this.notBefore = notBefore;
    return this;
  }

   /**
   * e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;
   * @return notBefore
  **/
  @javax.annotation.Nullable

  public String getNotBefore() {
    return notBefore;
  }


  public void setNotBefore(String notBefore) {
    this.notBefore = notBefore;
  }


  public KeystoreChainItems serialNumber(Integer serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * 18165099476682912368
   * @return serialNumber
  **/
  @javax.annotation.Nullable

  public Integer getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(Integer serialNumber) {
    this.serialNumber = serialNumber;
  }


  public KeystoreChainItems subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * e.g. \&quot;CN&#x3D;localhost\&quot;
   * @return subject
  **/
  @javax.annotation.Nullable

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeystoreChainItems keystoreChainItems = (KeystoreChainItems) o;
    return Objects.equals(this.issuer, keystoreChainItems.issuer) &&
        Objects.equals(this.notAfter, keystoreChainItems.notAfter) &&
        Objects.equals(this.notBefore, keystoreChainItems.notBefore) &&
        Objects.equals(this.serialNumber, keystoreChainItems.serialNumber) &&
        Objects.equals(this.subject, keystoreChainItems.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuer, notAfter, notBefore, serialNumber, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreChainItems {\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

