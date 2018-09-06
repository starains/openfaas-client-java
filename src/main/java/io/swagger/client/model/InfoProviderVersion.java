/*
 * OpenFaaS API Gateway
 * OpenFaaS API documentation
 *
 * OpenAPI spec version: 0.8.12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Version of the OpenFaaS Provider
 */
@ApiModel(description = "Version of the OpenFaaS Provider")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T06:46:10.176+02:00")
public class InfoProviderVersion {
  @SerializedName("commit_message")
  private String commitMessage = null;

  @SerializedName("sha")
  private String sha = null;

  @SerializedName("release")
  private String release = null;

  public InfoProviderVersion commitMessage(String commitMessage) {
    this.commitMessage = commitMessage;
    return this;
  }

   /**
   * Get commitMessage
   * @return commitMessage
  **/
  @ApiModelProperty(example = "Sample Message", value = "")
  public String getCommitMessage() {
    return commitMessage;
  }

  public void setCommitMessage(String commitMessage) {
    this.commitMessage = commitMessage;
  }

  public InfoProviderVersion sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * Get sha
   * @return sha
  **/
  @ApiModelProperty(example = "7108418d9dd6b329ddff40e7393b3166f8160a88", value = "")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public InfoProviderVersion release(String release) {
    this.release = release;
    return this;
  }

   /**
   * Get release
   * @return release
  **/
  @ApiModelProperty(example = "0.2.6", value = "")
  public String getRelease() {
    return release;
  }

  public void setRelease(String release) {
    this.release = release;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoProviderVersion infoProviderVersion = (InfoProviderVersion) o;
    return Objects.equals(this.commitMessage, infoProviderVersion.commitMessage) &&
        Objects.equals(this.sha, infoProviderVersion.sha) &&
        Objects.equals(this.release, infoProviderVersion.release);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitMessage, sha, release);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoProviderVersion {\n");
    
    sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
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

