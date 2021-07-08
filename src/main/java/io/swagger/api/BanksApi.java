/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InlineResponse20033;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-07-03T14:36:23.648Z[GMT]")
@Validated
public interface BanksApi {

    @Operation(summary = "Verify Bank Account Details", description = "", tags={ "Verification API" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse20033.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))) })
    @RequestMapping(value = "/banks/{id_type}:{id}/accounts/{acc_num}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse20033> banksIdTypeidAccountsAccNumPost(@Parameter(in = ParameterIn.PATH, description = "can have 2 values- ifsc or bank_code", required=true, schema=@Schema()) @PathVariable("id_type") String idType, @Parameter(in = ParameterIn.PATH, description = "IFSC code if ifsc is selected as id_type and bank code if bank_code is selected as id_type", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.PATH, description = "pass complete account number which needs to be verified", required=true, schema=@Schema()) @PathVariable("acc_num") Integer accNum, @NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "initiator_id", required = true) String initiatorId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "User code value of the retailer" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customer_id", required = true) Integer customerId, @NotNull @Parameter(in = ParameterIn.QUERY, description = "The unique cell number" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "user_code", required = true) String userCode, @Parameter(in = ParameterIn.HEADER, description = "Your unique API key" ,required=true,schema=@Schema()) @RequestHeader(value="developer_key", required=true) String developerKey, @Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key", required=true) String secretKey, @Parameter(in = ParameterIn.HEADER, description = "Please refer to authentication section [https://developers.eko.in/docs/authentication]" ,required=true,schema=@Schema()) @RequestHeader(value="secret_key_timestamp", required=true) String secretKeyTimestamp);

}
