package com.rusty.membership.application.port.in;


import com.rusty.common.events.SelfValidating;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;


@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public
class RegisterMembershipCommand extends SelfValidating<RegisterMembershipCommand> {

    @NotNull
    private final String name;

    @NotNull
    private final String email;

    @NotNull
    private final String address;

    @NotNull
    private final boolean isValid;

    public RegisterMembershipCommand(String name, String email, String address, boolean isValid) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.isValid = isValid;
    }
}
