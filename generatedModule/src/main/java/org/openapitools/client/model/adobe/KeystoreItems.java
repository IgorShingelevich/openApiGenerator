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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.adobe.KeystoreChainItems;

/**
 * KeystoreItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-10T13:32:52.700035300+03:00[Europe/Moscow]")
public class KeystoreItems {
  public static final String SERIALIZED_NAME_ALGORITHM = "algorithm";
  @SerializedName(SERIALIZED_NAME_ALGORITHM)
  private String algorithm;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_CHAIN = "chain";
  @SerializedName(SERIALIZED_NAME_CHAIN)
  private List<KeystoreChainItems> chain;

  public static final String SERIALIZED_NAME_ENTRY_TYPE = "entryType";
  @SerializedName(SERIALIZED_NAME_ENTRY_TYPE)
  private String entryType;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public KeystoreItems() {
  }

  public KeystoreItems algorithm(String algorithm) {
    
    this.algorithm = algorithm;
    return this;
  }

   /**
   * e.g. \&quot;RSA\&quot;
   * @return algorithm
  **/
  @javax.annotation.Nullable

  public String getAlgorithm() {
    return algorithm;
  }


  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }


  public KeystoreItems alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Keystore alias name
   * @return alias
  **/
  @javax.annotation.Nullable

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public KeystoreItems chain(List<KeystoreChainItems> chain) {
    
    this.chain = chain;
    return this;
  }

  public KeystoreItems addChainItem(KeystoreChainItems chainItem) {
    if (this.chain == null) {
      this.chain = new ArrayList<>();
    }
    this.chain.add(chainItem);
    return this;
  }

   /**
   * Get chain
   * @return chain
  **/
  @javax.annotation.Nullable

  public List<KeystoreChainItems> getChain() {
    return chain;
  }


  public void setChain(List<KeystoreChainItems> chain) {
    this.chain = chain;
  }


  public KeystoreItems entryType(String entryType) {
    
    this.entryType = entryType;
    return this;
  }

   /**
   * e.g. \&quot;privateKey\&quot;
   * @return entryType
  **/
  @javax.annotation.Nullable

  public String getEntryType() {
    return entryType;
  }


  public void setEntryType(String entryType) {
    this.entryType = entryType;
  }


  public KeystoreItems format(String format) {
    
    this.format = format;
    return this;
  }

   /**
   * e.g. \&quot;PKCS#8\&quot;
   * @return format
  **/
  @javax.annotation.Nullable

  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeystoreItems keystoreItems = (KeystoreItems) o;
    return Objects.equals(this.algorithm, keystoreItems.algorithm) &&
        Objects.equals(this.alias, keystoreItems.alias) &&
        Objects.equals(this.chain, keystoreItems.chain) &&
        Objects.equals(this.entryType, keystoreItems.entryType) &&
        Objects.equals(this.format, keystoreItems.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, alias, chain, entryType, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeystoreItems {\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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

