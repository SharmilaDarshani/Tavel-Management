package lk.ijse.travelAgent.Service.impl;

import lk.ijse.travelAgent.Service.PassengerService;
import lk.ijse.travelAgent.dto.PassengerDTO;
import lk.ijse.travelAgent.entity.Passenger;
import lk.ijse.travelAgent.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public void savePassenger(PassengerDTO passengerDTO) {
        Passenger passenger1= new Passenger(passengerDTO.getPassID(),
                                            passengerDTO.getPassName(),
                                            passengerDTO.getPassAddress(),
                                            passengerDTO.getPassNic(),
                                            passengerDTO.getPassPhone(),
                                            passengerDTO.getPassPassPortNo());
        passengerRepository.save(passenger1);
        System.out.println("save");
        
        

    }

    @Override
    public List<PassengerDTO> getAllPassengers() {
        List<PassengerDTO> list=new ArrayList<>();
        List<Passenger> allPas= passengerRepository.findAll();
        for (Passenger pase : allPas){
            list.add(new PassengerDTO(pase.getPassID(),
                                        pase.getPassName(),
                                        pase.getPassAddress(),
                                        pase.getPassNic(),
                                        pase.getPassMobile(),
                                        pase.getPassPassPortNo()));
            System.out.println("save");
        }
        return list;
        
    }

    @Override
    public void updatePassenger(PassengerDTO passengerDTO) {
//        String msg=null;
//        Passenger passenger= new Passenger(passengerDTO.getPassID(),
//                passengerDTO.getPassName(),
//                passengerDTO.getPassAddress(),
//                passengerDTO.getPassNic(),
//                passengerDTO.getPassPhone(),
//                passengerDTO.getPassPassPortNo());
//        //if(passenger.getPassID()!= null){
//            passengerRepository.save(passenger);
//            System.out.println("Updated");
//        //}else{
//            System.out.println("Error");
//        }

    }

    @Override
    public Passenger searchPassenger(Integer passID) {
        Optional<Passenger> pass = this.passengerRepository.findById(passID);
        if (pass.isPresent()) {
            return pass.get();
        } else {
            return null;
        }
    }

    @Override
    public void deletePassenger(Integer passID) {
        passengerRepository.deleteById(passID);

    }

    }

