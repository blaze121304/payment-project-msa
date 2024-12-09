package com.rusty.membership.application.port.out;

import com.rusty.membership.domain.Membership;

public interface FindMembershipPort {

	Membership findMembership(
			Membership.MembershipId membershipId
	);
}
