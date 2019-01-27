package lk.ijse.travelAgent.repository;

import lk.ijse.travelAgent.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
}
