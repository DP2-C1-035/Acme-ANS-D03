
package acme.realms.flightcrewmember;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import acme.client.repositories.AbstractRepository;

public interface FlightCrewMemberRepository extends AbstractRepository {

	@Query("select a from FlightCrewMember a where a.employeeCode = :employeeCode")
	List<FlightCrewMember> findByEmployeeCode(String employeeCode);
}
