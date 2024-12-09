package com.rusty.membership.adapter.in.web.register;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMembershipRequest {
    private String name;

    private String address;

    private String email;
}
