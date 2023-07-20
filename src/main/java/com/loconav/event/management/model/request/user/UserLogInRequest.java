package com.loconav.event.management.model.request.user;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.loconav.event.management.constants.ConstantUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserLogInRequest {
    @Email
    @Pattern(regexp = ConstantUtils.EMAIL_REGEX, message = "Please provide a valid email address")
    private String email;

    @NotBlank
    private String password;
}
