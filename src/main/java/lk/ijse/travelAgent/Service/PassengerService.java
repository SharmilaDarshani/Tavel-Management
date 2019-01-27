package lk.ijse.travelAgent.Service;

import lk.ijse.travelAgent.dto.PassengerDTO;
import lk.ijse.travelAgent.entity.Passenger;

import java.util.List;

public interface PassengerService {
    void savePassenger(PassengerDTO passengerDTO);

    List<PassengerDTO> getAllPassengers();

    void updatePassenger(PassengerDTO passengerDTO);

    Passenger searchPassenger(Integer passID);

    void deletePassenger(Integer passID);
}
