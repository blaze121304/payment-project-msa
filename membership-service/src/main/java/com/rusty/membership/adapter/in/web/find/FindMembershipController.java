package com.rusty.membership.adapter.in.web.find;

import com.rusty.membership.application.port.in.FindMembershipCommand;
import com.rusty.membership.application.port.in.FindMembershipUseCase;
import com.rusty.membership.domain.Membership;
import com.rusty.common.events.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
class FindMembershipController {

	private final FindMembershipUseCase findMembershipUseCase;

	@GetMapping(path = "/membership/{membershipId}")
	ResponseEntity<Membership> findMembershipByMemberId(@PathVariable String membershipId){

		FindMembershipCommand command = FindMembershipCommand.builder()
				.membershipId(membershipId)
				.build();
		return ResponseEntity.ok(findMembershipUseCase.findMembership(command));
	}

	@GetMapping(path = "/membership/axon/{membershipId}")
	ResponseEntity<Membership> findAxonMembershipByMemberId(@PathVariable String membershipId){

		FindMembershipCommand command = FindMembershipCommand.builder()
				.membershipId(membershipId)
				.build();

		return ResponseEntity.ok(findMembershipUseCase.findAxonMembership(command));
	}
}
