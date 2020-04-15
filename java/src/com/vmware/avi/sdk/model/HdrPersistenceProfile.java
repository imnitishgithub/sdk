/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * HdrPersistenceProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class HdrPersistenceProfile {
  @JsonProperty("prst_hdr_name")
  private String prstHdrName = null;

  public HdrPersistenceProfile prstHdrName(String prstHdrName) {
    this.prstHdrName = prstHdrName;
    return this;
  }

   /**
   * Header name for custom header persistence.
   * @return prstHdrName
  **/
  @Schema(description = "Header name for custom header persistence.")
  public String getPrstHdrName() {
    return prstHdrName;
  }

  public void setPrstHdrName(String prstHdrName) {
    this.prstHdrName = prstHdrName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HdrPersistenceProfile hdrPersistenceProfile = (HdrPersistenceProfile) o;
    return Objects.equals(this.prstHdrName, hdrPersistenceProfile.prstHdrName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prstHdrName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HdrPersistenceProfile {\n");
    
    sb.append("    prstHdrName: ").append(toIndentedString(prstHdrName)).append("\n");
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
