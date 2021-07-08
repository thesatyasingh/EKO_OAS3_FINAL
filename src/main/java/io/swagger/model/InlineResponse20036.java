package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse20036
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-07-03T14:36:23.648Z[GMT]")


public class InlineResponse20036   {
  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("status_desc")
  private String statusDesc = null;

  @JsonProperty("response_code")
  private String responseCode = null;

  @JsonProperty("response_code_desc")
  private String responseCodeDesc = null;

  @JsonProperty("response_status_id")
  private Integer responseStatusId = null;

  @JsonProperty("data")
  private Object data = null;

  public InlineResponse20036 status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public InlineResponse20036 statusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
    return this;
  }

  /**
   * Get statusDesc
   * @return statusDesc
   **/
  @Schema(description = "")
  
    public String getStatusDesc() {
    return statusDesc;
  }

  public void setStatusDesc(String statusDesc) {
    this.statusDesc = statusDesc;
  }

  public InlineResponse20036 responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
   **/
  @Schema(description = "")
  
    public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public InlineResponse20036 responseCodeDesc(String responseCodeDesc) {
    this.responseCodeDesc = responseCodeDesc;
    return this;
  }

  /**
   * Get responseCodeDesc
   * @return responseCodeDesc
   **/
  @Schema(description = "")
  
    public String getResponseCodeDesc() {
    return responseCodeDesc;
  }

  public void setResponseCodeDesc(String responseCodeDesc) {
    this.responseCodeDesc = responseCodeDesc;
  }

  public InlineResponse20036 responseStatusId(Integer responseStatusId) {
    this.responseStatusId = responseStatusId;
    return this;
  }

  /**
   * Get responseStatusId
   * @return responseStatusId
   **/
  @Schema(description = "")
  
    public Integer getResponseStatusId() {
    return responseStatusId;
  }

  public void setResponseStatusId(Integer responseStatusId) {
    this.responseStatusId = responseStatusId;
  }

  public InlineResponse20036 data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20036 inlineResponse20036 = (InlineResponse20036) o;
    return Objects.equals(this.status, inlineResponse20036.status) &&
        Objects.equals(this.statusDesc, inlineResponse20036.statusDesc) &&
        Objects.equals(this.responseCode, inlineResponse20036.responseCode) &&
        Objects.equals(this.responseCodeDesc, inlineResponse20036.responseCodeDesc) &&
        Objects.equals(this.responseStatusId, inlineResponse20036.responseStatusId) &&
        Objects.equals(this.data, inlineResponse20036.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusDesc, responseCode, responseCodeDesc, responseStatusId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20036 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseCodeDesc: ").append(toIndentedString(responseCodeDesc)).append("\n");
    sb.append("    responseStatusId: ").append(toIndentedString(responseStatusId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
