package com.rusty.membership.application.port.in;

import com.rusty.membership.domain.Membership;

public interface FindMembershipUseCase {

	Membership findMembership(FindMembershipCommand command);
	Membership findAxonMembership(FindMembershipCommand command);
}
