package com.tkarov.gatewayairlines.model.response;

import com.tkarov.gatewayairlines.persistence.model.VaccinationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseBody implements Serializable {

    static final long serialVersionUID = 1L;

    @NotNull
    private Long id;

    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    private String password;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    private VaccinationStatus vaccinationStatus;
}
